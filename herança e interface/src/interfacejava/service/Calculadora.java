package interfacejava.service;
import java.util.List;
import interfacejava.domain.Produto;

public class Calculadora {

    public double calcularDescontoTotal(List<Produto> produtos){

        double valorTotal=0;

        for(Produto p : produtos){
            valorTotal += p.aplicaValorDesconto();
        }

        return valorTotal;
    }

}
