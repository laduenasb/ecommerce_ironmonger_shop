package com.ferreteria.ecommerce.service;

import com.ferreteria.ecommerce.model.Categoria;
import com.ferreteria.ecommerce.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;
    public Categoria encontrarCategoriaPorID(Long categoria_id){
        return categoriaRepository.findById(categoria_id).get();
    }
    public List<Categoria> consultarCategorias(){
        return categoriaRepository.findAll();
    }
}
