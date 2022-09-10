package com.ferreteria.ecommerce.dto;

import com.ferreteria.ecommerce.model.Pedido;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PedidoDTO {
    private Long pedido_id;
    private Long cliente_id;
    private double precio;
    private String direccion_pedido;
    private Date fecha_pedido;
    private boolean estado_pedido;

    public Pedido obtenerPedido(PedidoDTO pedidoDTO){
        Pedido pedido = new Pedido();
        pedido.setPedido_id(pedidoDTO.getPedido_id());
        pedido.setPrecio(pedidoDTO.getPrecio());
        pedido.setDireccion_pedido(pedidoDTO.getDireccion_pedido());
        pedido.setFecha_pedido(pedidoDTO.getFecha_pedido());
        pedido.setEstado_pedido(pedidoDTO.isEstado_pedido());
        return pedido;
    }

}
