package org.gabkt.GymApp.Entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;

@Table(name = "pessoa")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Pessoa {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nome;
    private Integer cpf;
    private Integer rg;
    private Instant dataNasc;
    private Integer celular;
    private String endereco;

    public Pessoa() {

    }

    public Pessoa(String nome, Integer cpf, Integer rg, Instant dataNasc, Integer celular, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNasc = dataNasc;
        this.celular = celular;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public Instant getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Instant dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(cpf, pessoa.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", rg=" + rg +
                ", dataNasc=" + dataNasc +
                ", celular=" + celular +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
