package com.ferreteria.ecommerce.controller;

import com.ferreteria.ecommerce.dto.DetallePedidoDTO;
import com.ferreteria.ecommerce.model.DetallePedido;
import com.ferreteria.ecommerce.service.DetallePedidoService;
import com.ferreteria.ecommerce.service.PedidoService;
import com.ferreteria.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/detallePedido")
public class DetallePedidoController {
    @Autowired
    private DetallePedidoService detallePedidoService;
    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private ProductoService productoService;
    //CREATE
    @PostMapping("/guardarDetallePedido")
    public DetallePedido guardarDetallePedido(@RequestBody DetallePedidoDTO detallePedidoDTO){
        DetallePedido detallePedido = new DetallePedido();
        detallePedido = detallePedidoDTO.obtenerDetallePedido(detallePedidoDTO);
        detallePedido.setPedido(pedidoService.encontrarPedidoPorId(detallePedidoDTO.getPedido_id()));
        detallePedido.setProducto(productoService.encontrarProductoPorID(detallePedidoDTO.getProducto_id()));
        return detallePedidoService.guardarDetallesPedido(detallePedido);
    }
    //READ
    @GetMapping("/consultarDetallesPedidos")
    public List<DetallePedido> consultarDetallesPedidos(){
        return detallePedidoService.consultarDetallesPedido();
    }
    @GetMapping("/encontrarDetallePedidoPorId/{detalle_pedido_id}")
    public DetallePedido encontrarDetallePedidoPorId(@PathVariable Long detalle_pedido_id){
        return detallePedidoService.consultarDetallePorId(detalle_pedido_id);
    }
    //UPDATE
    @PutMapping("/actualizarDetallePedido")
    public DetallePedido actualizarDetallePedido(@RequestBody DetallePedidoDTO detallePedidoDTO){
        DetallePedido detallePedido = new DetallePedido();
        detallePedido = detallePedidoDTO.obtenerDetallePedido(detallePedidoDTO);
        detallePedido.setPedido(pedidoService.encontrarPedidoPorId(detallePedidoDTO.getPedido_id()));
        detallePedido.setProducto(productoService.encontrarProductoPorID(detallePedidoDTO.getProducto_id()));
        return detallePedidoService.actualizarDetallesPedido(detallePedido);
    }
    //DELETE
    @DeleteMapping("/eliminarDetallePedido/{detalle_pedido_id}")
    public boolean eliminarDetallePedido(@PathVariable Long detalle_pedido_id){
        return detallePedidoService.eliminarPedido(detalle_pedido_id);
    }
}
