package br.com.ciss.banco;

public class TestaControleDeBonificacao {

	public static void main(String[] args) {
		
		ControleDeBonificacao controle = new ControleDeBonificacao();
		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(5000);
		controle.registra(funcionario1);

		Funcionario funcionario2 = new Funcionario();
		funcionario2.setSalario(1000);
		controle.registra(funcionario2);

		System.out.println(controle.getTotalDeBonificacao());

	}

}
