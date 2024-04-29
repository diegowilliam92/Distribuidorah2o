package com.distribuidoraH2O.Distribuidorah2o.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Atendente {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column
        private Integer Id;
        @Column
        private String Nome;
        @Column
        private Boolean Sexo;
        @OneToMany
        private List<Cliente> cliente;
        @OneToMany
        private List<Entregador>entregador;


    public Atendente() {
    }

    public Atendente(Integer id, String nome, Boolean sexo, List<Cliente> cliente, List<Entregador> entregador) {
        Id = id;
        Nome = nome;
        Sexo = sexo;
        this.cliente = cliente;
        this.entregador = entregador;
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

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    public List<Entregador> getEntregador() {
        return entregador;
    }

    public void setEntregador(List<Entregador> entregador) {
        this.entregador = entregador;
    }
}
