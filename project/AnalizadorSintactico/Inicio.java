import java.io.*;
import java.util.ArrayList;

public class Inicio {

    private Inicializacion personaje;
    
    private ArrayList<Inicializacion> lista;
    
    public Inicio() {
    	
    }
    
    public Inicio(Inicializacion personaje, ArrayList<Inicializacion> lista) {
    	this.personaje = personaje;
    	this.lista = lista;
    }

	public Inicializacion getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Inicializacion personaje) {
		this.personaje = personaje;
	}

	public ArrayList<Inicializacion> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Inicializacion> lista) {
		this.lista = lista;
	}
    
    

}

