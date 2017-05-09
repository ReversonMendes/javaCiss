package br.com.ciss.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaOrdenacaoContasCorrentes {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente();
		c1.deposita(500);
		
		ContaCorrente c2 = new ContaCorrente();
		c2.deposita(250);
		
		ContaCorrente c3 = new ContaCorrente();
		c3.deposita(100);
		
		List<ContaCorrente> lista = new ArrayList<>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getSaldo());
		}
		
		System.out.println("\n-------------------------\n");
		//qual o critério da ordenação
		Collections.sort(lista);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getSaldo());
		}
		
		
	}

}
