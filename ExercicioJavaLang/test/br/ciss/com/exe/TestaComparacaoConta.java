package br.ciss.com.exe;

public class TestaComparacaoConta {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		
		c1.setNumero(200);
		c2.setNumero(200);
		
		//==
		if(c1 == c2){
			System.out.println("Igual");
		}else{
			System.out.println("Diferente");
		}
		
		//euqlas
		if(c1.equals(c2)){
			System.out.println("Igual");
		}else{
			System.out.println("Diferente");
		}
	}

}
