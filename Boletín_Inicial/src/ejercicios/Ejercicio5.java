package ejercicios;
/*Realiza un método que reciba una hora por parámetro y que muestre luego buenos
* días, buenas tardes o buenas noches según corresponda. Se utilizarán los tramos
* de 6 a 12, de 13 a 20 y de 21 a 5, respectivamente, sólo teniendo en cuenta el valor
* de las horas 
 */

public class Ejercicio5 {
	
	public static void main(String[] args) {
		int hora = 20;
		
		if (hora>=6 && hora <12) {
			System.out.println("Buenos días.");
		}else if (hora>=12 && hora <20) {
			System.out.println("Buenas Tardes.");
		}else {
			System.out.println("Buenas Noches.");
		}
	}

}
