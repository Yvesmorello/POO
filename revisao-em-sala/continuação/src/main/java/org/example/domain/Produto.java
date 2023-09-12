package org.example.domain;

public class Produto {


    private String nome;
    private double valorUnitario;
    public Integer quantidade;

    public Produto(String nome, double valorUnitario, Integer quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String getNome() {
        return nome;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }
    public Integer getQuantidade(){
        return quantidade;
    }


}