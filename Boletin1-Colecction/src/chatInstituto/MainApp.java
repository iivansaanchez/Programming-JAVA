package chatInstituto;

public class MainApp {

	public static void main(String[] args) {
		Persona ivan = new Alumno("Iván", 17);
		Persona rafa = new Alumno("Rafa", 20);
		Persona jose = new Profesor("José");
		
		Mensaje sms = new Mensaje(jose, "Hola José");
		Mensaje sms2 = new Mensaje(jose, "He acabado el boletín");
		Mensaje sms3 = new Mensaje(rafa, "Viva er Beti");

		
		try {
			System.out.println(jose.enviarMensaje(sms));
			System.out.println(rafa.enviarMensaje(sms2));
			System.out.println(ivan.enviarMensaje(sms3));
		} catch (Exception e) {
			System.out.println("No se ha podido enviar el mensaje.");
		}	
		
		System.out.println("------------------------");
		
		try {
			jose.leerBuzon();
			rafa.leerBuzon();
			ivan.leerBuzon();
		} catch (Exception e) {
			System.out.println("No hay mensajes.");
		}
		
		System.out.println("------------------------");
		
		try {
			ivan.leerBuzonOrdenadoPorNombre();
			jose.leerBuzonOrdenadoPorNombre();
			rafa.leerBuzonOrdenadoPorNombre();
		} catch (Exception e) {
			System.out.println("No hay mensajes");
		}
		
		System.out.println("------------------------");
		
		try {
			ivan.buscarPalabra("Hola");
			jose.buscarPalabra("Hola");
			rafa.buscarPalabra("Hola");
		} catch (Exception e) {
			System.out.println("No se ha encontrado");
		}
		
		System.out.println("------------------------");
		
		try {
			rafa.borrarMensajeBuzon(0);
			ivan.borrarMensajeBuzon(0);
		} catch (Exception e) {
			System.out.println("No hay mensajes en esa posicion.");
		}
		
		System.out.println("------------------------");
		
		
	}

}
