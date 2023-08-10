package domain;

public class Movimentacao {

    private int quantidadeFaltas;
    private int quantidadeAfastamentos;
    private int quantidadeFerias;

    public Movimentacao(int falta, int afastamento, int ferias){
        this.quantidadeFaltas = falta;
        this.quantidadeAfastamentos = afastamento;
        this.quantidadeFerias = ferias;
    }

    public int getQuantidadeFaltas() {
        return quantidadeFaltas;
    }
    public int getQuantidadeAfastamentos(){
        return quantidadeAfastamentos;
    }
    public int getQuantidadeFerias(){
        return getQuantidadeFerias();
    }
}
