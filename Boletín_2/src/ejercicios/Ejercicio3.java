package ejercicios;

/*
 * Diseña una función que, dada una cadena de entrada, comprueba si es una contraseña 
 * fuerte o no. Se considera que una contraseña es fuerte si contiene 8 o más caracteres, 
 * y entre ellos al menos hay una mayúscula, una minúscula, un signo de puntuación y al menos 
 * un dígito.
 */

public class Ejercicio3 {
	
	public static void main(String[] args) {
		System.out.println(passwordValida("SanSanIva357!"));
		
	}
	
	public static Boolean passwordValida(String password) {
		boolean tieneMayuscula = false;
		boolean tieneMinuscula = false;
		boolean tieneDigito = false;
		boolean tieneSigno = false;
		String signoPuntuacion = "?¿!¡.;,";
		
		if (password.length()>8) {
			for (int i = 0; i<password.length();i++) {
				if(Character.isUpperCase(password.charAt(i))) {
					tieneMayuscula=true;
				}else if (Character.isLowerCase(password.charAt(i))){
					tieneMinuscula=true;
				}else if (Character.isDigit(password.charAt(i))) {
					tieneDigito=true;
				}else{
					for(int j = 0; j<signoPuntuacion.length();j++) {
						if(password.charAt(i)==signoPuntuacion.charAt(j)) {
							tieneSigno=true;
						}
					}
				}
				
				}
				
			}
		return tieneMayuscula && tieneMinuscula && tieneDigito && tieneSigno;
		
		
	}	
	

}
