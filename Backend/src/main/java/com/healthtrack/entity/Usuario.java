package com.healthtrack.entity;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Dados do usuário para as funções do HealthTrack
 *
 * @author GoCode.
 * @version 1.0
 */

public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;


    private int idUsuario;
    private String nomeUsuario;
    private int idade;
    private LocalDate dataNascimento;
    private String sexo;


    public Usuario(int idUsuario, String nomeUsuario, int idade, LocalDate dataNascimento, String sexo) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                ", idade=" + idade +
                ", dataNascimento=" + dataNascimento +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}