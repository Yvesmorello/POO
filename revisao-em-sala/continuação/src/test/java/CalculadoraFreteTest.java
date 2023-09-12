import org.example.domain.Produto;
import org.example.domain.Caminhao;
import org.example.domain.Pedido;
import org.example.service.CalculadoraFrete;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CalculadoraFreteTest {

    @Test
    public void deveCalcularFreteComCaminhao(){

        Produto teclado = new Produto("Teclado Logitech", 84.0, 1);
        Produto foneOuvido = new Produto("Fone de Ouvido", 125.98, 1);

        List<Produto> produtos = List.of(teclado, foneOuvido);

        Pedido pedido = new Pedido(123, produtos);

        Assertions.assertEquals(209.98, pedido.getValor());


        Caminhao caminhao = new Caminhao("A123", 300, 0.5);


        CalculadoraFrete calculadoraFrete = new CalculadoraFrete();

        double valorTotalFrete = calculadoraFrete.CalculaFrete(13.8,caminhao , pedido);
    }
}
