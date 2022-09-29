package com.ferreteria.ecommerce.controller;

import com.ferreteria.ecommerce.dto.ProductoDTO;
import com.ferreteria.ecommerce.model.Categoria;
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
    //ACCIONES
    //CREATE
    @PostMapping("/guardarProducto")
    public Producto guardarProducto(@RequestBody ProductoDTO productoDTO) {
        Producto producto=new Producto();
        producto=productoDTO.obtenerProducto(productoDTO);
        producto.setCategoria(categoriaService.encontrarCategoriaPorID(productoDTO.getCategoria_id()));
        return productoService.guardarProducto(producto);
    }
    //READ
    @GetMapping("/obtenerProductos")
    public List<Producto> obtenerProducto() {
        return productoService.consultarProductos();
    }
    @GetMapping("/encontrarProductoPorId/{producto_id}")
    public Producto encontrarProductoPoriD(@PathVariable Long producto_id){
        return productoService.encontrarProductoPorID(producto_id);
    }
    @GetMapping("/encontrarProductoPorSku/{sku}")
    public Producto encontrarProductoPorSku(@PathVariable String sku){
        return productoService.encontrarProductoPorSku(sku);
    }
    @GetMapping("/encontrarProductosPorCategoria/{nombre_categoria}")
    public List<Producto> encontrarProductoPorCategoria(@PathVariable String nombre_categoria){
        return productoService.encontrarProductoPorCategoria(nombre_categoria);
    }
    //UPDATE
    @PutMapping("/actualizarProducto")
    public Producto actualizarProducto(@RequestBody ProductoDTO productoDTO){
        Producto producto=new Producto();
        producto=productoDTO.obtenerProducto(productoDTO);
        producto.setCategoria(categoriaService.encontrarCategoriaPorID(productoDTO.getCategoria_id()));
        return productoService.actualizarProducto(producto);
    }
    //DELETE
    @DeleteMapping("/eliminarProducto/{producto_id}")
    public boolean eliminarProducto(@PathVariable Long producto_id){
        return productoService.eliminarProducto(producto_id);
    }
}
