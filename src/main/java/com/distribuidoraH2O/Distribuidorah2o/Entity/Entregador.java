package com.distribuidoraH2O.Distribuidorah2o.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Entregador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer Id;
    @Column
    private String Nome;
    @Column
    private Boolean Sexo;
    @OneToMany
    private List<Pedido>pedidos;
    @OneToOne
    private Atendente atendente;
    @OneToOne
    private Localizacao localizacao;

    public Entregador() {
    }

    public Entregador(Integer id, String nome, Boolean sexo, List<Pedido> pedidos, Atendente atendente, Localizacao localizacao) {
        Id = id;
        Nome = nome;
        Sexo = sexo;
        this.pedidos = pedidos;
        this.atendente = atendente;
        this.localizacao = localizacao;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Boolean getSexo() {
        return Sexo;
    }

    public void setSexo(Boolean sexo) {
        Sexo = sexo;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }
}
