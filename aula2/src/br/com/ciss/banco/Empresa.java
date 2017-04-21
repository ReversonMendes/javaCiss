package br.com.ciss.banco;

public class Empresa {

	String nome;
	String cnpj;

	Funcionario[] empregados = new Funcionario[10];

	public boolean adicionaFuncionario(Funcionario f) {
		int i = 0;
		for (; i < empregados.length; i++) {
			if (empregados[i] == null) {
				empregados[i] = f;
				break;
			}
		}

		// Verifica se está cheio ou não
		if (i == empregados.length) {
			return false;
		} else {
			return true;
		}
	}

	void mostraEmpregados() {
		for (int i = 0; i < this.empregados.length; i++) {
			if (this.empregados[i] != null) {
				System.out.println("Funcionário na posição: " + i);
				// empregados[i].mostra();
			}

		}
	}

	boolean contem(Funcionario f) {
		boolean achou = false;
		for (int i = 0; i < empregados.length; i++) {
			if (f == this.empregados[i]) {
				achou = true;
			}
		}
		return achou;
	}

}
