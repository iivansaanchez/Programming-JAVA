package ejercicios;

/*
 * Realiza un método llamado gcd (greaterCommonDivisor) que recibirá dos números y
 *  devuelva el máximo común divisor según el algoritmo de Euclides.
 */
public class Ejercicio10 {
	
	public static void main(String[] args) {
		System.out.println(gcd(1220, 516));
		System.out.println(gcd(45, 56));
	}

	public static int gcd(int a, int b) {
		while(b>0) {
			int r=a%b;
			a=b;
			b=r;
		}
		
		
		return a;
	}
}
