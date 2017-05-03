package br.ciss.com.lang;

public  class Conta {
	protected double saldo;

	public Conta(double saldo){
		this.saldo = saldo;
	}
	
	public Conta(){
	}
	public void deposita(double valor) {
		this.saldo += valor;
	}


	public double getSaldo() {
		return this.saldo;
	}

	public  void atualiza(double taxa){
		this.saldo += this.saldo * taxa;
	};
	
	@Override
	public String toString(){
		return "Uma conta com valor:" + this.saldo;
	}
	
	@Override
	public boolean equals(Object object){
		Conta  outraConta = (Conta) object;
		if(this.saldo == outraConta.getSaldo()){
			return true;
		}
		return false;
	}

}
