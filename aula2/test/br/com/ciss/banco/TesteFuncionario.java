package br.com.ciss.banco;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Teste","programador");
		
		f1.setNome("Reverson");
		f1.setDepartamento("Fabrica de Desenvolvimento");
		f1.setSalario(2000.0);
		f1.setDtAdmissao("01/08/2013");
		f1.setRg("12424535");
		
		f1.recebeAumento(500.0);
		f1.demite("10/05/2017");
		f1.setEstaNaEmpresa(false);
		f1.mostra();
		
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		
		System.out.println("Identificador = "+f1.getIdentificador());
		System.out.println("Identificador = "+f2.getIdentificador());
		System.out.println("Identificador = "+f3.getIdentificador());
	}

}
