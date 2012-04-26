import java.io.*;
import java.util.ArrayList;

public class posiblesAcciones {

	accionesElemento personaje;
	ArrayList<accionesElemento> objetos;
	
	public posiblesAcciones() {
		
	}
	
	public posiblesAcciones(accionesElemento personaje, ArrayList<accionesElemento> objetos) {
		this.personaje = personaje;
		this.objetos = objetos;
	}

	public accionesElemento getPersonaje() {
		return personaje;
	}

	public void setPersonaje(accionesElemento personaje) {
		this.personaje = personaje;
	}

	public ArrayList<accionesElemento> getObjetos() {
		return objetos;
	}

	public void setObjetos(ArrayList<accionesElemento> objetos) {
		this.objetos = objetos;
	}
	
}
