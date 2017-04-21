package exerciciosLoops;

public class exe7 {
	/*
	 * (opcional) Imprima os primeiros números da série de Fibonacci até passar
	 * de 100. A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21,
	 * etc... (ex: 8 = 5+ 3).
	 */

	public static void main(String[] args) {
		int ultimo = 1;
		int antepenultimo = 0;
		int serie = 0;
	
		while( serie < 100){
			
			serie = antepenultimo + ultimo;
			System.out.println(serie);
			antepenultimo = ultimo;
			ultimo = serie;
		}
	}
}
