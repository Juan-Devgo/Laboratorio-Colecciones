package co.edu.uniquindio.Puntos.trece;

import java.util.PriorityQueue;

public class Hospital {
    private PriorityQueue<Paciente> pacientes;

    public Hospital() {
        pacientes = new PriorityQueue<Paciente>();
    }

    public void agregarPaciente(Paciente p) {
        if(p != null){
            pacientes.add(p);
        }
    }

    public Paciente atenderPaciente() {
        return pacientes.poll();
    }
}
