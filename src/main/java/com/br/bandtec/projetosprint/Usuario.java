package com.br.bandtec.projetosprint;

import java.util.ArrayList;

public class Usuario extends Pessoa {

    private Integer idUsuario;

    public Usuario(String nickname, String nome, String senha, String email, Integer celular, Double descontoBase, Integer idUsuario) {
        super(nickname, nome, senha, email, celular, descontoBase);
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public Double calcPreco() {
        return getDescontoBase() + 0.07;
        // todos os usuários da plataforma possuem um minimo de 3% de desconto, dado como presente pela
        // plataforma, porém para pagamentos a vista (boleto ou cartão) é adicionado mais um desconto que varia
        // de acordo com o nível do usuário
        // vou listar quais são os descontos padrão de cada usuario:
        // usuario comum: 3% + 7% a vista
        // usuario vip: 8% + 10% a vista
        // funcionario: 10% + 12% a vista
        // cada um destes irá ganhar um bônus de desconto diferente, além do que já tem
    }

    public void logar() {
        // função será implementada em breve
    }

    public void alterarDados() {
        // função será implementada em breve
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                "} " + super.toString();
    }
}

