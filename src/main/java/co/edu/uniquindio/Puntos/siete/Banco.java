package co.edu.uniquindio.Puntos.siete;

import java.util.LinkedList;

public class Banco {
    private LinkedList<String> clientes;

    public Banco() {
        clientes = new LinkedList<>();
    }

    public void agregarClienteACola(String nombre) {
        if(nombre != null && !nombre.isBlank()) {
            clientes.add(nombre);
        }
    }

    public void agregarClienteACabeza(String nombre) {
        if(nombre != null && !nombre.isBlank()) {
            clientes.add (0, nombre);
        }
    }

    public String atenderPrimerCLiente() {
        return clientes.getFirst();
    }
}
