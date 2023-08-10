package interfacejava.domain;

public class ControleAr implements Produto{

    private String marca;
    private String cor;
    private double valor;

    public ControleAr(String marca, String cor, double valor){
        this.marca = marca;
        this.cor = cor;
        this.valor = valor;
    }

    @Override
    public double aplicaValorDesconto() {
        if(valor>500){
            return valor * 0.1;
        }

            return valor * 0.07;
    }
}
