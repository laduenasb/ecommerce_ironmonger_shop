package com.ferreteria.ecommerce.dto;

import com.ferreteria.ecommerce.model.Producto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductoDTO {
    private Long producto_id;
    private Long categoria_id;
    private double precio;
    private String nombre;
    private double peso;
    private String descripcion;
    private String miniatura;
    private String imagen;
    private String sku;
    private int stock;
    public Producto obtenerProducto(ProductoDTO productoDTO){
        Producto producto = new Producto();
        producto.setProducto_id(productoDTO.getProducto_id());
        producto.setPrecio(productoDTO.getPrecio());
        producto.setNombre(productoDTO.getNombre());
        producto.setPeso(productoDTO.getPeso());
        producto.setDescripcion(productoDTO.getDescripcion());
        producto.setMiniatura(productoDTO.getMiniatura());
        producto.setImagen(productoDTO.getImagen());
        producto.setSku(productoDTO.getSku());
        producto.setStock(productoDTO.getStock());
        return producto;
    }
}
