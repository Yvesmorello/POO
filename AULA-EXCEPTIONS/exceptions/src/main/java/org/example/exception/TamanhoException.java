package org.example.exception;

public class TamanhoException extends RuntimeException {

    public TamanhoException(){
        super("O Cpf não possui 11 caracteres!");
    }
}
