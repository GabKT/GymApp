package org.gabkt.GymApp.Entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "aluno")
public class Aluno extends Pessoa {
    @Column(name = "datapag")
    private Integer dataPag;
    @Column(name = "statuspag")
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

    public Aluno(String nome, Long cpf, Long rg, Long dataNasc, Long celular, String endereco, Integer dataPag, String statusPag, String obs, Professor professor, Instant ingresso, Treino ficha) {
        super(nome, cpf, rg, dataNasc, celular, endereco);
        this.dataPag = dataPag;
        this.statusPag = statusPag;
        this.obs = obs;
        this.professor = professor;
        this.ingresso = ingresso;
        this.ficha = ficha;
    }

    public Aluno(RequestAlunoDTO dto) {
        super(dto.nome(), dto.cpf(), dto.rg(), dto.datanasc(), dto.celular(), dto.endereco());
        this.dataPag = dto.datapag();
        this.statusPag = null;
        this.obs = dto.obs();
        this.professor = null;
        this.ingresso = Instant.ofEpochMilli(dto.ingresso() - 10800000);
        this.ficha = null;
    }

    public String getStatusPag() {
        return statusPag;
    }

    public void setStatusPag(String statusPag) {
        this.statusPag = statusPag;
    }

    public Integer getDataPag() {
        return dataPag;
    }

    public void setDataPag(Integer dataPag) {
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
                ", dataPag=" + dataPag +
                ", obs='" + obs + '\'' +
                ", professor=" + professor +
                ", ingresso=" + ingresso +
                ", ficha=" + ficha +
                '}';
    }
}
