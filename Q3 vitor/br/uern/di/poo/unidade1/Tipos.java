package br.uern.di.poo.unidade1;

public enum Tipos {
	Simples("Compesada", "Simples", 50.00), Padrao("Andiroba", "Encaixe", 140.00),
	Luxo("Ipe", "Tetra", 350.00);
	
	private String Madeira;
	private String Fechadura;
	private double Custo;
	
	Tipos(String madeira, String fechadura, double custo) {
		setMadeira(madeira);
		setFechadura(fechadura);
		setCusto(custo);
	}

	public String getMadeira() {
		return Madeira;
	}

	public void setMadeira(String madeira) {
		Madeira = madeira;
	}

	public String getFechadura() {
		return Fechadura;
	}

	public void setFechadura(String fechaura) {
		Fechadura = fechaura;
	}

	public double getCusto() {
		return Custo;
	}

	public void setCusto(double custo) {
		Custo = custo;
	}
	

	
}
