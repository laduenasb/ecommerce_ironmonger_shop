package com.ferreteria.ecommerce.dto;

import com.ferreteria.ecommerce.model.DetallePedido;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DetallePedidoDTO {
    private Long detalle_id;
    private Long pedido_id;
    private Long producto_id;
    private double precio;
    private int cantidad;

    public DetallePedido obtenerDetallePedido(DetallePedidoDTO detallePedidoDTO){
        DetallePedido detallePedido = new DetallePedido();
        detallePedido.setDetalle_id(detallePedidoDTO.getDetalle_id());
        detallePedido.setPrecio(detallePedidoDTO.getPrecio());
        detallePedido.setCantidad(detallePedidoDTO.getCantidad());
        return detallePedido;
    }
}
