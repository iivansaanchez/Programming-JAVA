package euroMillon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Combinacion {
	
	protected static final int VALOR_MINIMO = 1;
	protected static final int VALOR_MAXIMO_NUMEROS = 51;
	protected static final int VALOR_MAXIMO_ESTRELLAS = 13;
	protected static final int TOTAL_NUMEROS = 5;
	protected static final int TOTAL_ESTRELLAS = 2;
	
	protected Set<Integer> numeros;
	protected Set<Integer> estrellas;
	protected List<Integer> combinacion;
	protected List<Integer> combinacionGanadora;
	
	protected List<Integer> numerosPosible;
	protected List<Integer> estrellasPosible;
	
	public Combinacion(int num1, int num2, int num3, int num4, int num5, int estre, int estre2) throws Exception{
		super();
		
		numeros = new HashSet<>();
		estrellas = new HashSet<>();
		combinacion = new ArrayList<>();
		numerosPosible = new ArrayList<>();
		estrellasPosible = new ArrayList<>();
		this.generarPremioEuroMillon();
		
		int num = VALOR_MINIMO;
		
		while(num<=VALOR_MAXIMO_NUMEROS) {
			numerosPosible.add(num);
			num++;
		}
		
		num = VALOR_MINIMO;
		
		while(num<=VALOR_MAXIMO_ESTRELLAS) {
			estrellasPosible.add(num);
			num++;
		}
		
		if(numerosPosible.contains(num1) && numerosPosible.contains(num2) && numerosPosible.contains(num3)
				&& numerosPosible.contains(num4) && numerosPosible.contains(num5) && estrellasPosible.contains(estre)
				&& estrellasPosible.contains(estre2)) {
			numeros.add(num1);
			numeros.add(num2);
			numeros.add(num3);
			numeros.add(num4);
			numeros.add(num5);
			estrellas.add(estre);
			estrellas.add(estre2);
		}else {
			throw new Exception("No es posible está combinacion.");
		}
		
		combinacion.addAll(numeros);
		combinacion.addAll(estrellas);
		
	}
	
	public Combinacion(Set<Integer> numbers, Set<Integer> stars) throws Exception{
		numeros=numbers;
		estrellas=stars;
		
		if(numerosPosible.containsAll(numbers) && estrellasPosible.containsAll(stars)) {
			combinacion.addAll(numbers);
			combinacion.addAll(stars);
		}else {
			throw new Exception("No es posible está combinación.");
		}
	}
	
	
	
	public void generarPremioEuroMillon() {
		
		combinacionGanadora = new ArrayList<>();
		
		Set<Integer> numerosGanadores = new HashSet<>();
		Set<Integer> estrellasGanadoras = new HashSet<>();
		
		int numero;
		for (int i = 0; i<5; i++) {
			numero = (int) (Math.random() * 50 +1);
			if(numerosGanadores.contains(numero)) {
				i--;
			}else {
				numerosGanadores.add(numero);
			}
		}
		
		for(int i = 0; i <2; i++) {
			numero = (int) (Math.random() * 12+1);
			if(estrellasGanadoras.contains(numero)) {
				i--;
			}else {
				estrellasGanadoras.add(numero);
			}
		}
		
		combinacionGanadora.addAll(numerosGanadores);
		combinacionGanadora.addAll(estrellasGanadoras);
		
		
	}
	
	public Set<Integer> getNumeros() {
		return numeros;
	}

	public Set<Integer> getEstrellas() {
		return estrellas;
	}

	public int comprobarCombinacion(Combinacion combinacionComprobar) {
		int aciertos = 0;
		
		for(int i = 0; i<=combinacionGanadora.size()-1; i++) {
			if(this.combinacionGanadora.get(i)==combinacionComprobar.combinacion.get(i)) {
				aciertos++;
			}
		}
		return aciertos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(combinacion);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null && obj instanceof Combinacion c && c.hashCode()==this.hashCode();
	}

	@Override
	public String toString() {
		return "Tú boleto es: " + combinacion + ", premio: " + combinacionGanadora;
	}
	
	
	
	
}
