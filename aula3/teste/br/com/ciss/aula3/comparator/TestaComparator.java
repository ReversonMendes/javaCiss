package br.com.ciss.aula3.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaComparator {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();

		lista.add("Sergio");
		lista.add("Paulo");
		lista.add("Guilherme");

		// ComparadorPorTamanho comparador = new ComparadorPorTamanho();

		Collections.sort(lista, (o1, o2) -> Integer.compare(o1.length(), o2.length()));

		System.out.println(lista);

	}

}
