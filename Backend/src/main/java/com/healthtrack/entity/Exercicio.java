package com.healthtrack.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Go code.
 * @version 1.0
 */

public class Exercicio implements Serializable {
    private static final long serialVersionUID = 1L;

    private int idExercicio;
    private String nomeExercicio;
    private String tipoExercicio;
    private int repeticoes;
    private int passos;
    private double calorias;
    private Date duracao;

    public Exercicio(int idExercicio, String nomeExercicio, String tipoExercicio, int repeticoes, int passos, double calorias, Date duracao) {
        this.idExercicio = idExercicio;
        this.nomeExercicio = nomeExercicio;
        this.tipoExercicio = tipoExercicio;
        this.repeticoes = repeticoes;
        this.passos = passos;
        this.calorias = calorias;
        this.duracao = duracao;
    }

    public Exercicio() {
    }

    public int getIdExercicio() {
        return idExercicio;
    }

    public void setIdExercicio(int idExercicio) {
        this.idExercicio = idExercicio;
    }

    public String getNomeExercicio() {
        return nomeExercicio;
    }

    public void setNomeExercicio(String nomeExercicio) {
        this.nomeExercicio = nomeExercicio;
    }

    public String getTipoExercicio() {
        return tipoExercicio;
    }

    public void setTipoExercicio(String tipoExercicio) {
        this.tipoExercicio = tipoExercicio;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public int getPassos() {
        return passos;
    }

    public void setPassos(int passos) {
        this.passos = passos;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public Date getDuracao() {
        return duracao;
    }

    public void setDuracao(Date duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Exercicio{" +
                "idExercicio=" + idExercicio +
                ", nomeExercicio='" + nomeExercicio + '\'' +
                ", tipoExercicio='" + tipoExercicio + '\'' +
                ", repeticoes=" + repeticoes +
                ", passos=" + passos +
                ", calorias=" + calorias +
                ", duracao=" + duracao +
                '}';
    }
}