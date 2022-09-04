package com.ferreteria.ecommerce.controller;

import com.ferreteria.ecommerce.model.DetallePedido;
import com.ferreteria.ecommerce.service.DetallePedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/detallePedido")
public class DetallePedidoController {
    @Autowired
    private DetallePedidoService detallePedidoService;
    @GetMapping("/consultarDetalles")
    public List<DetallePedido> consultarDetalles(){
        return detallePedidoService.consultarDetallesPedido();
    }
}
