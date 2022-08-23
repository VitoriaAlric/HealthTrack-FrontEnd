package com.healthtrack.entity;

import java.io.Serializable;

/**
 * Dados da altura do usuário utilizados no cálculo do IMC
 *
 * @author Go code.
 * @version 1.0
 */

public class Altura implements Serializable {
    private static final long serialVersionUID = 1L;

    private int idAltura;
    private Usuario usuario;
    private double valorAltura;

    public Altura(int idAltura, Usuario usuario, double valorAltura) {
        this.idAltura = idAltura;
        this.usuario = usuario;
        this.valorAltura = valorAltura;
    }

    public Altura() {
    }

    public int getIdAltura() {
        return idAltura;
    }

    public void setIdAltura(int idAltura) {
        this.idAltura = idAltura;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getValorAltura() {
        return valorAltura;
    }

    public void setValorAltura(double valorAltura) {
        this.valorAltura = valorAltura;
    }

    @Override
    public String toString() {
        return "Altura{" +
                "idAltura=" + idAltura +
                ", usuario=" + usuario +
                ", valorAltura=" + valorAltura +
                '}';
    }
}