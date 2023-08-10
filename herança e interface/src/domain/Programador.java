package domain;

public class Programador implements Cargo{

    public double valorSalario(Movimentacao movimentacao){

        if(movimentacao.getQuantidadeFaltas() > 0 ||
                movimentacao.getQuantidadeAfastamentos() > 0) {
            return 5000.0 - ((5000.0 / 30) * movimentacao.getQuantidadeFaltas());
        }
        return 5000.0;

    }
}
