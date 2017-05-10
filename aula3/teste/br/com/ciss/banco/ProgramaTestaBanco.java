package br.com.ciss.banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProgramaTestaBanco {
	static List<Conta> listaContas = new ArrayList<Conta>();
	static Map<String, Conta> mapa = new HashMap<>();
	
	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente();
		cc1.setNome("teste1");
		cc1.deposita(200);
		adiciona(cc1);

		Conta cc2 = new ContaCorrente();
		cc2.setNome("teste2");
		adiciona(cc2);

		Conta cc3 = new ContaCorrente();
		cc3.setNome("teste1");
		cc3.deposita(100);
		adiciona(cc3);

		Conta cc4 = new ContaCorrente();
		cc4.setNome("teste3");
		adiciona(cc4);

		Conta cp1 = new ContaPoupanca();
		cp1.setNome("teste4");
		adiciona(cp1);

		Conta cp2 = new ContaPoupanca();
		cp2.setNome("teste5");
		adiciona(cp2);

		Conta cp3 = new ContaPoupanca();
		cp3.setNome("teste6");
		adiciona(cp3);

		System.out.println("Conta numero ->" + pega(3));
		System.out.println("Total de Contas ->" + pegaQuantidadeDeContas());
		
		Conta conta = new ContaCorrente();
		conta = buscaPorNome("teste1");
		
		System.out.println("Nome da Conta  ->" + conta.getNome());
		System.out.println("Saldo da Conta ->" + conta.getSaldo());

	}

	public static void adiciona(Conta c) {
		listaContas.add(c);
		mapa.put(c.getNome(), c);
	}

	public static Conta pega(int x) {
		return listaContas.get(x);
	}

	public static int pegaQuantidadeDeContas() {
		return listaContas.size();
	}
	
	public static Conta buscaPorNome(String nome){
		return mapa.get(nome);
	}
	
}
