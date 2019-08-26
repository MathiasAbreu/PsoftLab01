package psoft.ufcg.lab01.entities;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Disciplina {

    private String nome;
    private int id;
    private double nota;

    @JsonCreator
    public Disciplina(String nome, int id, double nota) {

        this.nome = nome;
        this.id = id;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
