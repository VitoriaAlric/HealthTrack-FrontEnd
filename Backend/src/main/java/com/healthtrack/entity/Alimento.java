package com.healthtrack.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Go code.
 * @version 1.0
 */

public class Alimento implements Serializable {
    private static final long serialVersionUID = 1L;

    private int idAlimento;
    private String descricaoAlimento;
    private double valorQuilo;
    private double valorGrama;
    private Calendar dataConsumo;

    public Alimento(int idAlimento, String descricaoAlimento, double valorQuilo, double valorGrama, Calendar dataConsumo) {
        this.idAlimento = idAlimento;
        this.descricaoAlimento = descricaoAlimento;
        this.valorQuilo = valorQuilo;
        this.valorGrama = valorGrama;
        this.dataConsumo = dataConsumo;
    }

    public Alimento() {
    }

    public int getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(int idAlimento) {
        this.idAlimento = idAlimento;
    }

    public String getDescricaoAlimento() {
        return descricaoAlimento;
    }

    public void setDescricaoAlimento(String descricaoAlimento) {
        this.descricaoAlimento = descricaoAlimento;
    }

    public double getValorQuilo() {
        return valorQuilo;
    }

    public void setValorQuilo(double valorQuilo) {
        this.valorQuilo = valorQuilo;
    }

    public double getValorGrama() {
        return valorGrama;
    }

    public void setValorGrama(double valorGrama) {
        this.valorGrama = valorGrama;
    }

    public Calendar getDataConsumo() {
        return dataConsumo;
    }

    public void setDataConsumo(Calendar dataConsumo) {
        this.dataConsumo = dataConsumo;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Alimento{" +
                "idAlimento=" + idAlimento +
                ", descricaoAlimento='" + descricaoAlimento + '\'' +
                ", valorQuilo=" + valorQuilo +
                ", valorGrama=" + valorGrama + ", dtConsumo =" +
                sdf.format(dataConsumo.getTime()) +
                '}';
    }
}