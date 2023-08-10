package interfacejava.domain;

public class FoneOuvido implements Produto {

    private String modelo;
    private double valor;

    public FoneOuvido(String modelo, double valor){
        this.modelo = modelo;
        this.valor = valor;
    }

    @Override
    public double aplicaValorDesconto() {
        return valor * 0.5;
    }
}
