package org.gabkt.GymApp.Entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;

@Table(name = "associacao")
@Entity
public class Associacao {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String Id;
    @OneToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;
    @OneToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;
    private String statusAssoc;
    private Instant dataAssoc;

    public Associacao() {

    }

    public Associacao(Aluno aluno, Professor professor, String statusAssoc, Instant dataAssoc) {
        this.aluno = aluno;
        this.professor = professor;
        this.statusAssoc = statusAssoc;
        this.dataAssoc = dataAssoc;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getStatusAssoc() {
        return statusAssoc;
    }

    public void setStatusAssoc(String statusAssoc) {
        this.statusAssoc = statusAssoc;
    }

    public Instant getDataAssoc() {
        return dataAssoc;
    }

    public void setDataAssoc(Instant dataAssoc) {
        this.dataAssoc = dataAssoc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Associacao that = (Associacao) o;
        return Objects.equals(Id, that.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    @Override
    public String toString() {
        return "Associacao{" +
                "Id=" + Id +
                ", aluno=" + aluno +
                ", professor=" + professor +
                ", statusAssoc='" + statusAssoc + '\'' +
                ", dataAssoc=" + dataAssoc +
                '}';
    }
}
