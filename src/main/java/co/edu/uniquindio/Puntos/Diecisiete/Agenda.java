package co.edu.uniquindio.Puntos.Diecisiete;

import java.time.LocalDate;
import java.util.TreeMap;

public class Agenda {
    private TreeMap<LocalDate, String> eventos;

    public Agenda() {
        eventos = new TreeMap<>();
    }

    public void agregarEvento(LocalDate fecha, String evento) {
        if(fecha != null && evento != null && !evento.isBlank()) {
            eventos.put(fecha, evento);
        }
    }

    public TreeMap<LocalDate, String> getEventos() {
        return eventos;
    }
}
