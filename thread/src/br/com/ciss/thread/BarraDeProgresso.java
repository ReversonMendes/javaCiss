package br.com.ciss.thread;

public class BarraDeProgresso implements Runnable {
	@Override
	public void run() {
		// mostra a barra de progresso e vai atualizando..
		System.out.println("Rodando a barra.........");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Atualizando........"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
