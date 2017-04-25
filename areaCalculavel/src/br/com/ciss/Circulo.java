package br.com.ciss;

public class Circulo implements AreaCalculavel{
	protected double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	@Override
	public double calculaArea() {
		
		return Math.PI * (raio * raio);
	}

}
