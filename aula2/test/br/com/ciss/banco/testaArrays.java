package br.com.ciss.banco;

public class testaArrays {

	public static void main(String[] args) {
		
		int[] idades = new int[10];
		idades[5] = 10;
		idades[3] = 15;
		idades[0] = 20;
		
		Conta[] contas = new Conta[10];
		Cliente titular = new Cliente();
		
		//Cria uma conta
		Conta conta = new Conta(titular);
		//conta.setSaldo(2000.0);
		
		//adiciona uma conta na posição 0 do array
		contas[0] = conta;
		
		//imprime saldo
		System.out.println(contas[0].getSaldo());
	}

}
