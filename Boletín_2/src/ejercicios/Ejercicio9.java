package ejercicios;


/*
 * Realiza un método llamado toDecimal que reciba un String con un valor numérico en 
 * binario como argumento y devuelva un número con el número decimal correspondiente.
 */
public class Ejercicio9 {
	
	private static final int BASE_BINARIO = 2;

	public static void main(String[] args) {
		System.out.println(toDecimal("11001101"));
	}
	
	public static int toDecimal(String number) {
		
		int decimal=0;
		String vueltaNumero="";
		
		if (number!=null && number.isEmpty()) {
			
		}else {
			
			for (int i=number.length()-1; i>=0; i--) {
				vueltaNumero+=number.charAt(i);
			}
			
			for (int j = 0; j<vueltaNumero.length(); j++) {
				if (Character.getNumericValue(vueltaNumero.charAt(j))==1) {
					decimal+=Math.pow(BASE_BINARIO, j);
				}
			}
		}
		return decimal;
	}
}
