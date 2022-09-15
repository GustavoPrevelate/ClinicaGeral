package br.senai.sp.jandira.model;

public class PlanoDeSaude {

	private String operadora;
	private String TipoDoPlano;
	
	//Métodos de acesso
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	public String getOperadora() {
		return this.operadora;
	}
	
	public void setTipoDoPlano(String TipoDoPlano) {
		this.TipoDoPlano = TipoDoPlano;
	}
	
	public String getTipoDoPlano() {
		return this.TipoDoPlano;
	}
	
	public String getDadosDoPlano() {
		return "Plano: " + this.operadora + ", " + this.TipoDoPlano;
	}
}
