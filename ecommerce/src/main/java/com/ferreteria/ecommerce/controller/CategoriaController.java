package com.ferreteria.ecommerce.controller;

import com.ferreteria.ecommerce.model.Categoria;
import com.ferreteria.ecommerce.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/categoria")
public class CategoriaController {
    //ATRIBUTOS
    @Autowired
    private CategoriaService categoriaService;

    //ACCIONES
    @GetMapping("/consultarCategorias")
    public List<Categoria> consultarCategorias(){
        return categoriaService.consultarCategorias();
    }

}
