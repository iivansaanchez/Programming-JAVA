package ejercicios;

import java.util.Scanner;

public class Fecha {

	public static void main(String[] args) {
		int mes=0;
		int anio=0;
		
		System.out.println("Introduce un mes: ");
		Scanner sc = new Scanner(System.in);
		mes=Integer.valueOf(sc.nextLine());
		
		System.out.println("Introduce un año: ");
		anio=Integer.valueOf(sc.nextLine());
		
		if (anio%4==0 && (anio%100!=0 || anio%400==0)) {
			if (mes == 1 || mes == 3 || mes == 4 || mes==6 || mes==8 || mes==10 || mes==12) {
				System.out.println("El mes del año "+anio+" es 31 días.");
			}else if (mes == 2){
				System.out.println("El mes del año "+anio+" es 29 días");
			}else {
				System.out.println("El mes del año "+anio+" es 30 días.");
			}
		}else {
			if (mes == 1 || mes == 3 || mes == 4 || mes==6 || mes==8 || mes==10 || mes==12) {
				System.out.println("El mes del año "+anio+" es 31 días.");
			}else if (mes == 2){
				System.out.println("El mes del año "+anio+" es 28 días");
			}else {
				System.out.println("El mes del año "+anio+" es 30 días.");
			}
		}
		
	}

}
