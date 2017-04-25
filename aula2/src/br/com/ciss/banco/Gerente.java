package br.com.ciss.banco;

public class Gerente extends Funcionario implements Autenticavel{
	//Não precisa pois usou o extends(Herança da classe funcionario) os atributos já estão aqui
//	private String nome;
//	private String cpf;
//	private double salario;
	
	private int senha;
	private int numFuncGerenciados;
	
	//métodos
	
	public int getSenha(){
		return senha;
	}
	
	public void setSenha(int senha){
		this.senha = senha;
	}
	
	public int getNumFuncGerenciados(){
		return numFuncGerenciados;
	}
	
	public void setNumFuncGerenciados(int numero){
		this.numFuncGerenciados = numero;
	}
	
	//Reescrito era pra isso que servia não entendi na faculdade kkk
	@Override
	//agora está protegido quando chamar esse metodo do gerente será esse aqui e não do Funcionario
	public double getBonificacao(){
		//Antes não era abstrato
		//return super.getBonificacao() + 1000;
		//Agora é por isso não dá de usar o super melhor fazer a regra nessa classe filha e concreta
		return (this.salario * 0.10) + 1000;
	}
	
	@Override
	public boolean autentica(int senha) {
		if(this.senha != senha){
			return false;
		}
		return true;
	}
	

}
