package com.ferreteria.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Cliente")
public class Cliente {
    //ATRIBUTOS
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long cliente_id;
    @Column
    private String correo;
    @Column
    private String contrasenia;
    @Column
    private String nombre;
    @Column
    private String apellidos;
    @Column
    private String numero_celular;
    @Column(unique = true)
    private String cedula;
}
