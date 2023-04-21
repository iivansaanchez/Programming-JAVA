package chatInstituto;


public class Alumno extends Persona {
	private static final int MAYORIA_EDAD = 18;
	
	private Integer edad;
	protected Mensaje mensaje;
	protected int contadorMensajes;
	
	protected Alumno(String nombre, Integer edad) {
		super(nombre);
		this.edad=edad;
	}
	
	@Override
	public String enviarMensaje(Mensaje m1) throws Exception{
		Persona persona = new Alumno(this.nombre, this.edad);
		m1.setEmisor(persona);
		if(this.edad<MAYORIA_EDAD) {
			if(m1.emisor.nombre.equals(this.nombre)){
				throw new Exception("El mensaje no se ha podido enviar.");
			}else {
				buzon.add(m1);
			}
		}else {
				this.buzon.add(m1);	
		}
		
		return "Mensaje: " + m1;
	}
	@Override
	public String toString() {
		contadorMensajes++;
		return "Mensaje: " +contadorMensajes+ " de: " +nombre;
	}

	


	
	

}
