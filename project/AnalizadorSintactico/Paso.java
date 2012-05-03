
public class Paso {

	String accion;
	String elemento;
	String coord1;
	String coord2;
	
	public Paso() {
		
	}
	
	public Paso(String accion, String elemento, String coord1, String coord2) {
		this.accion = accion;
		this.elemento = elemento;
		this.coord1 = coord1;
		this.coord2 = coord2;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public String getCoord1() {
		return coord1;
	}

	public void setCoord1(String coord1) {
		this.coord1 = coord1;
	}

	public String getCoord2() {
		return coord2;
	}

	public void setCoord2(String coord2) {
		this.coord2 = coord2;
	}
	
	public String toString() {
		return accion + "(" + elemento + ", " + coord1 + ", " + coord2 + ")";
	}
}
