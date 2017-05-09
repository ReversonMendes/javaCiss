package br.com.ciss.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaOrdenacao {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Sérgio");
		lista.add("Paulo");
		lista.add("Guilherme");
		
		System.out.println(lista);
		
		Collections.sort(lista);
		
		System.out.println(lista);
	}

}
