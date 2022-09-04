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
    public DetallePedido consultarDetallePorId(Long detalle_id){
        return detallePedidoRepository.findById(detalle_id).get();
    }
}
