package domain;

public class Analista implements Cargo{

    public double valorSalario(Movimentacao movimentacao){

        if(movimentacao.getQuantidadeFerias() > 15){
            return 4500.0;
        }
        return 4500.0;
    }


}
