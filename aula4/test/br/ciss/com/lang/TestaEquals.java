package br.ciss.com.lang;

public class TestaEquals {

	public static void main(String[] args) {
		Conta c1 = new Conta(100);
		Conta c2 = new Conta(100);
		
		if(c1.equals(c2)){
			System.out.println("Objetos referenciados são iguais!");
		}else{
			System.out.println("Objetos referenciados são diferentes!");
		}

	}

}
