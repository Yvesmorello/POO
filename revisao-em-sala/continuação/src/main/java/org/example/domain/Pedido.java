package org.example.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Pedido {

    private int codigo;
    private List<Produto> itens;

    public Pedido(int codigo, List<Produto> itens) {
        this.codigo = codigo;
        this.itens = itens;
    }

   public Double getValor() {

        double valor=0;
        for(Produto p : itens){
            valor += p.getValorUnitario()* p.getQuantidade();
        }

       BigDecimal decimal = BigDecimal.valueOf(valor)
               .setScale(2, RoundingMode.HALF_DOWN);

        return defineQuantidadeCasasDecimais(valor, 2, RoundingMode.HALF_DOWN);
    }

    public Integer getQuantidade() {

        Integer quantidadeTotal = 0;

        for (Produto p : itens) {
            quantidadeTotal += p.getQuantidade();
        }
        return quantidadeTotal;
    }

    private double defineQuantidadeCasasDecimais(double valor, Integer quantidadeCasasDecimais,
                                                 RoundingMode modoArredondamento){
       return BigDecimal.valueOf(valor).
               setScale(quantidadeCasasDecimais, modoArredondamento)
               .doubleValue();

    }
}