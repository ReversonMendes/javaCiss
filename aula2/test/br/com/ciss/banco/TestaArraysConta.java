package br.com.ciss.banco;

import br.com.ciss.banco.Conta;

public class TestaArraysConta {

	public static void main(String[] args) {
		// cria um array de contas (10 p)
		Conta[] contas = new Conta[10];

		// for para popular o array de contas (numero e saldo)
		for (int i = 0; i < contas.length; i++) {
			Cliente titular = new Cliente();
			Conta conta = new Conta(titular);
			conta.setNumero(i + 1000);
//			conta.setSaldo(i * 100);
			
			contas[i] = conta;

		}

		
		// for para imprimir o numero e o saldo de cada contA
		for(Conta x : contas){
			System.out.println("Conta Numero: " + x.getNumero());
			System.out.println("Saldo: " + x.getSaldo());
		}

	}

}
