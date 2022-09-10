package com.ferreteria.ecommerce.controller;

import com.ferreteria.ecommerce.dto.PedidoDTO;
import com.ferreteria.ecommerce.model.Pedido;
import com.ferreteria.ecommerce.service.ClienteService;
import com.ferreteria.ecommerce.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private ClienteService clienteService;
    //CREATE
    @PostMapping("/guardarPedido")
    public Pedido guardarPedido(@RequestBody PedidoDTO pedidoDTO){
        Pedido pedido = new Pedido();
        pedido = pedidoDTO.obtenerPedido(pedidoDTO);
        pedido.setCliente(clienteService.encontrarClientePorID(pedidoDTO.getCliente_id()));
        return pedidoService.guardarPedido(pedido);
    }
    //READ
    @GetMapping("/obtenerPedidos")
    public List<Pedido> consultarPedidos(){
        return pedidoService.consultarPedidos();
    }
    @GetMapping("/encontrarPedidoPorId/{pedido_id}")
    public Pedido encontrarPedidoPorId(@PathVariable Long pedido_id){
        return pedidoService.encontrarPedidoPorId(pedido_id);
    }
    //UPDATE
    @PutMapping("/actualizarPedido")
    public Pedido actualizarPedido(@RequestBody PedidoDTO pedidoDTO){
        Pedido pedido = new Pedido();
        pedido = pedidoDTO.obtenerPedido(pedidoDTO);
        pedido.setCliente(clienteService.encontrarClientePorID(pedidoDTO.getCliente_id()));
        return pedidoService.guardarPedido(pedido);
    }
    //DELETE
    @DeleteMapping("/eliminarPedido/{pedido_id}")
    public boolean eliminarPedido(@PathVariable Long pedido_id){
        return pedidoService.eliminarPedidoPorID(pedido_id);
    }
}
