package co.edu.uniquindio.Puntos.once;

import java.util.LinkedHashSet;

public class ListaMusica {
    private LinkedHashSet<String> canciones;

    public ListaMusica() {
        canciones = new LinkedHashSet<String>();
    }

    public void agregarCancion(String cancion) {
        if(cancion != null && !cancion.isBlank()) {
            canciones.add(cancion);
        }
    }

    public void eliminarCancion(String cancion) {
        if(canciones.contains(cancion)) {
            canciones.remove(cancion);
        }
    }

    public String getCanciones() {
        StringBuilder listaCanciones = new StringBuilder();
        int i = 1;
        for (String cancion : canciones) {
            listaCanciones.append(i).append(": ").append(cancion).append("\n");
            i++;
        }
        return listaCanciones.toString();
    }
}
