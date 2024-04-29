package com.distribuidoraH2O.Distribuidorah2o.Repository;

import com.distribuidoraH2O.Distribuidorah2o.Entity.Localizacao;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalizacaoRepository extends JpaRepository<Localizacao, Id> {

}
