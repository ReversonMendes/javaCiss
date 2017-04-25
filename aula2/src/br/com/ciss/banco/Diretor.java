package br.com.ciss.banco;

public class Diretor extends Funcionario implements Autenticavel{
	
	private int senha;
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean autentica(int senha) {
		if(this.getSenha() != senha){
			return false;
		}
		return true;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
