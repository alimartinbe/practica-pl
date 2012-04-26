import java.io.*;

public class Inicializacion {

    String elemento, posicion, ubicacion;

    public Inicializacion () {

    }

    public Inicializacion(String elemento, String posicion, String ubicacion) {
        this.elemento = elemento;
        this.posicion = posicion;
        this.ubicacion = ubicacion;
    }

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
    
    

}
