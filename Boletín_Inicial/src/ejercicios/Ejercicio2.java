package ejercicios;
/*Escribe un método que reciba por parámetro el día de la semana (Lunes, Martes,
 * Miércoles, etc) y devuelva qué asignatura toca a primera hora ese día.
 */

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		String dayOfWeek = "Monday";
		if (dayOfWeek=="Monday") {
			System.out.println("Entornos de desarrollo.");
		}else if (dayOfWeek=="Tuesday"){
			System.out.println("Fol.");
		}else if (dayOfWeek=="Wednesday") {
			System.out.println("Sistemas Informaticos.");
		}else if (dayOfWeek=="Thursday") {
			System.out.println("Base de datos.");
		}else if (dayOfWeek=="Friday"){
			System.out.println("Base de datos");
		}else {
			System.out.println("Weekend");
		}
	}

}
