package com.udu.liga.model;

public class Equipo {

	public String estadio;
	public String ciudad;
	public String nombreEquipo;
	public int partidosGanados;
	//CONSTRUCTORES
	public Equipo() {
		super();
	}
	
	public Equipo(String estadio, String ciudad, String nombreEquipo) {
		this.estadio=estadio;
		this.ciudad=ciudad;
		this.nombreEquipo=nombreEquipo;
	}
//GETTERS AND SETTERS
	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public int getPartidosGanados() {
		return partidosGanados;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}
//TOSTRING
	@Override
	public String toString() {
		return "El equipo "+this.nombreEquipo+" de la ciudad de: "+this.ciudad+"\n"+
				"que juega en el estadio "+this.estadio+" acumula "+this.partidosGanados+"\n"+
				"victorias.";
	}
	
	
	
	
}
