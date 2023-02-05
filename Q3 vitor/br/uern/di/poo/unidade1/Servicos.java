package br.uern.di.poo.unidade1;

public class Servicos {
	private final static double percentualLuxo = 0.1;
	private final double instalacao = 70.00;
	private final double acrescimo = 250.00;

	public double getPercentualLuxo() {
		return percentualLuxo;
	}

	public double getInstalacao() {
		return instalacao;
	}

	public double getAcrescimo() {
		return acrescimo;
	}
	
	public static double calcServico(Porta porta) {
		double servico = porta.calculaPreco() + 70.00 + (porta.isPivoltante() ? 250.00 : 0.0);		
		
		if(porta.getTipoPorta() == Tipos.Luxo){
			try {
				servico += servico*percentualLuxo;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else;
			
		return servico;
		
	}
}
