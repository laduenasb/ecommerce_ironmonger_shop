package com.ferreteria.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Detalles_Pedido")
public class DetallePedido {
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long detalle_id;
    @ManyToOne @JoinColumn(name="pedido_id")
    private Pedido pedido;
    @ManyToOne @JoinColumn(name="producto_id")
    private Producto producto;
    @Column
    private double precio;
    @Column
    private int cantidad;
}
