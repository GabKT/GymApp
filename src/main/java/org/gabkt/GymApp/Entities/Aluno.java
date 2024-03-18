package org.gabkt.GymApp.Entities;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Entity
public class Aluno extends Pessoa {
    @Id
    private String id;
    private String plano;
    private Integer dataPag;
    private String statusPag;
    private String obs;
    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;
    private LocalDate ingresso;
    @OneToOne
    @JoinColumn(name = "ficha_id")
    private Treino ficha;

    public Aluno() {

    }

    public Aluno(String nome, Long cpf, Long rg, LocalDate dataNasc, Long celular, String endereco, String plano, Integer dataPag, String statusPag, String obs, Professor professor, LocalDate ingresso, Treino ficha) {
        super(nome, cpf, rg, dataNasc, celular, endereco);
        this.plano = plano;
        this.dataPag = dataPag;
        this.statusPag = statusPag;
        this.obs = obs;
        this.professor = professor;
        this.ingresso = ingresso;
        this.ficha = ficha;
    }

    public Aluno(RequestAlunoDTO dto) {
        super(dto.nome(), dto.cpf(), dto.rg(), dto.dataNasc(), dto.celular(), dto.endereco());
        this.plano = dto.plano();
        this.dataPag = dto.dataPag();
        this.statusPag = null;
        this.obs = dto.obs();
        this.professor = null;
        this.ingresso = dto.ingresso();
        this.ficha = null;
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

    public LocalDate getIngresso() {
        return ingresso;
    }

    public void setIngresso(LocalDate ingresso) {
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
