package com.udu.liga.model;


public class Partido {

	public char resultado;
	public int jornada;
	public int golLocal;
	public int golVisitante;
	
	Equipo equipoA;
	Equipo equipoB;
	
	//CONSTRUCTORES
	public Partido() {
		super();
	}
	
	public Partido(int jornada, Equipo equipoA, Equipo equipoB) {
		this.jornada=jornada;
		this.equipoA=equipoA;
		this.equipoB=equipoB;
	}
	//METODOS
	public void ponerResultado(String resultado) {
		Integer resultadoA;//Aqui almacenaremos el resultado LOCAL
		Integer resultadoB;//Aqui almacenaremos el resultado VISITANTE
		Integer partidosGanados;//Aqui almacenaremos el total de partido ganados del equipo.
		
		
		if(equipoA.nombreEquipo!=equipoB.nombreEquipo) { //Condicion para que se pueda dar el partido
			resultadoA=Integer.valueOf(resultado.substring(0, 1));
			resultadoB=Integer.valueOf(resultado.substring(2));
		
			this.setGolLocal(resultadoA);
			this.setGolVisitante(resultadoB);
			
			if(resultadoA>resultadoB) {
				partidosGanados=equipoA.getPartidosGanados()+1;
				equipoA.setPartidosGanados(partidosGanados);
				
				this.resultado='1';
			}else if(resultadoA==resultadoB) {
				this.resultado='X';
			}else {
				partidosGanados=equipoA.getPartidosGanados()+1;
				equipoA.setPartidosGanados(partidosGanados);
				this.resultado='2';
			}
			
		}else {
			System.out.println("El partido no es válido.");
		}
	}
//GETTERS AND SETTERS
	public int getGolLocal() {
		return golLocal;
	}

	public void setGolLocal(int golLocal) {
		this.golLocal = golLocal;
	}

	public int getGolVisitante() {
		return golVisitante;
	}

	public void setGolVisitante(int golVisitante) {
		this.golVisitante = golVisitante;
	}

	public char getResultado() {
		return resultado;
	}

	public int getJornada() {
		return jornada;
	}
	
//TOSTRING
	/**
	 * En este toString ponemos de condicion que si el resultado de la quiniela esta actualizado
	 * el partido esta jugado y te muestra los datos del partido en el caso contrario te dice
	 * que el partido no se ha jugado
	 */
	@Override
	public String toString() {
		String res="";
	
		if(this.getResultado()!='1' && this.getResultado()!='X' && this.getResultado()!='2') {
			res+="Partido entre equipo Local: "+equipoA.getNombreEquipo()+" y equipo visitante: "
					+equipoB.getNombreEquipo()+"\ntodavía no se ha jugado";
		}else{
			res+="Partido entre equipo Local: "+equipoA.getNombreEquipo()+" y equipo visitante: \n"
					+equipoB.getNombreEquipo()+" jugado en el estadio: "+equipoA.getEstadio()+
					" de la ciudad: "+equipoA.ciudad+ "\nha finalizado con: "+this.getGolLocal()+
					" goles del equipo local y "+this.getGolVisitante()+" goles del equipo visitante."+
					"\nResultado quiniela: "+this.getResultado();
		}
		return res;
	}
	
	
}
