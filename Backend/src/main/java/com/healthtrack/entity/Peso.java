package com.healthtrack.entity;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Go code.
 * @version 1.0
 */

public class Peso implements Serializable {
    private static final long serialVersionUID = 1L;


    private int idPeso;
    private Usuario usuario;
    private LocalDate dataPeso;
    private double valorKilograma;
    private double valorGrama;

    public Peso(int idPeso, Usuario usuario, LocalDate dataPeso, double valorKilograma, double valorGrama) {
        this.idPeso = idPeso;
        this.usuario = usuario;
        this.dataPeso = dataPeso;
        this.valorKilograma = valorKilograma;
        this.valorGrama = valorGrama;
    }

    public Peso() {
    }

    public int getIdPeso() {
        return idPeso;
    }

    public void setIdPeso(int idPeso) {
        this.idPeso = idPeso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getDataPeso() {
        return dataPeso;
    }

    public void setDataPeso(LocalDate dataPeso) {
        this.dataPeso = dataPeso;
    }

    public double getValorKilograma() {
        return valorKilograma;
    }

    public void setValorKilograma(double valorKilograma) {
        this.valorKilograma = valorKilograma;
    }

    public double getValorGrama() {
        return valorGrama;
    }

    public void setValorGrama(double valorGrama) {
        this.valorGrama = valorGrama;
    }

    @Override
    public String toString() {
        return "Peso{" +
                "idPeso=" + idPeso +
                ", usuario=" + usuario +
                ", dataPeso=" + dataPeso +
                ", valorKilograma=" + valorKilograma +
                ", valorGrama=" + valorGrama +
                '}';
    }
}

