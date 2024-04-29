package com.distribuidoraH2O.Distribuidorah2o.Entity;

import jakarta.persistence.*;

@Entity
public class Localizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String endereco;
    @OneToOne
    private Cliente cliente;
    @OneToOne
    private Entregador entregador;

    public Localizacao() {
    }

    public Localizacao(Integer id, String endereco, Cliente cliente, Entregador entregador) {
        Id = id;
        this.endereco = endereco;
        this.cliente = cliente;
        this.entregador = entregador;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }
}
