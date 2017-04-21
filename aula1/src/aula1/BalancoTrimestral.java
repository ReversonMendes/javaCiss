package aula1;

public class BalancoTrimestral {

	public static void main(String[] args) {

		int gastosJaneiro = 15000, gastosFevereiro = 23000, gastosMarco = 17000;
		double gastoTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		double mediaMensal = gastoTrimestre / 3; 
		
		System.out.println("O gasto do trimestre foi de "+ gastoTrimestre);
		System.out.println("A média do trimestre foi de "+ mediaMensal);

	}

}
