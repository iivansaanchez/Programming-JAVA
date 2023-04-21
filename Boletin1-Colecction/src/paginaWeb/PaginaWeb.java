package paginaWeb;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class PaginaWeb{
	
	protected String url;
	protected LocalDateTime fechaVisita;
	
	protected PaginaWeb(String url, LocalDateTime fechaVisita) {
		super();
		this.url=url;
		this.fechaVisita=fechaVisita;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(fechaVisita, url);
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual= this==obj;
		
		if(!esIgual && obj!=null && obj instanceof PaginaWeb) {
			
			PaginaWeb otraPagina = (PaginaWeb) obj;
			
			esIgual = this.fechaVisita!=null && otraPagina.fechaVisita!=null 
					&& this.fechaVisita.equals(otraPagina.fechaVisita);
		}
		
		return esIgual;
	}


	@Override
	public String toString() {
		return "PaginaWeb: " + url + ", dia de la visita: a" + fechaVisita + "]";
	}
	
	
	
}
