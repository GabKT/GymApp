package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;
import java.util.List;

@Table(name = "Professor")
@Entity
public class Professor extends Pessoa {
    @Id
    private String id;
    private String cargo;
    private Double salario;
    private Instant ingresso;
    private List<Aluno> alunos;

    public Professor() {

    }

    public Professor(String nome, Integer cpf, Integer rg, Instant dataNasc, Integer celular, String endereco, String cargo, Double salario, Instant ingresso, List<Aluno> alunos) {
        super(nome, cpf, rg, dataNasc, celular, endereco);
        this.cargo = cargo;
        this.salario = salario;
        this.ingresso = ingresso;
        this.alunos = alunos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
