package br.com.ciss.banco;

public class TestaCasting {

	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		
		Gerente gerente = (Gerente)funcionario;
		
		Object object = new Conta();
		Gerente gerente1 =  (Gerente) object;
	}

}
