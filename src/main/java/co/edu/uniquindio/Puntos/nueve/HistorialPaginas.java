package co.edu.uniquindio.Puntos.nueve;

import java.util.Stack;

public class HistorialPaginas {
    private Stack<String> urls;

    public HistorialPaginas() {
        urls = new Stack<>();
    }

    public void agregarPagina(String url) {
        if (url != null && !url.isBlank()) {
            urls.push(url);
        }
    }

    public void devolverPagina() {
        urls.pop();
    }

    public Stack<String> getUrls() {
        return urls;
    }

    public String getPaginaActual() {
        return urls.peek();
    }
}
