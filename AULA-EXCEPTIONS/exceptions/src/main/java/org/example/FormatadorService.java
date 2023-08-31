package org.example;

import org.example.exception.CpfException;
import org.example.exception.TamanhoException;

import java.lang.reflect.Executable;

public class FormatadorService {

    public String formatadorCpf(String cpf){

        if(cpf == null){
            throw new CpfException();
        }

        String cpfFormatado = cpf.replaceAll("\\.|\\-", "");

        if (cpfFormatado.length() != 11) {
            throw new TamanhoException();
        }
        return cpfFormatado;
    }
}
