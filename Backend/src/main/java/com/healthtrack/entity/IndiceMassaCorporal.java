package com.healthtrack.entity;

import java.time.LocalDate;

/**
 * Dados do Indice de Massa corporal do Usuário
 *
 * @author Go code.
 * @version 1.0
 */
public class IndiceMassaCorporal {

    private int idImc;
    private double valorResultadoImc;
    private Peso peso;
    private Altura altura;
    private Usuario usuario;
    private LocalDate DataImc;

    public IndiceMassaCorporal(int idImc, double valorResultadoImc, Peso peso, Altura altura, Usuario usuario, LocalDate dataImc) {
        this.idImc = idImc;
        this.valorResultadoImc = valorResultadoImc;
        this.peso = peso;
        this.altura = altura;
        this.usuario = usuario;
        DataImc = dataImc;
    }

    public IndiceMassaCorporal() {
    }

    public int getIdImc() {
        return idImc;
    }

    public void setIdImc(int idImc) {
        this.idImc = idImc;
    }

    public double getValorResultadoImc() {
        return valorResultadoImc;
    }

    public void setValorResultadoImc(double valorResultadoImc) {
        this.valorResultadoImc = valorResultadoImc;
    }

    public Peso getPeso() {
        return peso;
    }

    public void setPeso(Peso peso) {
        this.peso = peso;
    }

    public Altura getAltura() {
        return altura;
    }

    public void setAltura(Altura altura) {
        this.altura = altura;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getDataImc() {
        return DataImc;
    }

    public void setDataImc(LocalDate dataImc) {
        DataImc = dataImc;
    }

    @Override
    public String toString() {
        return "IndiceMassaCorporal{" +
                "idImc=" + idImc +
                ", valorResultadoImc=" + valorResultadoImc +
                ", peso=" + peso +
                ", altura=" + altura +
                ", usuario=" + usuario +
                ", DataImc=" + DataImc +
                '}';
    }
}