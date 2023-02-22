package ejercicios;
/*
Diseñar una función que reciba como parámetro tres cadenas, la primera será una
frase y deberá buscar si existe la palabra que recibe como segundo parámetro y
reemplazarla por la tercera.
 */

public class BuscaYSustituye {

	public static void main(String[] args) {

	System.out.println(buscarSustituir("Mi amigo es...", "amigo", "amiga"));
		
	}
	
	public static String buscarSustituir(String cadena, String palabra, String otra) {
		String mensaje ="";
		if (cadena!=null && !cadena.isEmpty() && palabra!=null && !palabra.isEmpty() && otra!=null && !otra.isEmpty()) {
			if(cadena.contains(palabra)) {
				mensaje=cadena.replace(palabra, otra);
			}
		}
		
		
		return mensaje;
	}

}
