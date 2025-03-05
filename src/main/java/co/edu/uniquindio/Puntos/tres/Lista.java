package co.edu.uniquindio.Puntos.tres;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Object> lista;

    public Lista() {
        lista = new ArrayList<Object>();
    }

    public void add(Object o) {
        if(verificarNoDuplicado(o)){
            lista.add(o);
        }
    }

    @Override
    public String toString(){
        StringBuilder elementos = new StringBuilder();
        if(!lista.isEmpty()) {
            for (int i = 0; i < lista.size(); i++) {
                elementos.append(i).append(": ").append(lista.get(i).toString()).append("\n");
            }
        } else {
            elementos.append("Lista Vacía");
        }
        return elementos.toString();
    }

    private boolean verificarNoDuplicado(Object objAVerificar) {
        boolean NoEsDuplicado = true;

        for(Object o : lista){
            if(o.equals(objAVerificar)){
                NoEsDuplicado = false;
                break;
            }
        }

        return NoEsDuplicado;
    }
}