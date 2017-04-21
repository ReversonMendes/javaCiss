package br.com.ciss.banco;

import br.com.ciss.banco.Conta;
import br.com.ciss.banco.Cliente;

public class testeTrasferencia {

	public static void main(String[] args) {

		Cliente titular1 = new Cliente();
		Cliente titular2 = new Cliente();
		Cliente titular3 = new Cliente();
		
		titular1.nome = "Reverson";
		titular2.nome = "Goku";
		
		Conta c1;
		c1 = new Conta(titular1);
		
		c1.setNumero(13643);
//		c1.setSaldo(1000.0);
		
		System.out.println("Conta numero: "+c1.getNumero()+" Titular: " + c1.getTitular());
		System.out.println("Saldo: " + c1.getSaldo());

		Conta c2;
		c2 = new Conta(titular2);
		
		c2.setNumero(1234);
//		c2.setSaldo(500.0);
		
		System.out.println("Conta numero: "+c2.getNumero()+" Titular: " + c2.getTitular());
		System.out.println("Saldo: " + c2.getSaldo());

		if(c1.transfere(c2, 400.0)){
			System.out.println("Transferência realizada com Sucesso!");
		}else{
			System.out.println("Não foi possivel realizar a Transferência!");
		};
		
		System.out.println("Conta numero: "+c2.getNumero()+" Titular: " + c2.getTitular());
		System.out.println("Saldo: " + c2.getSaldo());
		
		
		Conta novaConta = new Conta(titular3);
		System.out.println(novaConta.getTitular());
		System.out.println(novaConta.getSaldo());
	}

}
