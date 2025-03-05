package co.edu.uniquindio.Puntos.uno;

public class Producto implements Comparable {
    private final String nombre;
    private final String descripcion;
    private final Float precio;
    private final String id;

    public Producto(String nombre, String descripcion, Float precio, String id) {
        if(nombre == null || descripcion == null || id == null || precio <= 0 || nombre.isBlank() || descripcion.isBlank() || id.isBlank()){
            throw new IllegalArgumentException();
        }

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        return this.id.compareTo(((Producto)o).id);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public String getId() {
        return id;
    }
}
