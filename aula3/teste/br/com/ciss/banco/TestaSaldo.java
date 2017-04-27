package br.com.ciss.banco;

public class TestaSaldo {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente();
		cc.deposita(100);
		try {
			cc.saca(150);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println(cc.getSaldo());
		}
		
		
		
		
	}

}
