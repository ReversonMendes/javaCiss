package br.ciss.com.exe;

public class TestaReferenciaConta {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(100.0);

		System.out.println(conta);
		System.out.println("Imprimia a referencia do objeto na mem�ria");
		System.out.println("Agora imprime o conte�do do met�do toString");
	}

}
