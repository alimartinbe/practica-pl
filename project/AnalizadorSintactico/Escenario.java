import java.io.*;
import java.util.ArrayList;

public class Escenario {

    private String personaje, fondo;
    private ArrayList<String> lista;

    public Escenario() {

    }

    public Escenario(String personaje, String fondo, ArrayList<String> lista) {
        this.personaje = personaje;
        this.fondo = fondo;
        this.lista = lista;
    }

    public String getPersonaje() {
        return personaje;
    }

    public String getFondo() {
        return fondo;
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setPersonaje (String p) {
        personaje = p;
    }

    public void setFondo (String f) {
        fondo = f;
    }

    public void setLista (ArrayList<String> l) {
        lista.clear();
        lista.addAll(l);
    }
}
