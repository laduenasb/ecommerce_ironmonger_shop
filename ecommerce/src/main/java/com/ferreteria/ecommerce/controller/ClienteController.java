package com.ferreteria.ecommerce.controller;

import com.ferreteria.ecommerce.model.Cliente;
import com.ferreteria.ecommerce.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/cliente")
public class ClienteController {
    //ATRIBUTOS
    @Autowired
    private ClienteService clienteService;

    //ACCIONES
    @GetMapping("/consultarClientes")
    public List<Cliente> consultarClientes(){
        return clienteService.consultarClientes();
    }
}
