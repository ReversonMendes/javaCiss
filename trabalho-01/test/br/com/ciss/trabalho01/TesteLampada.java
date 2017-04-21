package br.com.ciss.trabalho01;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada l1 = new Lampada();

		l1.setTipoLampada("Fluorescente");
		l1.setCor("Branca");
		l1.setPotencia(25);
		l1.setLumens(500);
		l1.liga();
		
		l1.mostra();
		
		Lampada l2 = new Lampada();

		l2.setTipoLampada("Incandescentes");
		l2.setCor("Amarela");
		l2.setPotencia(40);
		l2.setLumens(480);
		l2.desliga();
		
		l2.mostra();
	}

}
