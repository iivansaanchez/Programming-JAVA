package chatInstituto;



public class Profesor extends Persona{
	
	protected int contadorMensajes;

	protected Profesor(String nombre) {
		super(nombre);
	}

	@Override
	public String enviarMensaje(Mensaje m1) throws Exception{
		Persona persona = new Profesor(this.nombre);
		m1.setEmisor(persona);
		this.buzon.add(m1);
		return "Mensaje: " + m1;
	}
	
	@Override
	public String toString() {
		contadorMensajes++;
		return "Mensaje: " +contadorMensajes+ " de: " +nombre;
	}

}
