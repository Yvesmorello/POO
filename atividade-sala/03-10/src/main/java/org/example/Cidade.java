package org.example;

import org.example.sevice.TiposEstabelecimento;

public class Cidade {

    private String nome;
    private TiposEstabelecimento tiposEstabelecimento;

    public Cidade(String nome, TiposEstabelecimento tiposEstabelecimento) {
        this.nome = nome;
        this.tiposEstabelecimento = tiposEstabelecimento;
    }

    public String getNome() {
        return nome;
    }

    public TiposEstabelecimento getTiposEstabelecimento() {
        return tiposEstabelecimento;
    }
}
