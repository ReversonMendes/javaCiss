package exerciciosLoops;

public class exe5 {
	/*
	 * No código do exercício anterior, aumente a quantidade de números que
	 * terão os fatoriais impressos, até 20, 30, 40. Em um determinado momento,
	 * além desse cálculo demorar, vai começar a mostrar respostas completamente
	 * erradas. Por quê? Por causa do Limite do tipo primitivo int Mude de int
	 * para long para ver alguma mudança.
	 */

	public static void main(String[] args) {
		for (int n = 1; n <= 30; n++) {
			long fatorial = 1;
			for (int i = 1; i <= n; i++) {
				fatorial = fatorial * i;
			}

			System.out.println("O fatorial de " + n + " é " + fatorial);
		}
	}
}
