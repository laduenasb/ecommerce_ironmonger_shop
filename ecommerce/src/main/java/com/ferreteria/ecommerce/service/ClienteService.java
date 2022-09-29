package com.ferreteria.ecommerce.service;

import com.ferreteria.ecommerce.model.Cliente;
import com.ferreteria.ecommerce.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    public List<Cliente> consultarClientes(){
        return clienteRepository.findAll();
    }
    public Cliente guardarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    public Cliente encontrarClientePorID(Long cliente_id){
        if(!clienteRepository.findById(cliente_id).isEmpty()) {
            return clienteRepository.findById(cliente_id).get();
        } else {
            return null;
        }
    }
    public Cliente actualizarCliente(Cliente cliente){
        if(!clienteRepository.findById(cliente.getCliente_id()).isEmpty()){
            return clienteRepository.save(cliente);
        } else {
            return null;
        }

    }
    public boolean eliminarCliente(Long cliente_id){
        if (!clienteRepository.findById(cliente_id).isEmpty()){
            clienteRepository.deleteById(cliente_id);
            return true;
        } else {
            return false;
        }
    }

    public Cliente encontrarClientePorCedula(String cedula){
        return clienteRepository.findByCedula(cedula);
    }
}
