package com.ferreteria.ecommerce.service;

import com.ferreteria.ecommerce.model.Pedido;
import com.ferreteria.ecommerce.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    public List<Pedido> consultarPedidos(){
        return pedidoRepository.findAll();
    }
    public Pedido consultarPedidoPorId(Long pedido_id){
        return pedidoRepository.findById(pedido_id).get();
    }
}
