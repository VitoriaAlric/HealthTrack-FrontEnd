package com.healthtrack.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Dados da pressão do usuário
 *
 * @author GoCode
 * @version 1.0
 */

public class Pressao implements Serializable {
	private static final long serialVersionUID = 1L;


    private int idPressao;
    private double valorPressaoDiastolica;
    private double valorPressaoSistolica;
    private LocalDate dataRegistroPressao;
    private Usuario usuario;

    public Pressao(int idPressao, double valorPressaoDiastolica, double valorPressaoSistolica, LocalDate dataRegistroPressao, Usuario usuario) {
        this.idPressao = idPressao;
        this.valorPressaoDiastolica = valorPressaoDiastolica;
        this.valorPressaoSistolica = valorPressaoSistolica;
        this.dataRegistroPressao = dataRegistroPressao;
        this.usuario = usuario;
    }

    public Pressao() {
    }

    public int getIdPressao() {
        return idPressao;
    }

    public void setIdPressao(int idPressao) {
        this.idPressao = idPressao;
    }

    public double getValorPressaoDiastolica() {
        return valorPressaoDiastolica;
    }

    public void setValorPressaoDiastolica(double valorPressaoDiastolica) {
        this.valorPressaoDiastolica = valorPressaoDiastolica;
    }

    public double getValorPressaoSistolica() {
        return valorPressaoSistolica;
    }

    public void setValorPressaoSistolica(double valorPressaoSistolica) {
        this.valorPressaoSistolica = valorPressaoSistolica;
    }

    public LocalDate getDataRegistroPressao() {
        return dataRegistroPressao;
    }

    public void setDataRegistroPressao(LocalDate dataRegistroPressao) {
        this.dataRegistroPressao = dataRegistroPressao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Pressao{" +
                "idPressao=" + idPressao +
                ", valorPressaoDiastolica=" + valorPressaoDiastolica +
                ", valorPressaoSistolica=" + valorPressaoSistolica +
                ", dataRegistroPressao=" + dataRegistroPressao +
                ", usuario=" + usuario +
                '}';
    }
}