package br.ciss.com.exe;

public class TestaInteger {

	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);

		// Se testar com == a compara��o n�o ocorre devido a ser um objeto
		// Se testar com equals a compara��o do valor 10 ocorre pois os objetos
		// s�o iguais

		if (x1.equals(x2) /* x1 == x2 */) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}

	}

}
