package com.ferreteria.ecommerce.repository;

import com.ferreteria.ecommerce.model.Categoria;
import com.ferreteria.ecommerce.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {
    Producto findBySku(String sku);
    List<Producto> findByCategoria(Categoria categoria);
}
