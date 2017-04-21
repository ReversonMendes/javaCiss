package br.com.ciss.fabrica;

public class TestaCarro {

	public static void main(String[] args) {
		Motor motor10 = new Motor();
		motor10.potencia = 1.0;
		motor10.qtdMarchas = 3;
		
		Motor motor20 = new Motor();
		motor20.potencia = 2.0;
		motor20.qtdMarchas = 5;
		
		Carro fusca;
		fusca = new Carro();
		fusca.cor = "Verde";
		fusca.modelo = "Fusca";
		fusca.velocidadeAtual = 0;
		fusca.velocidadeMaxima = 80;
		fusca.setMotor(motor10);
		
		System.out.println("Carro: "+fusca.modelo);
		
		// liga o carro	
		fusca.liga();

		// acelera o carro
		fusca.acelera(50);
		fusca.acelera(30);
		System.out.println(fusca.velocidadeAtual);
		System.out.println(fusca.pegaMarcha());				
		
		System.out.println("\n----------- \n");
		
		Carro fusion;
		fusion = new Carro();
		fusion.cor = "Preto";
		fusion.modelo = "Fusion";
		fusion.velocidadeAtual = 0;
		fusion.velocidadeMaxima = 200;
		fusion.setMotor(motor20);
		
		System.out.println("Carro: "+fusion.modelo);
		// liga o carro	
		fusion.liga();

		// acelera o carro
		fusion.acelera(50);
		fusion.acelera(50);
		System.out.println(fusion.velocidadeAtual);
		System.out.println(fusion.pegaMarcha());
 
	}
}
