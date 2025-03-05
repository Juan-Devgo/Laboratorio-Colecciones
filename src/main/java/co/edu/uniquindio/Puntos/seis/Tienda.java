package co.edu.uniquindio.Puntos.seis;

import co.edu.uniquindio.Puntos.uno.Producto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

public class Tienda {
    private ArrayList<Producto> productos;

    public Tienda() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if(producto != null) {
            productos.add(producto);
        }
    }

    public void eliminarProducto(Producto producto) {
        if(producto != null && productos.contains(producto)) {
            productos.remove(producto);
        }
    }

    public Optional<Producto> buscarProducto(String id){
        return productos.stream().filter(producto -> producto.getId().equals(id)).findFirst();
    }

    public String listarProductosAlfabeticamente() {
        StringBuilder nombresProductos = new StringBuilder();

        Collections.sort(productos, new Comparator<Producto>() {

            @Override
            public int compare(Producto p1, Producto p2) {
                return p1.getNombre().compareToIgnoreCase(p2.getNombre());
            }});

        for (Producto producto : productos) {
            nombresProductos.append(producto.getNombre()).append(" ");
        }

        return nombresProductos.toString();
    }

    public String listarProductosPrecio() {
        StringBuilder nombresProductos = new StringBuilder();

        Collections.sort(productos, new Comparator<Producto>() {

            @Override
            public int compare(Producto p1, Producto p2) {
                return p1.getPrecio().compareTo(p2.getPrecio());
            }});

        for (Producto producto : productos) {
            nombresProductos.append(producto.getNombre()).append(" ");
        }

        return nombresProductos.toString();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}
