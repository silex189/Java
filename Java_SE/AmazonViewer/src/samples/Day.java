package samples;

public enum Day {
	SUNDAY("Domingo"),
	MONDAY("Lunes"),
	TUESDAY("Martes"),
	WEDNESDAY("Miercoles"),
	THURSDAY("Jueves"),
	FRIDAY("Viernes"),
	SATURDAY("Sabado");
	
	private String spanish;
	
	private Day(String spanish) {
		this.spanish = spanish;
	}

}
