package br.ciss.com.lang;

public class TestaGuardadorDeObjetos {

	public static void main(String[] args) {
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		Conta conta = new Conta();
		guardador.adicionaObjeto(conta);		

		// pega a conta referenciado como objeto
		Object object = guardador.pegaObjeto(0);
		
		//Conta contaResgatada = object;
		
		// será que posso invocar getSaldo em Object? : 
		//object.getSaldo();

	}

}
