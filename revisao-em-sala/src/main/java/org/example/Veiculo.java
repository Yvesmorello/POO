package org.example;

public class Veiculo {

    private String placa;
    private int quantidadeMaximaItens;
    private double consumoKm;

    public Veiculo(String placa, int quantidadeMaximaItens, double consumoKm) {
        this.placa = placa;
        this.quantidadeMaximaItens = quantidadeMaximaItens;
        this.consumoKm = consumoKm;
    }

    public String getPlaca() {
        return placa;
    }

    public int getQuantidadeMaximaItens() {
        return quantidadeMaximaItens;
    }

    public double getConsumoKm() {
        return consumoKm;
    }
}


