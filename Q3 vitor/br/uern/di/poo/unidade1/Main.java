package br.uern.di.poo.unidade1;

public class Main {
	public static void main(String [] args) {
		Porta porta1 = new Porta(Tipos.Padrao, 1.8, 1.5, true);
		Porta porta2 = new Porta(Tipos.Simples, 1.8, 1.5, false);
		Porta porta3 = new Porta(Tipos.Luxo, 1.8, 1.5, true);
		Porta porta4 = new Porta(Tipos.Luxo, 1.8, 1.5, false);
		
		porta1.exibePorta();
		System.out.println(Servicos.calcServico(porta1));
		
		porta2.exibePorta();
		System.out.println(Servicos.calcServico(porta2));
		
		porta3.exibePorta();
		System.out.println(Servicos.calcServico(porta3));
		
		porta4.exibePorta();
		System.out.println(Servicos.calcServico(porta4));

	}
}
