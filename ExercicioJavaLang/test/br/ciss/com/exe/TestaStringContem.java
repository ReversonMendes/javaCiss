package br.ciss.com.exe;

public class TestaStringContem {

	public static void main(String[] args) {
		String palavra = "Ciss Mirim";

		if (palavra.contains("Mirim")) {
			System.out.println("Contém");
		} else {
			System.out.println("Não Contém");
		}
	}

}
