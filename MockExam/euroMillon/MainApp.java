package euroMillon;

import java.time.LocalDate;

public class MainApp {

	public static void main(String[] args) throws Exception{
		Combinacion c1 = new Combinacion(24, 51, 23, 45, 8, 12, 8);
		Combinacion c2 = new Combinacion(4, 32, 7, 25, 9, 1, 2);

		Historial h1 = new Historial();
		System.out.println(c1.comprobarCombinacion(c1));
		
		h1.addSorteo(LocalDate.of(2002, 4, 10), c1);
		h1.addSorteo(LocalDate.of(2002, 6, 1), c2);
		h1.addSorteo(10, 10, 2010, c2);
		h1.addSorteo(LocalDate.now(), c1);
		
		
		h1.actualizarSorteo(LocalDate.of(2002, 4, 10), c1);
		
		h1.borrarSorteo(LocalDate.of(2002, 6, 1));
		
		System.out.println(h1.mostrarHistorico());
		
	}

}
