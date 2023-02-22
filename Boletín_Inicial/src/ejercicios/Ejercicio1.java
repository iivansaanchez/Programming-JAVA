package ejercicios;

/*
 * Realiza un método que reciba dos números y devuelva True si uno es múltiplo del
 * otro.
 */

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		int number = 2;
		int number2 = 6;
		
		if (number%number2==0 || number2%number==0) {
			System.out.println("Es múltipo.");
		}else {
			System.out.println("No es múltiplo.");
		}
		
	}

}
