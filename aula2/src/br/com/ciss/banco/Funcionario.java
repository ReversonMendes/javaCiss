package br.com.ciss.banco;

public class Funcionario {
	private String nome;
	private String cpf;
	private String cargo;
	private String departamento;
	protected double salario;
	private String dtAdmissao;
	private String rg;
	private boolean estaNaEmpresa = true;
	private boolean demitido;
	private String dtDemissao;
	private static int totalDeFuncionario;
	private  int identificador;

	public Funcionario(){		
		Funcionario.totalDeFuncionario += 1;
		this.identificador = totalDeFuncionario;
	}
	
	public  Funcionario( String nome, String cargo){
		this.nome = nome;
		this.cargo = cargo;
		Funcionario.totalDeFuncionario += 1;
		this.identificador = totalDeFuncionario;
	}
	// Getters e Setters
	
	public  int getIdentificador(){
		return identificador;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(String dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	protected boolean isEstaNaEmpresa() {
		return estaNaEmpresa;
	}

	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}

	protected boolean isDemitido() {
		return demitido;
	}

	protected void setDemitido(boolean demitido, String dataDemissao) {
		this.demitido = demitido;
		if (demitido) {
			this.dtDemissao = dataDemissao;
			this.estaNaEmpresa = false;
		}
	}

	public String getDtDemissao() {
		return dtDemissao;
	}

	protected void setDtDemissao(String dtDemissao) {
		this.dtDemissao = dtDemissao;
	}
	// ---------------------------------------

	public void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário: " + this.salario);
		System.out.println("Data de Entrada: " + this.dtAdmissao);
		System.out.println("RG: " + this.rg);
		System.out.println("Está na empresa: " + this.estaNaEmpresa);
		if (this.demitido) {
			System.out.println("Demitido: " + this.demitido);
			System.out.println("Data de Demissão: " + this.dtDemissao);
		}
		System.out.println("Ganho anual:" + this.calculaGanhoAnual());
	}

	public boolean recebeAumento(double valor) {
		if (isDemitido()) {
			return false;
		} else {
			this.salario += valor;
			return true;
		}
	}

	public double calculaGanhoAnual() {
		return (this.salario / 12);
	}

	public void demite(String dtDemissao) {

		this.setDemitido(true, dtDemissao);
	}
	
	public double getBonificacao(){
		return this.salario * 0.10;
	}
}

