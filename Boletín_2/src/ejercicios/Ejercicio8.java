package ejercicios;

/*
 * Realiza un método llamado toBinary que reciba un número decimal como argumento 
 * y devuelva un String con el número binario correspondiente.
 */

public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println(toBinary(13));
	}
	
	public static String toBinary(int number) {
		int cociente=0;
		int resto;
		int numeroOperacion = number;
		String numeroB="";
		String numeroFinal="";
		while (numeroOperacion>=2) {
			cociente=numeroOperacion/2;
			resto=numeroOperacion%2;
			numeroB+=Integer.valueOf(resto);
			numeroOperacion=cociente;
		}
		numeroB+=Integer.valueOf(cociente);
		
		for(int i=numeroB.length()-1;i>=0; i--) {
			numeroFinal+=numeroB.charAt(i);
		}
	return numeroFinal;
	}
}
