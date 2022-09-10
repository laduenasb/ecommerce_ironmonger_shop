package com.ferreteria.ecommerce.service;

import com.ferreteria.ecommerce.model.DetallePedido;
import com.ferreteria.ecommerce.repository.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePedidoService {
    @Autowired
    private DetallePedidoRepository detallePedidoRepository;
    public List<DetallePedido> consultarDetallesPedido(){
        return detallePedidoRepository.findAll();
    }
    public DetallePedido guardarDetallesPedido(DetallePedido detallePedido){
        return detallePedidoRepository.save(detallePedido);
    }
    public DetallePedido consultarDetallePorId(Long detalle_id){
        if(!detallePedidoRepository.findById(detalle_id).isEmpty()) {
            return detallePedidoRepository.findById(detalle_id).get();
        } else {
            return null;
        }
    }
    public DetallePedido actualizarDetallesPedido(DetallePedido detallePedido){
        if(!detallePedidoRepository.findById(detallePedido.getDetalle_id()).isEmpty()){
            return detallePedidoRepository.save(detallePedido);
        } else {
            return null;
        }
    }
    public boolean eliminarPedido(Long detallePedido_id){
        if (!detallePedidoRepository.findById(detallePedido_id).isEmpty()){
            detallePedidoRepository.deleteById(detallePedido_id);
            return true;
        } else {
            return false;
        }
    }
}
