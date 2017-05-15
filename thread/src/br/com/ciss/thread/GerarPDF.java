package br.com.ciss.thread;

public class GerarPDF implements Runnable {
	@Override
	public void run() {
		// logica para a geracao de um relatório
		System.out.println("Gerando o PDF.......");
		
		try {
			Thread.sleep(8 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Terminou o  PDF.......");

	}
}
