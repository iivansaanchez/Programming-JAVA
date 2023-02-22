package ejercicios;

/*Programar un sistema de calefacción-refrigeración que compruebe en función del
* día y el mes, la estación en la que estamos y dependiendo de la estación programe
* la temperatura: Invierno→19º, Primavera→20º, Verano→24º, Otoño→19º.
* El método deberá recibir como parámetro el mes y el día actual y devolver los
* grados a los que deberemos programar el sistema. 
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		int mes=7;
		int dia=5;
		
		if ((mes==3 &&(dia>0 && dia<=31)) || (mes==4 &&(dia>0 && dia<=30)) || (mes==5 &&(dia>0 && dia<=31)) || mes==6 && (dia>0 && dia<21)){
			System.out.println("Primavera");
		}else if ((mes==6 && (dia>=21 && dia<=30)) || (mes==7 && (dia>0 && dia<=31)) || (mes==8 && (dia>0 && dia<=31)) || (mes==9 && (dia>0 && dia<23))) {
			System.out.println("Verano");
		}else if ((mes==9 && (dia>=23 && dia<=30)) || (mes==10 && (dia>0 && dia<=31)) || (mes==11 && (dia>0 && dia<=30)) || (mes==12 && (dia>0 && dia<21))) {
			System.out.println("Otoño");
		}else {
			System.out.println("Invierno");
		}
	}
}
