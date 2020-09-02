package com.br.bandtec.projetosprint;

import java.util.ArrayList;

public class Funcionario extends Pessoa {

    private Integer idFunc;
    private String cargo;

    public Funcionario(Integer id, String nickname, String nome, String senha, String email, Integer celular, Double descontoBase, Integer idFunc, String cargo) {
        super(nickname, nome, senha, email, celular, descontoBase);
        this.idFunc = idFunc;
        this.cargo = cargo;
    }

    public Integer getIdFunc() {
        return idFunc;
    }

    public String getCargo() {
        return cargo;
    }

    public Double calcPreco() {
        return getDescontoBase() + 0.12;
    }

    public void logar() {
        // função será implementada em breve
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "idFunc=" + idFunc +
                ", cargo='" + cargo + '\'' +
                "} " + super.toString();
    }
}
