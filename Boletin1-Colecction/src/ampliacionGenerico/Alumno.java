package ampliacionGenerico;

public class Alumno {
	private String nombre;
	private String DNI;
	
	public Alumno(String nombre, String DNI) {
		this.nombre=nombre;
		this.DNI=DNI;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " con DNI: " + DNI;
	}


	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		
		if(!esIgual && obj!=null && obj instanceof Alumno) {
			Alumno otroAlumno = (Alumno) obj;
			
			esIgual = this.nombre !=null && otroAlumno.nombre != null && this.nombre.equals(otroAlumno.nombre)
					&& this.DNI != null && otroAlumno.DNI != null && this.DNI.equals(otroAlumno.DNI);
		}
	return esIgual;
	}
}
