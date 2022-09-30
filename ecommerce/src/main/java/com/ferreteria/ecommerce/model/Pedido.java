package com.ferreteria.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Pedido")
public class Pedido {
    //ATRIBUTOS
    @Id @Column @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pedido_id;
    @ManyToOne @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @Column
    private double precio;
    @Column
    private String direccion_pedido;
    @Column
    private Date fecha_pedido;
    @Column
    private boolean estado_pedido;
}
