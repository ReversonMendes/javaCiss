package br.com.ciss.thread;

public class Programa {

	public static void main(String[] args) {
		GerarPDF geraPDF = new GerarPDF();
		Thread thread = new Thread(geraPDF);
		thread.start();

		BarraDeProgresso barra = new BarraDeProgresso();
		Thread threadBarra = new Thread(barra);
		threadBarra.start();

	}

}
