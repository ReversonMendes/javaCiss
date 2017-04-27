package br.com.ciss.banco;

public class SaldoInsuficienteException extends Exception{
	SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}
}
