package org.example;

import org.example.exception.CpfException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FormatadorServiceTest {

    //formatador de cpf
    //formatador de telefone
    //formatador de email


    //POSITIVO
    @Test
    public void deveFormatarCpf() throws Exception {

        FormatadorService service = new FormatadorService();

        String resultado = service.formatadorCpf("123.123.123-99");
        Assertions.assertEquals("12312312399", resultado);
    }

    //NEGATIVO
    @Test
    public void deveFormatarCpfComException() {

        FormatadorService service = new FormatadorService();

        CpfException resultado = Assertions.assertThrows(CpfException.class, () -> service.formatadorCpf("123.123.123-9"));
        Assertions.assertEquals("O Cpf informado não possui 11 caracteres!", resultado.getMessage());
    }

    @Test
    public void deveformatarCpfComTratamento() {

        FormatadorService service = new FormatadorService();

        try {
            String resultado = service.formatadorCpf("12312312399");
            Assertions.assertEquals("12312312399", resultado);
        }
        catch (CpfException cp){
            System.out.println(cp.getMessage());
        }
    }
}
