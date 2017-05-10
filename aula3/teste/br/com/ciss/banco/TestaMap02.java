package br.com.ciss.banco;

import java.util.HashMap;
import java.util.Map;

public class TestaMap02 {

	public static void main(String[] args) {
		
		//Adicionar no mapa, o nome da pessoa sendo
		//a chave, e o valor da sua idade
		//  Chave, VALOR
		Map<String, String> mapa = new HashMap<>();
		
		//adicionar 5 chaves
//		mapa.put("Reverson", 24);
//		mapa.put("Emerson", 22);
//		mapa.put("Ellen", 18);
//		mapa.put("Maicon", 28);


		mapa.put("Reverson", "reverson@gmail.com");
		mapa.put("Emerson", "emerson@gmail.com");
		mapa.put("Ellen", "ellen@gmail.com");
		mapa.put("Maicon", "maico@gmail.com");
		
		
		//buscar duas chaves e imprimir o valor
//		int idadeDoReverson = (Integer) mapa.get("Reverson");
//		Integer idadeDaEllen =  mapa.get("Ellen");
		
		String emailDoReverson = mapa.get("Reverson");
		String emailDaEllen =  mapa.get("Ellen");

		System.out.println(emailDoReverson);
		System.out.println(emailDaEllen);
		
	}

}
