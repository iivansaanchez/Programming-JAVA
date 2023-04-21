package equipos;

public class MainApp {

	public static void main(String[] args) throws AlumnoException {
		
		
		//Creacion de Alumnos
		Alumno ivan = new Alumno("Ivan", "1234");
		Alumno jose = new Alumno("Jose", "4321");
		Alumno migue = new Alumno("Migue", "6789");
		Alumno rafa = new Alumno("Rafa", "9876");
		Alumno pepe = new Alumno("Pepe", "0997");
		//Creacion de Equipos
		Equipo betis = new Equipo("Real Betis Balompie");
		Equipo sevilla = new Equipo("Sevilla FC");
		//Añadimos alumnos a Equipo betis;
		betis.anadirAlumno(ivan);
		betis.anadirAlumno(jose);
		//Buscamos a Iván en equipo betis
		System.out.println(betis.alumnoEquipo(ivan));
		//Como el alumno no existe es null
		System.out.println(betis.alumnoEquipo(pepe));
		
		//Añadir alumnos extra e betis
		betis.anadirAlumno(rafa);
		betis.anadirAlumno(migue);
		
		
		//Añadimos alumnos a Sevilla
		sevilla.anadirAlumno(rafa);
		sevilla.anadirAlumno(migue);
		
		//Mostramos los alumnos que hay en varios equipos
		System.out.println(betis.toString());
		System.out.println(sevilla.toString());
		
		//Añadimos los jugadores de sevilla a betis.
		System.out.println(betis.unionEquipo(sevilla));
		
		//Eliminamos a Migue de betis(Jugador que si no se elimina aparecera como comun
		//en el metodo unionJugadoresComun
		betis.eliminarAlumno(migue);
		
		
		//Mostramos los jugadores comunes
		System.out.println(betis.unionJugadoresComun(sevilla));
		

	}

}
