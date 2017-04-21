package br.com.ciss.banco;

public class TestaConstrutor {
	public static void main(String[] args) {
		Cliente titular1 = new Cliente();
		Cliente titular2 = new Cliente();
		
		Conta c1 = new Conta(titular1);
		Conta c2 = new Conta(titular2);
	}
}
