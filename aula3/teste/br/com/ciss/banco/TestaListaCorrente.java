package br.com.ciss.banco;

import java.util.ArrayList;
import java.util.List;

public class TestaListaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente();
		ContaCorrente c2 = new ContaCorrente();
		
		List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		
		contas.add(c1);
		contas.add(c2);
		
		
	}

}
