package Entities;

import jakarta.persistence.*;

import java.util.Objects;

@Table(name = "Treino")
@Entity
public class Treino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Integer serie;
    private Integer repeticoes;
    private Character Categoria;

    public Treino() {

    }

    public Treino(Integer id, String nome, Integer serie, Integer repeticoes, Character categoria) {
        this.id = id;
        this.nome = nome;
        this.serie = serie;
        this.repeticoes = repeticoes;
        Categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public Integer getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(Integer repeticoes) {
        this.repeticoes = repeticoes;
    }

    public Character getCategoria() {
        return Categoria;
    }

    public void setCategoria(Character categoria) {
        Categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treino treino = (Treino) o;
        return Objects.equals(id, treino.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Treino{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", serie=" + serie +
                ", repeticoes=" + repeticoes +
                ", Categoria=" + Categoria +
                '}';
    }
}
