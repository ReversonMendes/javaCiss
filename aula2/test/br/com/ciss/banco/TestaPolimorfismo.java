package br.com.ciss.banco;

public class TestaPolimorfismo {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		Funcionario funcionario = gerente;
		
		funcionario.setSalario(5000);
		
		System.out.println(funcionario.getBonificacao());
				
	}

}
