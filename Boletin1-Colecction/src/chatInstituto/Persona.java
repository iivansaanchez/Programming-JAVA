package chatInstituto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public abstract class Persona {
	
	protected String nombre;
	protected List<Mensaje> buzon = new ArrayList<>();
	
	
	protected Persona(String nombre) {
		this.nombre=nombre;
	}
	
	public String leerBuzon() throws Exception{
		if(this.getBuzon().isEmpty()) {
			throw new Exception("No hay mensajes");
		}
		return "Buzon entrada: " + this.getBuzon();
	}
	
	
	
	public String leerBuzonOrdenadoPorNombre() throws Exception{
		List<Mensaje> buzonOrdenado = new ArrayList<>();
		buzonOrdenado.addAll(this.buzon);
		Collections.sort(buzonOrdenado,  new NombreComparator());
		return "Buzon ordenado: " + buzonOrdenado;
	}
	


	public String borrarMensajeBuzon(int posicionMensaje) throws Exception {
		if(buzon.get(posicionMensaje) != null) {
			buzon.remove(posicionMensaje);
		}
		return "Buzon actual: "+ this.getBuzon();
	}

	public String getNombre() {
		return nombre;
	}

	public List<Mensaje> getBuzon() {
		return buzon;
	}

	@Override
	public String toString() {
		return "Buzón: "+ this.buzon;
	}

	public abstract String enviarMensaje(Mensaje m1) throws Exception;
	
	public String buscarPalabra(String palabra) throws Exception{
		Iterator<Mensaje> historialMensaje = this.buzon.iterator();
		
		List<String> buzonVacio = new ArrayList<>();
		
		
		while(historialMensaje.hasNext()) {
			Mensaje mensajeAhora = historialMensaje.next();
			if(mensajeAhora.contienePalabra(palabra)) {
				Mensaje mensajeAnadir = new Mensaje(null, palabra);
				buzonVacio.add(mensajeAnadir.toString());
			}else {
				throw new Exception("No se ha encontrado la palabra");
			}
		}
		return "Nuevo buzón: " + buzonVacio;
	}

	
}
