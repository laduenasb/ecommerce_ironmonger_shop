package com.ferreteria.ecommerce.controller;

import com.ferreteria.ecommerce.dto.ProductoDTO;
import com.ferreteria.ecommerce.model.Producto;
import com.ferreteria.ecommerce.service.CategoriaService;
import com.ferreteria.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "api/v1/producto")
public class ProductoController {
    //ATRIBUTOS
    @Autowired
    private ProductoService productoService;
    @Autowired
    private CategoriaService categoriaService;
    //CONSTRUCTORES

    //	public StudentController(StudentService studentService){
//
//		this.studentService=studentService;
//	}
    //ACCIONES
    @GetMapping("/obtenerProductos")
    public List<Producto> getProducto() {
        return productoService.getProductos();
    }
    @PostMapping("/guardarProducto")
    public Producto guardarProducto(@RequestBody ProductoDTO productoDTO) {
        Producto producto=new Producto();
        producto=productoDTO.obtenerProducto(productoDTO);
        producto.setCategoria(categoriaService.encontrarCategoriaPorID(productoDTO.getCategoria_id()));
        return productoService.guardarProducto(producto);
    }
}
