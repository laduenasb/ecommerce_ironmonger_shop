package com.ferreteria.ecommerce.repository;

import com.ferreteria.ecommerce.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
    @Query("SELECT c FROM Categoria c WHERE c.nombre_categoria=?1")
    Categoria findByNombre_Categoria(String nombre_categoria);
}
