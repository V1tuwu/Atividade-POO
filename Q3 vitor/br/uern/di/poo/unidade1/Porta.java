package br.uern.di.poo.unidade1;

public class Porta {
	private Tipos TipoPorta;
	private double Altura, Largura;
	private boolean Pivoltante;
	private final double Incremento = 350, Altura_Padrao = 0.7, Largura_Padrao = 1.8;
	
	public Tipos getTipoPorta() {
		return TipoPorta;
	}
	public void setTipoPorta(Tipos tipo_Porta) {
		TipoPorta = tipo_Porta;
	}
	/////////////////////////////////////////////////////
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
	/////////////////////////////////////////////////////
	public double getLargura() {
		return Largura;
	}
	public void setLargura(double largura) {
		Largura = largura;
	}
	/////////////////////////////////////////////////////
	public boolean isPivoltante() {
		return Pivoltante;
	}
	public void setPivoltante(boolean pivoltante) {
		Pivoltante = pivoltante;
	}
	/////////////////////////////////////////////////////
	public double getIncremento() {
		return Incremento;
	}
	
	public double getAltura_Padrao() {
		return Altura_Padrao;
	}
	
	public double getLargura_Padrao() {
		return Largura_Padrao;
	}
	/////////////////////////////////////////////////////
	Porta() {
		setTipoPorta(Tipos.Padrao);
		setAltura(Altura_Padrao);
		setLargura(Largura_Padrao);
		setPivoltante(false);
	}
	
	Porta(Tipos tipo, double altura, double largura, boolean pivoltante){
		setTipoPorta(tipo);
		setAltura(altura);
		setLargura(largura);
		setPivoltante(pivoltante);
	}
	/////////////////////////////////////////////////////
	
	public double calculaPreco() {
		double preco;
		if(this.Pivoltante == true) {
			preco = TipoPorta.getCusto() + this.Incremento;
		}else {
			preco = TipoPorta.getCusto();
		}
		
		return preco;
		
	}
	
	public void exibePorta() {
		System.out.println("---------------------------------");
		System.out.println("Porta de " + getTipoPorta() + " com Altura: " + 
		getAltura() + " Largura: " + getLargura());		
		System.out.print("Pivoltante: ");
		
		if(isPivoltante()) {
			System.out.print("Sim");
		}else {
			System.out.print("Não");
		}
		System.out.println();
		System.out.print("Taxa de Serviço: ");
		
		
	}
	
}
