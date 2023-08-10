package domain;
import java.time.LocalDate;

public class Funcionario extends Pessoa{

    private int matricula;
    private Cargo cargo;
    private Movimentacao movimentacao;

    public Funcionario(String nome, int matricula, int idade, Cargo cargo, LocalDate dataNascimento, Movimentacao movimentacao){
        super(nome, idade, dataNascimento);
        this.matricula = matricula;
        this.cargo = cargo;
        this.movimentacao = this.movimentacao;
    }

    public Cargo getCargo(){
        return cargo;
    }

    public double getSalario(){
        return cargo.valorSalario(this.movimentacao);
    }
}
