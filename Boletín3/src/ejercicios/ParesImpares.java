package ejercicios;

public class ParesImpares {

	public static void main(String[] args) {
		System.out.println(paresImpares("PEPEPEPA", "IMPAR"));

	}
	
	public static StringBuilder paresImpares(String cadena, String bandera) {
		
		StringBuilder cadenaNumero = new StringBuilder();
		int contadorA=0;
		if (bandera=="PAR") {
			do {
				if (!(contadorA%2==0)) {
					cadenaNumero.append(cadena.charAt(contadorA));
				}else{
					
				}
				contadorA++;
				
			}while(contadorA<cadena.length());				
		}else {
			do {
				if (contadorA%2==0) {
					cadenaNumero.append(cadena.charAt(contadorA));
				}else{
					
				}
				contadorA++;
				
			}while(contadorA<cadena.length());
		}
			
		return cadenaNumero;
	}
	
}

/* SOLUTION FOR:
 * 		if (bandera=="INPAR") {
			for (int i = 0; i < cadena.length(); i++) {
				if (cadena.charAt(i)%2==0) {
					cadenaNumero.append(cadena.charAt(i));
				}
			}
		}else {
			for (int i = 0; i < cadena.length(); i++) {
				if (!((cadena.charAt(i)%2)==0)) {
					cadenaNumero.append(cadena.charAt(i));
				}
			}
		}
 * SOLUTION WHILE:
 * 
 * 		int contadorA=0;
		
		if (bandera=="PAR") {
			while (contadorA<cadena.length()) {
				if (!(contadorA%2==0)) {
					cadenaNumero.append(cadena.charAt(contadorA));
				}else{
					
				}
				contadorA++;
			}
		}else {
			while (contadorA<cadena.length()) {
				if (contadorA%2==0) {
					cadenaNumero.append(cadena.charAt(contadorA));
				}else {
					
				}
				contadorA++;
			}	
		}
 */
 
