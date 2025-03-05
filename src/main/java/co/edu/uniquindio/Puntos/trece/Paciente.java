package co.edu.uniquindio.Puntos.trece;

public class Paciente implements Comparable {
    String nombre;
    String id;
    Urgencia urgencia;

    public Paciente(String nombre, String id, Urgencia urgencia) {
        if(nombre == null || id == null || urgencia == null || nombre.isBlank() || id.isBlank()) {
            throw new IllegalArgumentException();
        }

        this.nombre = nombre;
        this.id = id;
        this.urgencia = urgencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public Urgencia getUrgencia() {
        return urgencia;
    }

    @Override
    public int compareTo(Object o) {
        return Integer.valueOf(this.urgencia.getValor()).compareTo(Integer.valueOf(((Paciente) o).getUrgencia().getValor()));
    }

    @Override
    public String toString() {
        return nombre + " " + id + " " + urgencia;
    }
}
