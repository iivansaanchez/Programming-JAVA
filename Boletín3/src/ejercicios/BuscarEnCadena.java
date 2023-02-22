package ejercicios;
/*
* Realizar una función que busque una palabra escondida dentro de un texto.
*  Por ejemplo, si la cadena es “shybaoxlna” y la palabra que queremos buscar es
*  “hola”, entonces si se encontrará y deberá devolver True, en caso contrario 
*  deberá devolver False. Las letras de la palabra escondida deben aparecer en 
*  el orden correcto en la cadena que la oculta:
*	shybaoxlna ⇒ hola: True soybahxlna ⇒ hola: False
 */

public class BuscarEnCadena {

	public static void main(String[] args) {
		
		System.out.println(buscarPalabra("hola", "shybaoxlna"));
	}
	
	public static boolean buscarPalabra(String palabra, String cadenaBuscar) {
		boolean res = false;
		int contadorLetras=0;
		int tamanioCadena=0;
		tamanioCadena=palabra.length();
		
		for (int i = 0; i<cadenaBuscar.length(); i++) {
			for( int j = 0; j<palabra.length(); j++) {
				if (cadenaBuscar.charAt(i)==palabra.charAt(j)) {
					contadorLetras++;
				}else if (tamanioCadena==contadorLetras){
					res = true;
					i = cadenaBuscar.length();
					j = palabra.length();
				}
			}
		}
		return res;
	}

}
