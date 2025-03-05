package co.edu.uniquindio.Puntos.uno;

import java.util.Optional;
import java.util.TreeSet;

public class Empresa {
    private final TreeSet<Producto> productos;

    public Empresa() {
        this.productos = new TreeSet<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public Optional<Producto> buscarProducto(String id) {
        return productos.stream().filter(producto -> producto.getId().equals(id)).findFirst();
    }

    public TreeSet<Producto> getProductos() {
        return productos;
    }
}
