package com.distribuidoraH2O.Distribuidorah2o.Repository;

import com.distribuidoraH2O.Distribuidorah2o.Entity.Pedido;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Id> {

}
