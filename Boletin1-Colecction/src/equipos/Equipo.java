package equipos;

import java.util.Collection;
import java.util.HashSet;

public class Equipo {
	private String nombreEquipo;
	private Collection<Alumno> equipo;
	
	public Equipo(String nombreEquipo) {
		super();
		this.nombreEquipo=nombreEquipo;
		this.equipo= new HashSet<>();
	}
	
	public void anadirAlumno(Alumno alumno) throws AlumnoException{
	if(!this.equipo.contains(alumno)) {
		this.equipo.add(alumno);
	}else {
		throw new AlumnoException("El alumno ya existe");
	}
		
	}
	
	public void eliminarAlumno(Alumno alumno) throws AlumnoException{
		if(!this.equipo.contains(alumno)) {
			throw new AlumnoException("El alumno no existe");
		}else {
			this.equipo.remove(alumno);
		}
	}
	
	public String alumnoEquipo(Alumno alumno) {
		if(!this.equipo.contains(alumno)) {
			alumno=null;
		}
		
		return "El alumno es: "+ alumno;
	}

	@Override
	public String toString() {
		return "Equipo: " + nombreEquipo + " con jugadores: " + equipo;
	}
	
	public Collection<Alumno> unionEquipo(Equipo equipo2) {
		this.equipo.addAll(equipo2.equipo);
		return equipo;
	}
	
	
	public Collection<Alumno> unionJugadoresComun(Equipo equipo2){
		
		Collection<Alumno> equipoAux =  new HashSet<>();
		
		equipoAux=this.equipo;
		
		equipoAux.retainAll(equipo2.equipo);
		
		return equipoAux;
	}

}
