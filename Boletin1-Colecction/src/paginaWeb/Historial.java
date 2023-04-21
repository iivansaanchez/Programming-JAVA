package paginaWeb;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Historial{
	
	private Collection<PaginaWeb> historialColeccion;
	

	public Historial() {
		this.historialColeccion=new ArrayList();
	}
	
	public void anadirWeb(PaginaWeb web){
		historialColeccion.add(web);
		
	}
	
	public String consultarHistorial() {
		
		return "Historial: "+historialColeccion;
	}
	
	public Collection<PaginaWeb> historialDia(LocalDateTime fechaBuscar){
		
		Iterator<PaginaWeb> historialDia = historialColeccion.iterator();
		
		Collection<PaginaWeb> hDia = new ArrayList<>();
		
		while(historialDia.hasNext()) {
			PaginaWeb webAhora = historialDia.next();
			if(webAhora.fechaVisita.toLocalDate().equals(fechaBuscar.toLocalDate())) {
				hDia.add(webAhora);
			}
		}
		/**
		 * 
		for(PaginaWeb pagina: historial) {
			if(pagina.fechaVisita.toLocalDate().equals(fechaBuscar.toLocalDate())) {
				hDia.add(pagina);
			}
		}
		 */
		return hDia;
	}
	
	public Collection<PaginaWeb> borrarHistorial() {
		Collection<PaginaWeb> historialVacio;
		this.historialColeccion.clear();
		historialVacio=historialColeccion;
		
		return historialVacio;
	}
	
	public Collection<PaginaWeb> borrarPaginaHistorial(PaginaWeb webBuscar){
		
		Iterator<PaginaWeb> historialPagina = historialColeccion.iterator();
		
		Collection<PaginaWeb> historialSinPagina = historialColeccion;
		
		while(historialPagina.hasNext()) {
			PaginaWeb webAhora = historialPagina.next();
			if(webAhora.equals(webBuscar)){
				historialSinPagina.remove(webBuscar);
				historialColeccion=historialSinPagina;
			}
		}
		
		return historialSinPagina;
	}

	@Override
	public String toString() {
		return "Historial: " + historialColeccion;
	}
	
	

	
	
	
	
	
	
	


}
