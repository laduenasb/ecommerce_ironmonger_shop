package com.ferreteria.ecommerce.repository;

import com.ferreteria.ecommerce.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    Cliente findByCedula(String cedula);
}
