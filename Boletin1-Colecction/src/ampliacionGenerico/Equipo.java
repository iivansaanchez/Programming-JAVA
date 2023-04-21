package ampliacionGenerico;

import java.util.Collection;
import java.util.HashSet;

public class Equipo <T> {
	private String nombreEquipo;
	private Collection<T> equipo;
	
	public Equipo(String nombreEquipo) {
		super();
		this.nombreEquipo=nombreEquipo;
		this.equipo= new HashSet<>();
	}
	
	public void anadirAlumno(T alumno) throws AlumnoException{
	if(!this.equipo.contains(alumno)) {
		this.equipo.add(alumno);
		
	}else {
		throw new AlumnoException("El alumno ya existe");
	}
		
	}
	
	public void eliminarAlumno(T alumno) throws AlumnoException{
		if(!this.equipo.contains(alumno)) {
			throw new AlumnoException("El alumno no existe");
		}else {
			this.equipo.remove(alumno);
		}
	}
	
	public String alumnoEquipo(T alumno) {
		if(!this.equipo.contains(alumno)) {
			alumno=null;
		}
		
		return "El alumno es: "+ alumno;
	}

	@Override
	public String toString() {
		return "Equipo: " + nombreEquipo + " con jugadores: " + equipo;
	}
	
	public Collection<T> unionEquipo(Equipo<T> equipo2) {
		this.equipo.addAll(equipo2.equipo);
		return equipo;
	}
	
	
	public Collection<T> unionJugadoresComun(Equipo<T> equipo2){
		
		Collection<T> equipoAux =  new HashSet<>();
		
		equipoAux=this.equipo;
		
		equipoAux.retainAll(equipo2.equipo);
		
		return equipoAux;
	}

}
