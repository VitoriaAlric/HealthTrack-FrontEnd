package com.healthtrack.entity;

import java.io.Serializable;

public class Cadastro implements Serializable {
    private static final long serialVersionUID = 1L;

    private int idCadastro;
    private String nomeLogin;
    private String email;
    private int senha;

    public Cadastro(int idCadastro, String nomeLogin, String email, int senha, String dsSenha) {
        this.idCadastro = idCadastro;
        this.nomeLogin = nomeLogin;
        this.email = email;
        this.senha = senha;
    }

    public Cadastro() {
    }

    public int getIdCadastro() {
        return idCadastro;
    }

    public void setIdCadastro(int idCadastro) {
        this.idCadastro = idCadastro;
    }

    public String getNomeLogin() {
        return nomeLogin;
    }

    public void setNomeLogin(String nomeLogin) {
        this.nomeLogin = nomeLogin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "idCadastro=" + idCadastro +
                ", nomeLogin='" + nomeLogin + '\'' +
                ", email='" + email + '\'' +
                ", senha=" + senha +
                '}';
    }
}
