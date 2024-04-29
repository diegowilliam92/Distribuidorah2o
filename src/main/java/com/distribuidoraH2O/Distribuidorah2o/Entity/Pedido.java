package com.distribuidoraH2O.Distribuidorah2o.Entity;

import jakarta.persistence.*;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @OneToOne
    private Cliente cliente;
    @OneToOne
    private Entregador entregador;
    @OneToOne
    private Localizacao localizacao;

    public Pedido() {
    }

    public Pedido(Integer id, Cliente cliente, Entregador entregador, Localizacao localizacao) {
        this.id = id;
        this.cliente = cliente;
        this.entregador = entregador;
        this.localizacao = localizacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }
}
