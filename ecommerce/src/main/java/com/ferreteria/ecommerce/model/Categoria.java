package com.ferreteria.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Categoria")
public class Categoria {
    //ATRIBUTOS
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long categoria_id;
    @Column
    private String nombre_categoria;
    @Column
    private String descripcion_categoria;
    @Column
    private String miniatura_categoria;
}
