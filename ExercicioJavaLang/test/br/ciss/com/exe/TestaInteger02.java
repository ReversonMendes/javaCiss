package br.ciss.com.exe;

public class TestaInteger02 {

	public static void main(String[] args) {
		// rescreve
		Integer x1 = new Integer(10);
		System.out.println(x1.toString());

		int x2 = Integer.parseInt("200");
		System.out.println(x2);

		// Falha
		int x3 = Integer.parseInt("ALFA");
		System.out.println(x3);
	}

}
