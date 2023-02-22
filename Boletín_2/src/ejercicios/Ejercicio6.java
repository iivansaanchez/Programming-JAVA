package ejercicios;

import java.util.Scanner;

/*
 * Realizar un método llamado horaMayor que recibirá seis valores enteros, los tres primeros 
 * representarán la hora, minuto y segundos de la primera hora y los otros tres de la segunda 
 * hora. Se deberá devolver un 1 si la primera hora es mayor que la segunda, un 2 si la segunda 
 * hora es mayor que la primera, un 0 si son iguales y un -1000 si los datos no son correctos.
 */

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		System.out.println(horaMayor(24, 0, 0, 23, 59, 59));
		
	}
	
	public static int horaMayor(int number1, int number2,int number3, int number4,int number5, int number6) {
		int res=0;
		int horaSeg1=0;
		int horaSeg2=0;
		final int NUMERO_MAX_HORAS=86400;
		
		horaSeg1+=number1*3600;
		horaSeg1+=number2*60;
		horaSeg1+=number3;
		
		horaSeg2+=number4*3600;
		horaSeg2+=number5*60;
		horaSeg2+=number6;
		
		if (horaSeg1>NUMERO_MAX_HORAS || horaSeg2>NUMERO_MAX_HORAS) {
			res=-1000;
		}else if (horaSeg1>horaSeg2) {
			res=1;
		}else if (horaSeg2>horaSeg1) {
			res=2;
		}else if(horaSeg1==horaSeg2) {
			res=0;
		}
		return res;
	}

}
