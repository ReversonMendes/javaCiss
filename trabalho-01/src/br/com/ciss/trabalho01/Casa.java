package br.com.ciss.trabalho01;

/*
 * Classe: Casa 
 * Atributos: cor, totalDePortas, portas[ ] 
 * Métodos: void pinta(String s), 
 * int quantasPortasEstaoAbertas(), 
 * void adicionaPorta(Porta p), 
 * int totalDePortas()

 Crie uma casa, pinte-a. 
 Crie três portas e coloque-as na casa através do método adicionaPorta, 
 abra e feche-as como desejar. 
 Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas abertas e
 o método totalDePortas para imprimir o total de portas em sua casa.*/

public class Casa {
	String cor;
	int totalDePortas;
	Porta[] portas;

	public void pinta(String cor) {
		this.cor = cor;
	}

	public void adicionaPorta(Porta p) {
		for (int i = 0; i < portas.length; i++) {
			if (portas[i] == null) {
				portas[i] = p;
				break;
			}
		}
	}

	public int quantasPortasEstaoAbertas() {
		int qtdAberta = 0;
		for (int i = 0; i < portas.length; i++) {
			if (this.portas[i].estadoPorta == true) {
				qtdAberta++;
			}
		}
		return qtdAberta;
	}

	public void totalDePortas() {
		System.out.println("A casa possui " + portas.length + " portas.");
	}

}

class Porta {
	boolean estadoPorta = false; // Fechado = False, Aberta = True

	public void abre() {
		estadoPorta = true;
	}

	public void fecha() {
		estadoPorta = false;
	}
}