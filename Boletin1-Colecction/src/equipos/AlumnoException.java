package equipos;

public class AlumnoException extends Exception{
	
	private String mensaje;
	
	public AlumnoException(String mensaje) {
		this.mensaje=mensaje;
	}

}
