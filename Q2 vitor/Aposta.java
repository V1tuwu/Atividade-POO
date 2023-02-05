package resources;

public class Aposta {
	private Evento evento;
	private Resultado resultado;
	private double aposta;
	
	public Aposta() {}
	
	public Aposta(Evento event, Resultado result, double value) {
		setEvento(event);
		setResultado(result);
		setAposta(value);
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	public double getAposta() {
		return aposta;
	}

	public void setAposta(double aposta) {
		this.aposta = aposta;
	}
	
	public double calculaLucro(Evento event) {
		double lucro = 0;
		switch(resultado) {
		case TIME1: lucro = this.aposta * evento.getVitoria_Time1();
		case TIME2: lucro = this.aposta * evento.getVitoria_Time2();
		case EMPATE: lucro = this.aposta * evento.getEmpate();
		default:
			break;
		
		}
		return lucro;
		
	}
}
