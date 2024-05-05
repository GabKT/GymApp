package org.gabkt.GymApp.Entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

@Table(name = "pessoa")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private Long cpf;
    private Long rg;
    @Column(name = "datanasc")
    private Instant dataNasc;
    private Long celular;
    private String endereco;

    public Pessoa() {

    }

    public Pessoa(String nome, Long cpf, Long rg, Long dataNasc, Long celular, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNasc = Instant.ofEpochMilli(dataNasc);
        this.celular = celular;
        this.endereco = endereco;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getRg() {
        return rg;
    }

    public void setRg(Long rg) {
        this.rg = rg;
    }

    public Instant getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Instant dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
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
