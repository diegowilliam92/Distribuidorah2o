package com.distribuidoraH2O.Distribuidorah2o.Service;

import com.distribuidoraH2O.Distribuidorah2o.Entity.Cliente;
import com.distribuidoraH2O.Distribuidorah2o.Repository.ClienteRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    // INJEÇÃO DE DEPENDÊNCIA POR MEIO DO CONSTRUTOR COM PARAMETRO.

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


}