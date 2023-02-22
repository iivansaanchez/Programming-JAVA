package ejercicios;

/*
* Escribir un método que reciba un carácter y devuelva el tipo de carácter que es.
* Debe devolver una de los siguientes mensajes según corresponda:
* ◦ Letra mayúscula
* ◦ Letra minúscula
* ◦ Dígito entre 0 y 9
* ◦ Signo de puntuación
* ◦ Espacio en blanco
* ◦ Paréntesis () o llaves {}
* ◦ Otro carácter
*/

public class Ejercicio3 {

	public static void main(String[] args) {
		Character cadena='$';
		String cadenaCaracteres="'!@#$&^&()_-+={[}]|:;<,>.?/";
		
		if (Character.isUpperCase(cadena)==true) {
			System.out.println("El caracter "+cadena+" es mayuscula.");
		}else if(Character.isLowerCase(cadena)==true) {
			System.out.println("El caracter "+cadena+" es minuscula.");
		}else if (Character.isDigit(cadena)==true) {
			System.out.println("El caracter "+cadena+" es un digito.");
		}else if (Character.isWhitespace(cadena)==true) {
			System.out.println("El caracter es un espacio en blanco.");
		}else {
			for (int i=1; i<cadenaCaracteres.length(); i++) {
				if(cadenaCaracteres.charAt(i) == cadena) {
					System.out.println("El caracter "+cadena+" es un signo de puntuación, un parentesis/llave u otro caracter.");
				}
			}
		}
			
		}
}

