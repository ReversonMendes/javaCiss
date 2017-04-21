package br.com.ciss.banco;

import br.com.ciss.banco.Conta;

public class TesteReferencia {

	public static void main(String[] args) {
		Cliente titular1 = new Cliente();
		Conta c1 = new Conta(titular1);
		//c1.setDono("Dono 01");
//		c1.setSaldo(1000.0);
		
		//Conta c2 = c1;
		Cliente titular2 = new Cliente();
		Conta c2 = new Conta(titular2);
		//c2.setDono("Dono 02");
//		c2.setSaldo(300.0);
		
		if (c1 == c2){
			System.out.println("São iguais");
		}else{
			System.out.println("São diferentes");
		}
		
			
		
		System.out.println("Saldo c1: "+ c1.getSaldo());
		System.out.println("Saldo c2: "+ c2.getSaldo());
	}

}
