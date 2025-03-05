package co.edu.uniquindio.Puntos.cuatro;

public enum Prioridad {

    MUY_ALTA(1),
    ALTA(2),
    MEDIA(3),
    BAJA(4),
    MUY_BAJA(5);

    private final int valor;
    Prioridad(int valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }
}
