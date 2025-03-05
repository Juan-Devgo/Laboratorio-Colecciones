package co.edu.uniquindio.Puntos.catorce;

import java.util.ArrayDeque;
import java.util.Collections;

public class Mensajeria {
    private ArrayDeque<String> mensajes;

    public Mensajeria() {
        mensajes = new ArrayDeque<>();
    }

    public void agregarMensaje(String mensaje) {
        if(mensaje != null && !mensaje.isBlank()) {
            mensajes.push(mensaje);
        }
    }

    public String recuperarMensajes() {
        StringBuilder ultimosMensajes = new StringBuilder();

        int i = 1; ArrayDeque<String> mensajesClon = mensajes.clone();
        while(!mensajes.isEmpty() && i <= 10) {
            ultimosMensajes.append(i).append(": ").append(mensajesClon.poll()).append("\n");
            i++;
        }

        return ultimosMensajes.toString();
    }
}
