package br.com.ciss.banco;

public class ControleDeBonificacao {
	private double totalDeBonificacao = 0;

	public void registra(Funcionario f) {
		this.totalDeBonificacao += f.getBonificacao();
	}

	public double getTotalDeBonificacao() {
		return totalDeBonificacao;
	}
}
