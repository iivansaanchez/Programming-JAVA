package ejercicios;

/*
* Un número es divisible por 3 si la suma de todas sus cifras reducidas a una cifra es 
* igual a 0, 3, 6 ó 9.
* Por ejemplo, 156 ⇒ 1+5+6=12 ⇒ 1+2 = 3 es divisible,
* pero 157 ⇒ 1+5+7 =13 ⇒ 1+3 =4 no lo es.
* Elabora un programa que compruebe la divisibilidad por 3 según este algoritmo.
* El programa debe comprobar que el número facilitado es válido.
*/

public class DivisibilidadPorTres {

	public static void main(String[] args) {
		System.out.println(divisibilidadTres("157"));
	}
	
	/**
	 * Este metodo recorre un numero introducido y suma sus digitos 1 a 1 hasta que
	 * obtienes un numero de entre 0 y 9 para despues poder comprobar si es divisible entre 3.
	 * @param number --> Varible numero de tipo String para poder recorrerlo.
	 * @return mensaje --> Te devuelve si es divisible o no.
	 */

	public static String divisibilidadTres(String number) {
		int res = 0;
		String mensaje="";
		int contadorA=number.length();
		
		
		if(number!=null && !number.isEmpty()) {
			while (contadorA>=1) {
				for (int i = 0; i < number.length(); i++) {
					res+=Character.getNumericValue(number.charAt(i));
				}
				if (number.length()>2) {
					number=String.valueOf(res);
					res=0;
				}
				contadorA--;

			}
			if(res%3==0) {
				mensaje+="Es divisible";
			}else {
				mensaje+="No es divisible";
			}
		}
		return mensaje;
	}
}
