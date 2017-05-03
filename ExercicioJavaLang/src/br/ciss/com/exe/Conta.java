package br.ciss.com.exe;

public abstract class Conta {
	private int numero;
	protected double saldo;
	private double limite;
	private static int totalDeContas;

	// contrutor
	public Conta() {
		Conta.totalDeContas++;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo + limite;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public static int getTotalDecontas() {
		return Conta.totalDeContas;
	}

	public void saca(double quantidade) throws SaldoInsuficienteException {
		// System.out.println("Solicitação de saque. -> \n- Valor do Saque: "+
		// quantidade);
		if (this.saldo < quantidade) {
			throw new SaldoInsuficienteException("Saldo insuficiente tente outro valor !");
		} else {
			this.saldo -= quantidade;
		}
	}

	public void deposita(double quantidade) {
		if (quantidade <= 0) {
			System.out.println("Não aceita deposito negativo.");
		} else {
			System.out.println("+ Depósito: " + quantidade);
			this.saldo += quantidade;
		}
	}

	boolean transfere(Conta contaDestino, double valor) {

		try {
			this.saca(valor);
		} catch (SaldoInsuficienteException erro) {
			System.out.println("Saldo insuficiente.");
		}

		// contaDestino.deposita(valor);
		return true;
	}

	public abstract void atualiza(double taxa);

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Esse objeto � uma conta com saldo R$" + this.saldo;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero;
	}
}
