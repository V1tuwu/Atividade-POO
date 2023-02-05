package resources;

public class Evento {
	
	private String description, Time1, Time2;
	private double Vitoria_Time1, Empate, Vitoria_Time2;
	private Resultado resultado;
	
	public Evento() {
	}
	
	public Evento(String descri, String time1, String time2, double vitoria_time1, double empate, double vitoria_time2) {
		setDescription(descri);
		setTime1(time1);
		setTime2(time2);
		setVitoria_Time1(vitoria_time1);
		setEmpate(empate);
		setVitoria_Time2(vitoria_time2);
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getTime1() {
		return Time1;
	}
	public void setTime1(String time) {
		if(time != null) {
			this.Time1 = time;
		}else {
			System.out.println("Nome invalido para o TIME 1");
		}
	}
	
	public String getTime2() {
		return Time2;
	}
	public void setTime2(String time) {
		if(time != null) {
			this.Time2 = time;
		}else {
			System.out.println("Nome invalido para o TIME 2");
		}
	}
	
	public double getVitoria_Time1() {
		return Vitoria_Time1;
	}
	public void setVitoria_Time1(double vitoria_time12) {
		Vitoria_Time1 = vitoria_time12;
	}
	
	public double getEmpate() {
		return Empate;
	}
	public void setEmpate(double empate2) {
		Empate = empate2;
	}
	
	public double getVitoria_Time2() {
		return Vitoria_Time2;
	}
	public void setVitoria_Time2(double vitoria_time22) {
		Vitoria_Time2 = vitoria_time22;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
}
