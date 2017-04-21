package br.com.ciss.trabalho01;

public class TesteCasa {

	public static void main(String[] args) {

		Casa casa = new Casa();
		
		casa.portas = new Porta[3];
		
		casa.pinta("Marrom");
	

		for (int i = 0; i < 3; i++) {
			Porta p = new Porta();

			if (i % 2 == 0) {
				p.abre();
			} else {
				p.fecha();
			}

			casa.adicionaPorta(p);
		}
		
		casa.totalDePortas();
		System.out.println(casa.quantasPortasEstaoAbertas()+" portas estão Abertas.");  
		
	}

}
