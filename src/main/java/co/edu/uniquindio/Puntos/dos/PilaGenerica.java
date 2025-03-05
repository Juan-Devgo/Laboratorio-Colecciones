package co.edu.uniquindio.Puntos.dos;

import java.util.Stack;

public class PilaGenerica {
    private final Stack<Object> pilaGenerica;

    public PilaGenerica() {
        pilaGenerica = new Stack<>();
    }

    public void push(Object item) {
        if(!pilaGenerica.isEmpty()) {
            if (verificarTipo(item, pilaGenerica.peek())) {
                pilaGenerica.push(item);
            }
        } else {
            pilaGenerica.push(item);
        }
    }

    private boolean verificarTipo(Object item, Object cimaPila) {
        return  item.getClass().equals(cimaPila.getClass());
    }

    @Override
    public String toString() {
        StringBuilder elementos = new StringBuilder();
        for (Object objeto : pilaGenerica) {
            elementos.append(objeto).append("\n");
        }
        return elementos.toString();
    }
}
