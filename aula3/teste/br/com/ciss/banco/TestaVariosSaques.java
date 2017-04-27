package br.com.ciss.banco;

public class TestaVariosSaques {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente();
		cc.deposita(100);

		Conta cp = new ContaPoupanca();
		cp.deposita(100);

		try {
			cc.saca(150);
			System.out.println("Consegui sacar da conta conta Corrente");
			cp.saca(50);
			System.out.println("Consegui sacar da conta conta Poupança");
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}

	}

}
