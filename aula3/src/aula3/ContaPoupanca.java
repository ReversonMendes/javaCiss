package aula3;

public class ContaPoupanca extends Conta {
	private double saldo;

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}
}
