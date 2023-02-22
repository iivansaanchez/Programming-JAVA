package ejercicios;

/*
 * Realizar un método llamado segundosEntre que recibirá seis valores enteros, 
 * los tres primeros representarán la hora, minuto y segundos de la primera hora y 
 * los otros tres de la segunda hora. Se deberá devolver el número de segundos que 
 * hay entre la primera hora y la segunda (el valor debe ser siempre en positivo). 
 * Si los datos no son correctos se deberá devolver -1000.
 */
public class Ejercicio7 {
	
	public static void main(String[] args) {
		System.out.println(segundosEntre(13, 15, 15, 16, 15, 15));
	}

	public static int segundosEntre(int number1, int number2,int number3, int number4,int number5, int number6) {
		int horaSeg1=0;
		int horaSeg2=0;
		final int NUMERO_MAX_HORAS=86400;
		int segundosEntre=0;
		
		horaSeg1+=number1*3600;
		horaSeg1+=number2*60;
		horaSeg1+=number3;
		
		horaSeg2+=number4*3600;
		horaSeg2+=number5*60;
		horaSeg2+=number6;
		
		if (horaSeg1>NUMERO_MAX_HORAS || horaSeg2>NUMERO_MAX_HORAS) {
			segundosEntre=-1000;
		}else if (horaSeg1>horaSeg2) {
			segundosEntre=horaSeg1-horaSeg2;
		}else {
			segundosEntre=horaSeg2-horaSeg1;
		}
		return segundosEntre;
	}
}
