package ejercicios;

/*
 * Crea tres funciones cuyo comportamiento sea como el de los métodos de String startsWirth, 
 * contains y endsWith, pero sin utilizar ninguno de ellos.
 */

public class MetodoString {

	public static void main(String[] args) {
		System.out.println(empiezaPor("Hola", "Hola, mundo"));
		System.out.println(terminaPor("Holo", "Hola, mundo"));
		System.out.println(contiene("Hola, que hace?", "que"));

	}
	
	public static boolean empiezaPor(String cadena, String cadena2) {
		
		boolean res = false;
		int contadorA=0;
		
		for(int i = 0; i < cadena.length();i++) {
			if (cadena.charAt(i)==cadena2.charAt(contadorA)) {
				res =  true;
			}
		}
		return res;
	}
	
	public static boolean terminaPor(String cadena, String cadena2) {
		boolean res = false;
		int contadorA=cadena2.length()-1;
		
		for(int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)==cadena2.charAt(contadorA)) {
				res=true;
			}
		}
		return res;
	}
	
	public static boolean contiene(String cadena, String cadena2) {
		boolean res = false;
		int contadorA=0;
		
		for (int i = 0; i < cadena.length();i++) {
			if (contadorA<cadena2.length() && cadena.charAt(i)==cadena2.charAt(contadorA)) {
				contadorA++;
				if(contadorA==cadena2.length()) {
					res=true;
					contadorA=0;
				}
			}
		}
		return res;
	}

}
