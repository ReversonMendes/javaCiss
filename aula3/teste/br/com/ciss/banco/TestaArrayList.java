package br.com.ciss.banco;

import java.util.ArrayList;
import java.util.List;

public class TestaArrayList {

	public static void main(String[] args) {

		Conta c1 = new ContaCorrente();
		c1.deposita(100);
		
		Conta c2 = new ContaCorrente();
		c2.deposita(500);
		
		Conta c3 = new ContaCorrente();
		c3.deposita(1000);

		Conta c4 = new ContaCorrente();
		c4.deposita(1000);
		
		
		List lista = new ArrayList();
		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
		System.out.println(lista.contains(c4));
		System.out.println(lista.size());
		
		lista.remove(c2);

		for (int i = 0; i < lista.size(); i++) {
			//System.out.println(lista.get(i).getClass());
			ContaCorrente cc = (ContaCorrente) lista.get(i);
			System.out.println(cc.getSaldo());
		}
//		List lista = new ArrayList();
//		lista.add("Manoel");
//		lista.add("Pedro");
//		lista.add("MAria");
		

	}

}
