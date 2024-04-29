package com.distribuidoraH2O.Distribuidorah2o.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer Id;
    @Column
    private String nome;
    @Column
    private Boolean Sexo;
    @Column
    private int contato;
    @OneToMany
    private List<Pedido> pedido;
    @OneToOne
    private Atendente atendente;

    public Cliente() {
    }

    public Cliente(Integer id, String nome, Boolean sexo, int contato, List<Pedido> pedido, Atendente atendente) {
        Id = id;
        this.nome = nome;
        Sexo = sexo;
        this.contato = contato;
        this.pedido = pedido;
        this.atendente = atendente;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getSexo() {
        return Sexo;
    }

    public void setSexo(Boolean sexo) {
        Sexo = sexo;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    public List<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(List<Pedido> pedido) {
        this.pedido = pedido;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }


}
