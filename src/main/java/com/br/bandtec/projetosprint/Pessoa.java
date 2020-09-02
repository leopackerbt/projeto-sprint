package com.br.bandtec.projetosprint;

import java.util.ArrayList;

public abstract class Pessoa {

    private String nickname;
    private String nome;
    private String senha;
    private String email;
    private Integer celular;
    private ArrayList<Jogo> biblioteca;
    private Double descontoBase;

    public Pessoa(String nickname, String nome, String senha, String email, Integer celular, Double descontoBase) {
        this.nickname = nickname;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.celular = celular;
        this.descontoBase = descontoBase;
    }

    public String getNickname() {
        return nickname;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public Integer getCelular() {
        return celular;
    }

    public Double getDescontoBase() {
        return descontoBase;
    }

    public Double getDescontoVista() {
        return calcPreco();
    }

    public abstract Double calcPreco();

    public abstract void logar();

    @Override
    public String toString() {
        return "Pessoa{" +
                "nickname='" + nickname + '\'' +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                ", celular=" + celular +
                ", biblioteca=" + biblioteca +
                '}';
    }
}
