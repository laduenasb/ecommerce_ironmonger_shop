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
    public List<Categoria> consultarCategorias(){
        return categoriaRepository.findAll();
    }
    public Categoria guardarCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
    public Categoria encontrarCategoriaPorID(Long categoria_id){
        if(!categoriaRepository.findById(categoria_id).isEmpty()) {
            return categoriaRepository.findById(categoria_id).get();
        } else {
            return null;
        }
    }
    public Categoria actualizarCategoria(Categoria categoria){
        if(!categoriaRepository.findById(categoria.getCategoria_id()).isEmpty()){
            return categoriaRepository.save(categoria);
        } else {
            return null;
        }
    }
    public boolean eliminarCategoria(Long categoria_id){
        if(!categoriaRepository.findById(categoria_id).isEmpty()){
            categoriaRepository.deleteById(categoria_id);
            return true;
        } else {
            return false;
        }
    }
}
