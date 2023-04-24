package euroMillon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Historial {
	
	private Map<LocalDate, Combinacion> sorteos;
	
	public Historial() {
		sorteos = new HashMap<>();
	}
	
	public boolean addSorteo(LocalDate fechaSorteo, Combinacion combinacion) throws ExceptionHistorial{
		boolean res = false;
		if(fechaSorteo==null || combinacion == null || sorteos.containsKey(fechaSorteo)) {
			
			throw new ExceptionHistorial("No se puede añadir el premio porque ya hay uno asignado.");
		}else {
			sorteos.put(fechaSorteo, combinacion);
			res=true;
			
		}
		return res;
	}

	public boolean addSorteo(int dia, int mes, int anyo, Combinacion combinacion) throws ExceptionHistorial {
		Historial historial = new Historial();

		return historial.addSorteo(LocalDate.of(anyo, mes, dia), combinacion);
	}
	
	public boolean actualizarSorteo(LocalDate fechaNuevaSorteo, Combinacion combinacion) throws ExceptionHistorial{
		boolean res = false;
		
		combinacion.generarPremioEuroMillon();
		
		if(!sorteos.containsKey(fechaNuevaSorteo)){
			throw new ExceptionHistorial("No existe esa fecha para poder ser actulizada.");
		}else {
			sorteos.remove(fechaNuevaSorteo);
			sorteos.put(fechaNuevaSorteo, combinacion);
			res=true;
		}
		return res;
	}
	
	public boolean actualizarSorteo(int dia, int mes, int anyo, Combinacion combinacion) throws ExceptionHistorial {
		Historial historial = new Historial();
		
		return historial.actualizarSorteo(LocalDate.of(anyo, mes, dia), combinacion);
	}

	public boolean borrarSorteo(LocalDate fechaSorteo) throws ExceptionHistorial{
		boolean res=false;
		if(!sorteos.containsKey(fechaSorteo) || fechaSorteo==null) {
			throw new ExceptionHistorial("Error, no se ha puede borrar ese sorteo.");
		}else {
			res= true;
			sorteos.remove(fechaSorteo);
		}
		return res;
	}
	//NO SE HACERLO
	public List<String> listarSorteosDesdeFecha(LocalDate fecha){
		return null;
	}
	
	public List<Combinacion> mostrarHistorico(){
		List<Combinacion> historico = new ArrayList<>();
		historico.addAll(sorteos.values());
		return historico;
	}
	
	public Map<String, Integer> comprobarAciertos(LocalDate fecha, Combinacion c1){
		Map<String, Integer> aciertos = new HashMap<>();
			aciertos.put(c1.toString(), c1.comprobarCombinacion(c1));	
		
		return aciertos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
