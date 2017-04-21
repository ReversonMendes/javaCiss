package br.com.ciss.trabalho01;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.disciplinas = new Disciplina[3];

		aluno1.setNome("Jhonny Ferreira dos Santos");
		aluno1.setMatricula(8364);

		Disciplina d1 = new Disciplina();
		d1.nome = "Programação Java";
		d1.notas = 5.6;

		Disciplina d2 = new Disciplina();
		d2.nome = "Banco de Dados";
		d2.notas = 7.2;

		Disciplina d3 = new Disciplina();
		d3.nome = "Engenharia de Software";
		d3.notas = 8;

		aluno1.AdicionaDisciplina(d1);
		aluno1.AdicionaDisciplina(d2);
		aluno1.AdicionaDisciplina(d3);

		aluno1.Resultado();
		// ----------------------------------------------
		Aluno aluno2 = new Aluno();
		aluno2.disciplinas = new Disciplina[3];

		aluno2.setNome("Paolo Guerrero de Lima");
		aluno2.setMatricula(8364);

		Disciplina d4 = new Disciplina();
		d4.nome = "Programação Java";
		d4.notas = 5.6;

		Disciplina d5 = new Disciplina();
		d5.nome = "Banco de Dados";
		d5.notas = 3.2;

		Disciplina d6 = new Disciplina();
		d6.nome = "Engenharia de Software";
		d6.notas = 2;

		aluno2.AdicionaDisciplina(d4);
		aluno2.AdicionaDisciplina(d5);
		aluno2.AdicionaDisciplina(d6);

		aluno2.Resultado();
	}

}
