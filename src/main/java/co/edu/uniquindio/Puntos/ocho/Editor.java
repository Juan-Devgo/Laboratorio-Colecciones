package co.edu.uniquindio.Puntos.ocho;

import java.util.Vector;

public class Editor {
    private Vector<String> cambios;

    public Editor() {
        this.cambios = new Vector<>();
    }

    public void deshacerCambio() {
        cambios.remove(cambios.size() - 1);
    }

    public void aniadirCambio(String cambio) {
        if(cambio != null && !cambio.isBlank()) {
            cambios.add(cambio);
        }
    }

    public Vector<String> getCambios() {
        return cambios;
    }
}
