package co.edu.uniquindio.Puntos.quince;

import java.util.LinkedHashMap;

public class DirectorioTelefonico {
    private LinkedHashMap<String, String> contactos;

    public DirectorioTelefonico() {
        contactos = new LinkedHashMap<>();
    }

    public void agregarContacto(String nombre, String telefono) {
        if(nombre != null && telefono != null && !nombre.isBlank() && !telefono.isBlank()) {
            contactos.put(telefono, nombre);
        }
    }

    public LinkedHashMap<String, String> getContactos() {
        return contactos;
    }
}
