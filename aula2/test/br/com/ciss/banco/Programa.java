package br.com.ciss.banco;

import br.com.ciss.banco.Conta;
import br.com.ciss.banco.Cliente;
public class Programa {

	public static void main(String[] args) {

		Cliente titular = new Cliente();
		titular.nome = "Reverson";
		
		Conta minhaConta;
		minhaConta = new Conta(titular);
		
		minhaConta.setNumero(13643);
//		minhaConta.setSaldo(1000.0);

		System.out.println("Conta numero: "+minhaConta.getNumero()+" Titular: " + minhaConta.getTitular().nome);
		System.out.println("Saldo: " + minhaConta.getSaldo());

		// Vou sacar 500
		minhaConta.saca(500.0);
		System.out.println("Saldo Atual: " + minhaConta.getSaldo());
		
		boolean saque = minhaConta.saca(4554.0);
		
		if(saque){
			System.out.println("Saque efetuado!");
		}else{
			System.out.println("Não foi possível realizar o saque.\nSaldo insuficiente!");
		}
		
		// Vou depositar 250
		minhaConta.deposita(250.0);
		System.out.println("Saldo Atual: " + minhaConta.getSaldo());
	}

}
