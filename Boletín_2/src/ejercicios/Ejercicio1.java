package ejercicios;

/*
 * Realizar un método llamado numeroSolucionesEcuacionSegundoGrado que reciba 
 * los coeficientes de una ecuación de segundo grado y devuelva el número de 
 * soluciones que tiene. Si los argumentos no son válidos (el primer coeficiente 
 * tiene que ser distinto de cero) debe devolver un -1.
 */

public class Ejercicio1 {
	
	public static void main(String[] args) {
		System.out.println(numeroSolucionesEcuacionSegundoGrado(5, -5, 2));
	}
	public static int numeroSolucionesEcuacionSegundoGrado(int a, int b, int c) {
		int ecuacionComprobar=0;
		Double ecuacion = Math.pow(b, 2) - 4*a*c;
		ecuacionComprobar+=ecuacion;
		int res = 0;
		
		if (ecuacion==0) {
			res++;
		}else{
			res+=2;
		}

		return res;
	}
}
