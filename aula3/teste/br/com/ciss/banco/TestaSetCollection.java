package br.com.ciss.banco;

import java.util.HashSet;
import java.util.Set;

public class TestaSetCollection {

	public static void main(String[] args) {
		//para não duplica os elementos de uma lista
		Set<String> cargos = new HashSet<>();

		cargos.add("Gerente");
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secretária");
		cargos.add("Funcionário");
		cargos.add("Diretor"); //repetido
		
		for(String s : cargos){
			System.out.println(s);
		}
		
		Set<String> conjunto = new HashSet<>();
		
		conjunto.add("java");
		conjunto.add("vraptor");
		conjunto.add("scala");
		
		for(String s : conjunto){
			System.out.println(s);
		}
		
	}
}
