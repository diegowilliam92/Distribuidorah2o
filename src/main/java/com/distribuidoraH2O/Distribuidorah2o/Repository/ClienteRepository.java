package com.distribuidoraH2O.Distribuidorah2o.Repository;

import com.distribuidoraH2O.Distribuidorah2o.Entity.Cliente;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Id> {

}
