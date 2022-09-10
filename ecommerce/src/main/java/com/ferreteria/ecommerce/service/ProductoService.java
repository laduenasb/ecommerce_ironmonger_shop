package com.ferreteria.ecommerce.service;

import com.ferreteria.ecommerce.model.Producto;
import com.ferreteria.ecommerce.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService {
    //ATRIBUTOS
    @Autowired
    private ProductoRepository productoRepository;

//    public StudentService(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }

    //ACCIONES
    public List<Producto> consultarProductos(){
        return productoRepository.findAll();
    }
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }
    public Producto encontrarProductoPorID(Long producto_id) {
        if(!productoRepository.findById(producto_id).isEmpty()) {
            return productoRepository.findById(producto_id).get();
        } else {
            return null;
        }
    }
    public Producto actualizarProducto(Producto producto){
        if(!productoRepository.findById(producto.getProducto_id()).isEmpty()){
            return productoRepository.save(producto);
        } else {
            return null;
        }
    }
    public boolean eliminarProducto(Long producto_id){
        if(!productoRepository.findById(producto_id).isEmpty()){
            productoRepository.deleteById(producto_id);
            return true;
        } else{
            return false;
        }
    }
}
