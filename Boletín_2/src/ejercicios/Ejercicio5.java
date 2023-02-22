package ejercicios;

/*
 * Realizar un método llamado esMultiplo que recibirá dos números y devuelva True si el primer 
 * número es múltiplo del segundo.
 */

public class Ejercicio5 {
	
	public static void main(String[] args) {
		System.out.println(esMultiplo(9, 3));
	}
	
	public static boolean esMultiplo(int number1, int number2) {
		boolean res = false;
		
		if (number1%number2==0) {
			res=true;
		}
		return res;
	}

}
