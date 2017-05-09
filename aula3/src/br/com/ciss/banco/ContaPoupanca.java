package br.com.ciss.banco;

public class ContaPoupanca extends Conta  implements Comparable<ContaPoupanca>{
	private double saldo;

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public int compareTo(ContaPoupanca outra) {
		if (this.getNumero() < outra.getNumero()) {
			return -1;
		}

		if (this.getNumero() > outra.getNumero()) {
			return 1;
		}

		return 0;
	}
}
