package paginaWeb;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
	
		Historial hGoogle = new Historial();
		
		//1
		PaginaWeb google = new PaginaWeb("www.google.es", LocalDateTime.now()) {};
		hGoogle.anadirWeb(google);
		
		PaginaWeb zalando = new PaginaWeb("www.zalando.es", LocalDateTime.now()) {};
		hGoogle.anadirWeb(zalando);

		//2
		System.out.println(hGoogle.consultarHistorial());
		//3
		System.out.println(hGoogle.historialDia(LocalDateTime.now()));
		//5
		System.out.println(hGoogle.borrarPaginaHistorial(google));
		//4
		System.out.println(hGoogle.borrarHistorial());
		
		
	}

}
