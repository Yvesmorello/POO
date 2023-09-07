package org.example;

import java.util.List;

public class Pedido extends Produto {

    private int codigo;
    private List<Produto> itens;

    public Pedido(int codigo, List<Produto> itens, String nome, double valorUnitario) {
        super(nome, valorUnitario);
        this.codigo = codigo;
        this.itens = itens;
    }

    private double getValorUnitario() {
        return 0;
    }

    public List<Produto> getQuantidade(){
        return itens;
     }
}
