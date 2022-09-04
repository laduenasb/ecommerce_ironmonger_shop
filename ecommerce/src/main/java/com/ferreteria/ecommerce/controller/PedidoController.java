package com.ferreteria.ecommerce.controller;

import com.ferreteria.ecommerce.model.Pedido;
import com.ferreteria.ecommerce.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;
    @GetMapping("/consultarPedidos")
    public List<Pedido> consultarPedidos(){
        return pedidoService.consultarPedidos();
    }
}
