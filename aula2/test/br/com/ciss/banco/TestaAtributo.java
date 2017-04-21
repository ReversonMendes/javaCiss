package br.com.ciss.banco;

public class TestaAtributo {

	public static void main(String[] args) {
		
		Cliente titular = new Cliente();
		
		Conta c1 = new Conta(titular);
		Conta c2 = new Conta(titular);
		Conta c3 = new Conta(titular);
		
		System.out.println(Conta.getTotalDeContas());

	}

}
