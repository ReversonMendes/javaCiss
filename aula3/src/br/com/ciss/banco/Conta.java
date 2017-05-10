package br.com.ciss.banco;

public abstract class Conta {
	protected double saldo;
	private int numero;
	private String nome;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente! Tente outro valor");
		} else {
			this.saldo -= valor;
		}

	}

	public double getSaldo() {
		return this.saldo;
	}

	public abstract void atualiza(double taxa);

	public int getNumero() {
		return numero;
	}

	public void setNome(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
