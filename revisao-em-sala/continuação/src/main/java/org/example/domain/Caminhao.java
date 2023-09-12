package org.example.domain;

public class Caminhao extends Caminhao.Veiculo {

    public Caminhao(String placa, int quantidadeMaximaItens, double consumoKm) {
        super(placa, quantidadeMaximaItens, consumoKm);
    }

    public static class Veiculo {

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
}