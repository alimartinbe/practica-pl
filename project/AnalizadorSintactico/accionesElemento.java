import java.io.*;
import java.util.ArrayList;

public class accionesElemento {

	String elemento;
	ArrayList<String> acciones;
	
	public accionesElemento() {
		
	}
	
	public accionesElemento(String elemento, ArrayList<String> acciones) {
		this.elemento = elemento;
		this.acciones = acciones;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public ArrayList<String> getAcciones() {
		return acciones;
	}

	public void setAcciones(ArrayList<String> acciones) {
		this.acciones = acciones;
	}
	
	public String toString() {
		return elemento + ", " + acciones.toString();
	}
}
