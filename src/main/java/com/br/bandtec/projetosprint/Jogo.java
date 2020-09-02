package com.br.bandtec.projetosprint;

public class Jogo {

    private String nome;
    private String categoria;
    private String produtora;
    private Double preco;

    public Jogo(String nome, String categoria, String produtora, Double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.produtora = produtora;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getProdutora() {
        return produtora;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", produtora='" + produtora + '\'' +
                ", preco=" + preco +
                '}';
    }
}

