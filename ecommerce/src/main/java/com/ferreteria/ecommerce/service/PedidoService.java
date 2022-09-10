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
    public Pedido guardarPedido(Pedido pedido){
        return pedidoRepository.save(pedido);
    }
    public Pedido encontrarPedidoPorId(Long pedido_id){
        if(!pedidoRepository.findById(pedido_id).isEmpty()) {
            return pedidoRepository.findById(pedido_id).get();
        } else {
            return null;
        }
    }
    public Pedido actualizarPedido(Pedido pedido){
        if(!pedidoRepository.findById(pedido.getPedido_id()).isEmpty()){
            return pedidoRepository.save(pedido);
        } else {
            return null;
        }
    }
    public boolean eliminarPedidoPorID(Long pedido_id){
        if(!pedidoRepository.findById(pedido_id).isEmpty()){
            pedidoRepository.deleteById(pedido_id);
            return true;
        } else {
            return false;
        }
    }
}
