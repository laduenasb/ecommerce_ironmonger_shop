package com.ferreteria.ecommerce.repository;

import com.ferreteria.ecommerce.model.DetallePedido;
import com.ferreteria.ecommerce.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetallePedidoRepository extends JpaRepository<DetallePedido,Long> {
    List<DetallePedido> findByPedido(Pedido pedido);
}
