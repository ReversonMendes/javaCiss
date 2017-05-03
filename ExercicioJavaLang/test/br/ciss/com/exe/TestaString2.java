 package br.ciss.com.exe;

public class TestaString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprime("Socorram-me, subi no ônibus em Marrocos");
		imprime("anotaram a data da maratona");
	}

	public static void imprime(String palavra) {
		
		String invertida = "";
		for (int i = palavra.length()-1; i >= 0; i--) {
		    invertida += palavra.charAt(i);
		}
		System.out.println(invertida);

	}

}
