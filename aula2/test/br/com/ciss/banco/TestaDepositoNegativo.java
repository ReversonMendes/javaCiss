package br.com.ciss.banco;

public class TestaDepositoNegativo {
	
	public static void main(String[] args){
		Cliente titular = new Cliente();
		Conta c = new Conta(titular);
		
		c.deposita(-5000);
		System.out.println("+ Depósito: " + c.getSaldo());
	}

}
