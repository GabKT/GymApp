package org.gabkt.GymApp.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "professor")
public class Professor extends Pessoa {
    private String cargo;
    private Double salario;
    private Instant ingresso;
    @JsonIgnore
    @OneToMany(mappedBy = "professor")
    private List<Aluno> alunos;

    public Professor() {

    }

    public Professor(String nome, Long cpf, Long rg, Long dataNasc, Long celular, String endereco, String cargo, Double salario, Instant ingresso) {
        super(nome, cpf, rg, dataNasc, celular, endereco);
        this.cargo = cargo;
        this.salario = salario;
        this.ingresso = ingresso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Instant getIngresso() {
        return ingresso;
    }

    public void setIngresso(Instant ingresso) {
        this.ingresso = ingresso;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return super.toString() + "Professor{" +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", ingresso=" + ingresso +
                ", alunos=" + alunos +
                '}';
    }
}
