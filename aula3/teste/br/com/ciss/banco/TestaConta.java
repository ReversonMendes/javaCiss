package br.com.ciss.banco;

import br.com.ciss.banco.AtualizadorDeContas;
import br.com.ciss.banco.Conta;
import br.com.ciss.banco.ContaCorrente;
import br.com.ciss.banco.ContaPoupanca;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		cc.deposita(1000);
		cp.deposita(1000);

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		adc.roda(cc);
		adc.roda(cp);

		System.out.println("Saldo Total: " + adc.getSaldoTotal());

	}

}
