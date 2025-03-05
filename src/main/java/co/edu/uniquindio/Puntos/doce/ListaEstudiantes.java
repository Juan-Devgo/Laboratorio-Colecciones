package co.edu.uniquindio.Puntos.doce;

import java.util.TreeSet;

public class ListaEstudiantes {
    private TreeSet<String> estudiantes;

    public ListaEstudiantes() {
        estudiantes = new TreeSet<>();
    }

    public void agregarEstudiante(String estudiante) {
        if(estudiante != null && !estudiante.isBlank()){
            estudiantes.add(estudiante);
        }
    }

    public TreeSet<String> getEstudiantes() {
        return estudiantes;
    }
}
