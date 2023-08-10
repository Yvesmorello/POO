import herancajava.domain.Celular;
import herancajava.domain.Produto;
import herancajava.domain.Teclado;
import herancajava.service.Calculadora;
import interfacejava.domain.ControleAr;
import interfacejava.domain.FoneOuvido;

import java.util.Arrays;
import java.util.List;

public class Main {
    //interface
    public static void main(String[] args) {

            FoneOuvido foneOuvido = new FoneOuvido("Com fio", 85.99);
            ControleAr controleAr = new ControleAr("LG", "branco", 102);

            interfacejava.service.Calculadora calculadora = new interfacejava.service.Calculadora();

            List<interfacejava.domain.Produto> produtos = Arrays.asList(foneOuvido, controleAr);

            double resultado = calculadora.calcularDescontoTotal(produtos);

            System.out.println(resultado);
    }

    //herança
        public static void heranca () {
            Teclado teclado = new Teclado("Logitech", 150.88);
            Celular celular = new Celular("Celular LG", 2500d);

            Calculadora calculadora = new Calculadora();

            List<Produto> produtos = Arrays.asList(teclado, celular);

            double resultado = calculadora.calcularTotal(produtos);

            System.out.println(resultado);

        }

}