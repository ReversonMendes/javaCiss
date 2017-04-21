package br.com.ciss.banco;

import java.util.ArrayList;
import java.util.List;

import br.com.ciss.banco.Conta;

public class TestaArrays2 {

	public static void main(String[] args) {

		int[] idades = new int[10];

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * 10;
		}
		
//		for (int i = 0; i < idades.length; i++) {
//			System.out.println(idades[i]);
//		}
		
		for(int x : idades){
			System.out.println(idades[x]);
		}
		
		List<Conta> contas = new ArrayList<>();
		
		//contas.forEach(action);
		
 	}

}
