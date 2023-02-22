package ejercicios;

/*
* Diseña una función llamada esPalindromo que reciba una cadena de caracteres y determine si 
* constituye un palíndromo o no. Una palabra es un palíndromo si puede leerse del mismo modo 
* de izquierda a derecha que de derecha a izquierda. Obvia los espacios en blanco y caracteres 
* separadores, así como tildes, etc.
* Ejemplos de palíndromos: ‘Ligar es ser ágil’, ‘Somos o no somos’.
*/

public class Palindromo {

	public static void main(String[] args) {
		System.out.println(esPalindromo("ligar es ser agil", "ligar es ser agil"));
	}
	/**
	 * Este metodo lo primero que hace es almacenar ambas cadenas sin ESPACIOS en dos variables
	 *  diferentes (cadenaComparar/cadenaComparar2) para posteriormente recorrer la segunda cadena
	 *  de derecha a izquierda y finalmente compararla con la cadenaComparar para ver si es Palindromo.
	 * @param frase 
	 * @param frase2
	 * @return si es palindromo o no (true/false)
	 */
	public static boolean esPalindromo(String frase, String frase2) {
		boolean res = false;
		
		String cadenaComparar =  "";
		cadenaComparar+=frase.replace(" ", "");
		
		String cadenaComparar2="";
		cadenaComparar2+=frase2.replace(" ", "");
		
		String cadenaFinal="";
		
		for (int i = cadenaComparar2.length()-1; i >=0; i--){
			cadenaFinal+=cadenaComparar2.charAt(i);
		}
		
		if(cadenaComparar.equals(cadenaFinal)) {
			res=true;
		}
		return res;
	}
}
