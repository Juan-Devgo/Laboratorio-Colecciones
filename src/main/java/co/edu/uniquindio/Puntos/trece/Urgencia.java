package co.edu.uniquindio.Puntos.trece;

public enum Urgencia {
    URGENTE(1),
    NO_TAN_URGENTE(2),
    NO_URGENTE(3);

    private final int valor;
    private Urgencia(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
