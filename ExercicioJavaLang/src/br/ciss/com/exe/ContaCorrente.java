package br.ciss.com.exe;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente() {

	}

	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}
