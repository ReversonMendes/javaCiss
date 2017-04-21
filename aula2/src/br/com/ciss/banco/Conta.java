package br.com.ciss.banco;

import br.com.ciss.banco.Cliente;

public class Conta {

	private int numero;
	private double saldo;
	private double limite;
	public Cliente titular;
	private static int totalDeContas;

	public Conta(Cliente titular) {
		System.out.println("Contruindo uma Conta");
		this.titular = titular;
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}

	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}

	// public void setSaldo(double saldo) {
	// this.saldo = saldo;
	// }

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

	public Cliente getTitular() {
		return titular;
	}

	public boolean saca(double quantidade) {
		if (this.saldo < quantidade) {
			return false;
		} else {
			System.out.println("- Saque: " + quantidade);
			this.saldo -= quantidade;
			return true;
		}
	}

	public void deposita(double quantidade) {
		if (quantidade > 0) {
			this.saldo += quantidade;
		} else {
			System.out.println("Impossível depositar valor negativo.");
		}

	}

	public boolean transfere(Conta destino, double valor) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

}
