package co.edu.uniquindio.Puntos.diez;

import java.util.HashSet;

public class Edificio {
    private HashSet<String> empleados;

    public Edificio() {
        empleados = new HashSet<>();
    }

    public void agregarEmpleado(String empleado) {
        if (empleado != null && !empleado.isBlank()) {
            empleados.add(empleado);
        }
    }

    public boolean verificarID(String nombreEmpleado) {
        return empleados.contains(nombreEmpleado);
    }

    public HashSet<String> getEmpleados() {
        return empleados;
    }
}
