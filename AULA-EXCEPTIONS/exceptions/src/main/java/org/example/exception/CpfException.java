package org.example.exception;

public class CpfException  extends RuntimeException{

    public CpfException(){
        super("O Cpf não foi informado!");

    }

}
