package co.edu.uniquindio.Puntos.dieciseis;

import co.edu.uniquindio.Puntos.uno.Producto;

import java.util.LinkedHashMap;

public class ProductosComprados {
    LinkedHashMap<Producto, Float> productos;

    public ProductosComprados() {
        productos = new LinkedHashMap<>();
    }

    public void agregarProducto(Producto producto) {
        if(producto != null) {
            productos.put(producto, producto.getPrecio());
        }
    }

    public Float calcularTotalProductos() {
        Float total = 0f;

        for(Producto producto : productos.keySet()) {
            total += producto.getPrecio();
        }

        return total;
    }

    public LinkedHashMap<Producto, Float> getProductos() {
        return productos;
    }
}
