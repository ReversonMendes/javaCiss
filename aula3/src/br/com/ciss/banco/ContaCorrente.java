package br.com.ciss.banco;

public class ContaCorrente extends Conta implements Tributavel{
	private double saldo;

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}
	
	@Override
	public double calculaTributos() {
		// TODO Auto-generated method stub
		return this.saldo * 0.01;
	}
}
