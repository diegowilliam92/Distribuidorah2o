package com.distribuidoraH2O.Distribuidorah2o.Repository;

import com.distribuidoraH2O.Distribuidorah2o.Entity.Atendente;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendenteRepository extends JpaRepository<Atendente, Id> {

}
