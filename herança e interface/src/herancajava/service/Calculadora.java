package herancajava.service;
import herancajava.domain.Produto;
import  java.util.List;

public class Calculadora{

    public double calcularTotal(List<Produto> produtos) {
        double valorTotal = 0;

//        for (int i = 0; i < produtos.size(); i++) {
//            valorTotal += produtos.get(i).getValor();
//        }

        for(Produto p : produtos){
            valorTotal += p.getValor();
        }
        return valorTotal;

    }


}



