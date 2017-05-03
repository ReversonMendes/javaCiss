package br.ciss.com.exe;

public class TestaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprime("ciss-mirim");
	}

	public static void imprime(String palavra) {
		for (int i = 0; i < palavra.length(); i++) {
			char letra = palavra.charAt(i);
			System.out.println(letra);
		}
	}

}
