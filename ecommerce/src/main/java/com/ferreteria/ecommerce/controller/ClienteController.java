package com.ferreteria.ecommerce.controller;

import com.ferreteria.ecommerce.model.Cliente;
import com.ferreteria.ecommerce.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/cliente")
public class ClienteController {
    //ATRIBUTOS
    @Autowired
    private ClienteService clienteService;

    //ACCIONES
    //CREATE
    @PostMapping("/guardarCliente")
    public Cliente guardarCliente(@RequestBody Cliente cliente){
        return clienteService.guardarCliente(cliente);
    }
    //READ
    @GetMapping("/consultarClientes")
    public List<Cliente> consultarClientes(){
        return clienteService.consultarClientes();
    }
    @GetMapping("/obtenerClientePorId/{cliente_id}")
    public Cliente obtenerClientePorId(@PathVariable Long cliente_id){
        return clienteService.encontrarClientePorID(cliente_id);
    }
    @GetMapping("/obtenerClientePorCedula/{cedula}")
    public Cliente obtenerClientePorCedula(@PathVariable String cedula){
        return clienteService.encontrarClientePorCedula(cedula);
    }
    //UPDATE
    @PutMapping("/actualizarCliente")
    public Cliente actualizarCliente(@RequestBody Cliente cliente){
        return clienteService.actualizarCliente(cliente);
    }
    //DELETE
    @DeleteMapping("/eliminarCliente/{cliente_id}")
    public boolean eliminarCliente(@PathVariable Long cliente_id){
        return clienteService.eliminarCliente(cliente_id);
    }
}
