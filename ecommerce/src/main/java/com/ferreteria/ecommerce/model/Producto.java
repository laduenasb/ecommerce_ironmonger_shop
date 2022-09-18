package com.ferreteria.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Producto")
public class Producto {
    //ATRIBUTOS
    @Id @Column @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long producto_id;
    @ManyToOne @JoinColumn(name="categoria_id")
    private Categoria categoria;
    @Column
    private double precio;
    @Column
    private String nombre;
    @Column
    private double peso;
    @Column
    private String descripcion;
    @Column
    private String miniatura;
    @Column
    private String imagen;
    @Column(unique = true)
    private String sku;
    @Column
    private int stock;
    //CONSTRUCTORES

}
