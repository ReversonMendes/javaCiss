package br.com.ciss.banco;

public class SistemaInterno {

	void login(Autenticavel a) {
		
		//int senha pegar a senha de um scanner...
		int senha = 1234;
		
		boolean ok = a.autentica(senha);
		
		if(ok){
			System.out.println("Logado no sistema");
		}else{
			System.out.println("Erro no Login");
		}
	}
}
