import java.util.ArrayList;


public class Utilidades {
	
	public Utilidades() {
		
	}

	public String comprobarReglasSemanticas(Escenario e, Inicio i, posiblesAcciones p, ArrayList<Paso> pl) {
		String resultado = "Análisis semántico correcto"; 
		
		if (repetidosObjetos(e.getLista())) {
			System.out.println("Hay objetos repetidos en la lista de la definición" +
			"de Escenario.");
			resultado = "Análisis semántico incorrecto";
		}
		
		if (noDefinidosObjetos(e, i)) {
			System.out.println("El personaje o los objetos de Escenario e Inicio son diferentes.");
			resultado = "Análisis semántico incorrecto";
		}
		
		if (distintaPosicion(i.getLista())) {
			System.out.println("Hay dos o más objetos en la misma posición.");
			resultado = "Análisis semántico incorrecto";
		}
			
		
		return resultado;
		
	}
	
	public boolean repetidosObjetos(ArrayList<String> l) {
		boolean rep = false;
		
		for (int i = 0; i < l.size() && !rep; i++) {
			String el = l.get(i);
			for (int j = i+1; j < l.size() && !rep; j++) {
				if (el.equals(l.get(j))) rep = true;
			}
		}
		
		return rep;
	}
	
	public boolean noDefinidosObjetos(Escenario e, Inicio i) {
		boolean def = false;
		
		if (!i.getPersonaje().getElemento().equals(e.getPersonaje())) def = true;
		if (i.getLista().size() != e.getLista().size()) def = true;
		for(int j = 0; j < i.getLista().size() && !def; j++) {
			if(!e.getLista().contains(i.getLista().get(j).getElemento())) def = true;
		}
		
		return def;
	}
	
	public boolean distintaPosicion(ArrayList<Inicializacion> lisIni) {
		boolean pos = false;
		
		for (int i = 0; i < lisIni.size() && !pos; i++) {
			Inicializacion in = lisIni.get(i);
			
			for (int j = i+1; j < lisIni.size() && !pos; j++) {
				if (in.getPosicion().equals(lisIni.get(j).getPosicion()) && 
						in.getUbicacion().equals(lisIni.get(j).getUbicacion())) pos = true;
			}
		}
		
		return pos;
	}
	
	
}
