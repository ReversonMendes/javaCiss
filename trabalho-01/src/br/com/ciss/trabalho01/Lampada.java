package br.com.ciss.trabalho01;

/*Cria uma classe para representar uma lâmpada. 
 * A classe deve conter os métodos para ligar e desligar a lâmpada.*/

public class Lampada {
	private String tipoLampada;
	private boolean estado;
	private int lumens;
	private int potencia; // watts
	private String cor;

	public void setTipoLampada(String tipoLampada) {
		this.tipoLampada = tipoLampada;
	}

	public void setLumens(int lumens) {
		this.lumens = lumens;
	}

	public void setPotencia(int pontencia) {
		this.potencia = pontencia;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void liga() {
		this.estado = true;
	}

	public void desliga() {
		this.estado = false;
	}

	public void mostra() {
		System.out.println("Tipo:" + this.tipoLampada);
		System.out.println("Cor:" + this.cor);
		System.out.println("Potência(Watts):" + this.potencia);
		System.out.println("Quantidade Lúmens:" + this.lumens);
		if (this.estado) {
			System.out.println("A lampada está Ligada!");
		} else {
			System.out.println("A lampada está Desigada!");
		}
		System.out.println("\n");
	}
}
