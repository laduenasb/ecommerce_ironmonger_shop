package com.ferreteria.ecommerce.controller;

import com.ferreteria.ecommerce.model.Categoria;
import com.ferreteria.ecommerce.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/categoria")
public class CategoriaController {
    //ATRIBUTOS
    @Autowired
    private CategoriaService categoriaService;

    //ACCIONES
    //CREATE
    @PostMapping("/guardarCategorias")
    public Categoria guardarCategorias(@RequestBody Categoria categoria){
        return categoriaService.guardarCategoria(categoria);
    }
    //READ
    @GetMapping("/consultarCategorias")
    public List<Categoria> consultarCategorias(){
        return categoriaService.consultarCategorias();
    }
    @GetMapping("/obtenerCategoriaPorId/{categoria_id}")
    public Categoria obtenerCategoriaPorId(@PathVariable Long categoria_id){
        return categoriaService.encontrarCategoriaPorID(categoria_id);
    }
    //UPDATE
    @PutMapping("/actualizarCategoria")
    public Categoria actualizarCategoria(@RequestBody Categoria categoria){
        return categoriaService.actualizarCategoria(categoria);
    }
    //DELETE
    @DeleteMapping("/eliminarCategoria/{categoria_id}")
    public boolean eliminarCategoria(@PathVariable Long categoria_id){
        return categoriaService.eliminarCategoria(categoria_id);
    }

}
