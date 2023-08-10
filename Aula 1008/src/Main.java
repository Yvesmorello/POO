import domain.Funcionario;
import domain.Gerente;
import domain.Movimentacao;
import domain.Programador;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Funcionario Joao = new Funcionario("João", 33, 1555, new Programador(), LocalDate.of(1989,8,29), new Movimentacao(1,1,1));
        Funcionario henrique = new Funcionario("Henrique",33, 1555, new Programador(), LocalDate.of(1989,8,29), new Movimentacao(1, 1, 1));
        Funcionario Maria = new Funcionario("Maria", 20, 1999, new Gerente(), LocalDate.of(2000,5,29), new Movimentacao(1, 1, 1));


        System.out.println(henrique.getNome());
        System.out.println(henrique.getCargo().valorSalario(new Movimentacao(1,1,1)));
    }
}