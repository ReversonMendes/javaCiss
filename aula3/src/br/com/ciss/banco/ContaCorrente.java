package br.com.ciss.banco;

public class ContaCorrente extends Conta implements Tributavel, Comparable<ContaCorrente> {
	private double saldo;

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	@Override
	public double calculaTributos() {
		return this.saldo * 0.01;
	}

	@Override
	public int compareTo(ContaCorrente outra) {
		if (this.saldo < outra.getSaldo()) {
			return -1;
		}

		if (this.saldo > outra.getSaldo()) {
			return 1;
		}

		return 0;
	}

}
