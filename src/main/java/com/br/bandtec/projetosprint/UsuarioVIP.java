package com.br.bandtec.projetosprint;

import java.util.ArrayList;

public class UsuarioVIP extends Usuario {

    public UsuarioVIP(String nickname, String nome, String senha, String email, Integer celular, Double descontoBase, Integer idUsuario) {
        super(nickname, nome, senha, email, celular, descontoBase, idUsuario);
    }

    @Override
    public Double calcPreco() {
        return getDescontoBase() + 0.10;
    }

    @Override
    public void logar() {
        // função será implementada em breve
    }

    @Override
    public void alterarDados() {
        // função será implementada em breve
    }

    @Override
    public String toString() {
        return "UsuarioVIP{} " + super.toString();
    }
}
