package co.edu.uniquindio.Puntos.cuatro;

public class Tarea implements Comparable {
    private String titulo;
    private String descripcion;
    private Prioridad prioridad;

    public Tarea(String titulo, String descripcion, Prioridad prioridad) {
        if(titulo == null || descripcion == null || prioridad == null || titulo.isBlank() || descripcion.isBlank()){
            throw new IllegalArgumentException();
        }

        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Object o) {
        return this.prioridad.getValor().compareTo(((Tarea)o).getPrioridad().getValor());
    }
}
