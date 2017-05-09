package br.com.ciss.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestaOrdenacaoContasPoupanca {

	public static void main(String[] args) {
		
		ContaPoupanca c1 = new ContaPoupanca();
		c1.setNumero(1973);
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNumero(1462);
		
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setNumero(1854);
		
		List<ContaPoupanca> lista = new LinkedList<>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getNumero());
		}
		
		System.out.println("\n-------------------------\n");
		//qual o critério da ordenação
		Collections.sort(lista);
		
		//Reverter
		Collections.reverse(lista);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getNumero());
		}
		
		
	}

}
