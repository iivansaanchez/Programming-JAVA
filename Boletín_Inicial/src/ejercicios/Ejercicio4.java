package ejercicios;

/*
* Calcular las calificaciones de un alumno con un método que reciba la nota de la
* parte práctica, la nota de los problemas y la parte teórica. La nota final se calcula
* según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas vale
* el 50% y la parte teórica el 40%. Las notas deben estar entre 0 y 10, si no lo están,
* deberá devolver un mensaje de error.
* Realiza el método que calcule la media de tres notas y te devuelva la nota del
* boletín (insuficiente, suficiente, bien, notable o sobresaliente).
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		float notaPractica = 3.0f;
		float notaProblemas = 2.0f;
		float notaTeorica = 1.0f;
		if ((notaPractica >= 0.0f && notaPractica <=10) && (notaProblemas >= 0.0f && notaProblemas <=10) && (notaTeorica >= 0.0f && notaTeorica <=10)) {                         
			float notaP=(notaPractica*10)/100f;
			float notaPr=(notaProblemas*50)/100f;
			float notaT=(notaTeorica*40)/100f;
			float media = (notaP + notaPr +notaT);
			
			if (media>=0 && media<5) {
				System.out.println("Tu nota es "+media+" estás suspenso. INSUFICIENTE.");
			}else if (media>=5 && media<6) {
				System.out.println("Tu nota es "+media+" estás aprobado. SUFICENTE.");
			}else if (media>=6 && media<7) {
				System.out.println("Tu nota es "+media+" estás aprobado. BIEN");
			}else if (media>=7 && media<9) {
				System.out.println("Tu nota es "+media+" estás aprobado. NOTABLE.");
			}else {
				System.out.println("Tu nota es "+media+" estás aprobado. SOBRESALIENTE.");
			}
		}else {
			System.out.println("Los valores introducidos no son válidos.");
		}

	}
	

}


