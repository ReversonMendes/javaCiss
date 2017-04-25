package br.com.ciss.banco;

public class TestaSistemaInterno {

	public static void main(String[] args) {
		SistemaInterno si = new SistemaInterno();
		
		Funcionario f = new Gerente();
		
		Gerente gerente = new Gerente();
		gerente.setSenha(1234);
		
		Diretor diretor = new Diretor();
		diretor.setSenha(1234);
		
		si.login(gerente);
		si.login(diretor);
		
	}

}
