package ejercicios;

/*
 * Elabora un programa que codifique una cadena, de tal modo que en el resultado 
 * se inviertan cada 2 caracteres. Los caracteres intercambiados no pueden volver a intercambiarse. 
 * Ejemplo:
 * Entrada -> Hola mundo Salida -> oHalm nuod
 */

public class Ejercicio4 {
	
	public static void main(String[] args) {
		String cadena = "Hola mundo";
		String res="";
		
		for (int i=0; i<cadena.length(); i++) {
			if (i%2==0) {
				res+=cadena.charAt(i+1);
			}else {
				res+=cadena.charAt(i-1);
			}
		}
		System.out.println(res);
	}

}
