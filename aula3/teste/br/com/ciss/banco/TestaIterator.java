package br.com.ciss.banco;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestaIterator {

	public static void main(String[] args) {
		Set<String> conjunto = new HashSet<>();
		
		conjunto.add("Item 1");
		conjunto.add("Item 2");
		conjunto.add("Item 3");
		
		//pega o iterator
		Iterator<String> iterator = conjunto.iterator();
		
		while (iterator.hasNext()) {
			String palavra  = iterator.next();
			System.out.println(palavra);
			
		}
	}

}
