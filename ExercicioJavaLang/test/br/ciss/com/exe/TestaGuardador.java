package br.ciss.com.exe;

public class TestaGuardador {

	public static void main(String[] args) {
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		
		ContaCorrente cc = new ContaCorrente();
		guardador.adicionaObjeto(cc);
		
		ContaPoupanca cp  = (ContaPoupanca) guardador.pegaObjeto(0);
		//"Exceção do ClassCastException"
	}

}
