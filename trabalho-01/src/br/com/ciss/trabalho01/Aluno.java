package br.com.ciss.trabalho01;

/*Considere um programa escolar para gerenciar os alunos de uma escola, suas disciplinas e  suas notas.

Modele a classe Aluno: a classe deve conter os atributos relacionados às características de um aluno como 
nome, número da matrícula, curso que está matriculado, disciplinas e as notas de cada disciplina. 
Desenvolver um método para saber se o aluno está aprovado (nota maior ou igual a 7) em uma determinada disciplina.
Crie um aluno, atribua um nome e número da matrícula. Adicione 3 disciplinas para o aluno (adicione também as notas de cada disciplina). 
Imprima se o aluno está aprovado em uma disciplina qualquer.*/

public class Aluno {
	private String nome;
	private int matricula;
	private String curso;
	Disciplina[] disciplinas;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void AdicionaDisciplina(Disciplina d) {
		for (int i = 0; i < disciplinas.length; i++) {
			if (disciplinas[i] == null) {
				// Calcula se está aprovado
				if (d.notas >= 7) {
					d.aprovado = true;
				}

				disciplinas[i] = d;
				break;
			}
		}
	}

	public void Resultado() {
		int aprovacao = 0;
		String disciplinasAprovadas="";
		for (int i = 0; i < disciplinas.length; i++) {
			if (disciplinas[i].aprovado) {
				disciplinasAprovadas += disciplinas[i].nome + "\n";
				aprovacao++;
			}
		}

		if (aprovacao == 0) {
			System.out.println("O aluno nome: " + this.nome + " não foi aprovado em qualquer disciplina!");
		}else{
			System.out.println("O aluno nome: " + this.nome + " está aprovado na(s) disciplina(s):\n");
			System.out.println(disciplinasAprovadas);
		}
	}
}

class Disciplina {
	boolean aprovado = false;
	String nome;
	double notas;
}
