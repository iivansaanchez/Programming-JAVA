package ejercicios;

/*
 * Haciendo uso de la función anterior crea una función esCapicúa que
 *  acepte números tanto enteros como decimales.
 */

public class Capicua {

	public static void main(String[] args) {
		
		System.out.println(esCapicua("2211", "2122"));
	}
	
	public static boolean esCapicua(String number1, String number2) {
		boolean res = false;
		
		String finalNumber="";
		
		for (int i = number1.length()-1; i >=0; i--) {
			finalNumber+=number2.charAt(i);
		}
		
		if (number1.equals(finalNumber)) {
			res=true;
		}
		
		return res;
	}

}
