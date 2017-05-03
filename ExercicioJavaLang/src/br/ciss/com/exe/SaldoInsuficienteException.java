package br.ciss.com.exe;

public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }
}
