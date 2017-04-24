package br.com.ciss.banco;

public class TestaEmpresa {

	public static void main(String[] args) {

		Funcionario f1 = new Gerente();
		Funcionario f2 = new Gerente();
		Empresa empresa = new Empresa();
		
		f1.setNome("Reverson");
		f1.setDepartamento("Fabrica de Desenvolvimento");
		f1.setSalario(2000.0);
		f1.setDtAdmissao("01/08/2013");
		f1.setRg("12424535");

		f1.recebeAumento(500.0);
		f1.demite("10/05/2017");
		f1.setEstaNaEmpresa(false);
	//	f1.mostra();

		f2.setNome("Reverson");
		f2.setDepartamento("Fabrica de Desenvolvimento");
		f2.setSalario(2000.0);
		f2.setDtAdmissao("01/08/2013");
		f2.setRg("12424535");

		f2.recebeAumento(500.0);
		f2.demite("10/05/2017");
		f2.setEstaNaEmpresa(false);
		//f2.mostra();
		
		//empresa.adicionaFuncionario(f1);
		//empresa.adicionaFuncionario(f2);
		
		for (int i = 0; i < 200; i++) {
			Funcionario f = new Gerente();
			f.setSalario(1000 + i * 100);
			if (!empresa.adicionaFuncionario(f)){
				System.out.println("Está cheio");
				break;
			};
		}
		//empresa.empregados[5] = null;
		
		empresa.mostraEmpregados();

	}

}
