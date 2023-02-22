package ejercicios;

/*Diseña un programa que cuente el número de veces que aparece una palabra en una cadena de texto.
 * 
 */

public class SearchWord{

	public static void main(String[] args) {
		System.out.println(Search("Que"));

	}
	
	public static int Search(String word) {
		String word2 = "Que Que Que Que";
		
		int contadorA=0;
		int numeroVeces=0;
		
		for (int i = 0; i < word2.length(); i++) {
			if (word2.charAt(i)==word.charAt(contadorA)) {
				contadorA++;
				if(word.length()-1==contadorA) {
					numeroVeces++;
					contadorA=0;
				}
			}
		}
		return numeroVeces;
	}

}
