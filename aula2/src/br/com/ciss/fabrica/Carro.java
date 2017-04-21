package br.com.ciss.fabrica;

public class Carro {
	public String cor;
	public String modelo;
	public double velocidadeAtual;
	public double velocidadeMaxima;
	public Motor motor; 
	
	// liga o carro
	public void liga() {
		System.out.println("O carro está ligado");
	}

	// acelera uma certa quantidade
	public void acelera(double quantidade) {
		double potencia;
		potencia = this.getMotor().potencia;
		
		double velocidadeNova = this.velocidadeAtual += (quantidade + (quantidade * (potencia /100)));
		this.velocidadeAtual = velocidadeNova;
	}

	// devolve a marcha do carro
	public int pegaMarcha() {

		if (this.velocidadeAtual < 0) {
			return -1;
		}

		if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40 && this.motor.qtdMarchas >= 1) {
			return 1;
		}

		if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80 && this.motor.qtdMarchas >= 2) {
			return 2;
		}
		
		if (this.velocidadeAtual >= 80 && this.velocidadeAtual < 100 && this.motor.qtdMarchas >= 3) {
			return 3;
		}
		
		if (this.velocidadeAtual >= 100 && this.velocidadeAtual < 150 && this.motor.qtdMarchas >= 4) {
			return 4;
		}

		return -1;
	}
	
	public void setMotor(Motor motor){
		this.motor = motor;
	}
	
	public Motor getMotor(){
		return this.motor;
	}
}
