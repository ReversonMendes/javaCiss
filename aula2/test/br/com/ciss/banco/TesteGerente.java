package br.com.ciss.banco;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		//Posso chamar os métodos da Classe funcionario
		g1.setNome("João");
		
		//e tambem da Classe Gerente
		g1.setSenha(23);
		g1.setNumFuncGerenciados(5);
		g1.setSalario(5000.0);
		
		System.out.println("G:" + g1.getBonificacao());
		
		
		Funcionario f = new Gerente();
		f.setSalario(5000);
		System.out.println("F:" + f.getBonificacao());
		
		Autenticavel a = new Gerente();
		
		a.autentica(2345);
		
	}

}
