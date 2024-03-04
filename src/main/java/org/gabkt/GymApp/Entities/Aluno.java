package org.gabkt.GymApp.Entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Aluno extends Pessoa {
    @Id
    private String id;
    private String plano;
    private Instant dataPag;
    private String statusPag;
    private String obs;
    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;
    private Instant ingresso;
    @OneToOne
    @JoinColumn(name = "ficha_id")
    private Treino ficha;

    public Aluno() {

    }

    public Aluno(String nome, Integer cpf, Integer rg, Instant dataNasc, Integer celular, String endereco, String plano, Instant dataPag, String statusPag, String obs, Professor professor, Instant ingresso, Treino ficha) {
        super(nome, cpf, rg, dataNasc, celular, endereco);
        this.plano = plano;
        this.dataPag = dataPag;
        this.statusPag = statusPag;
        this.obs = obs;
        this.professor = professor;
        this.ingresso = ingresso;
        this.ficha = ficha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatusPag() {
        return statusPag;
    }

    public void setStatusPag(String statusPag) {
        this.statusPag = statusPag;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public Instant getDataPag() {
        return dataPag;
    }

    public void setDataPag(Instant dataPag) {
        this.dataPag = dataPag;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Instant getIngresso() {
        return ingresso;
    }

    public void setIngresso(Instant ingresso) {
        this.ingresso = ingresso;
    }

    public Treino getFicha() {
        return ficha;
    }

    public void setFicha(Treino ficha) {
        this.ficha = ficha;
    }

    @Override
    public String toString() {
        return super.toString() + "Aluno{" +
                "plano='" + plano + '\'' +
                ", dataPag=" + dataPag +
                ", obs='" + obs + '\'' +
                ", professor=" + professor +
                ", ingresso=" + ingresso +
                ", ficha=" + ficha +
                '}';
    }
}
