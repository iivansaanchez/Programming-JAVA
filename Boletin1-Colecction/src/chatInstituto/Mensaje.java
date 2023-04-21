package chatInstituto;

import java.time.LocalDateTime;

public class Mensaje{
	
	protected Persona emisor;
	protected String texto;
	protected LocalDateTime fecha;
	
	public Mensaje(Persona receptor, String texto){
		if(texto!=null && !texto.isBlank() && !texto.isEmpty()) {
			this.texto=texto;
		}
		this.fecha = LocalDateTime.now();
		
	}
	
	public boolean contienePalabra(String palabra) {
		return this.texto.contains(palabra);
	}

	@Override
	public String toString() {
		return emisor + " Texto: " + texto+ "\n"
				+"Fecha y hora: " + fecha + "\n";
	}

	public void setEmisor(Persona emisor) {
		this.emisor = emisor;
	}
	
	
	

}
