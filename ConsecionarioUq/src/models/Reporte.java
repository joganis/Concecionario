package models;

import enums.TipoTramite;

public class Reporte {
    private Cliente cliente;
    private String fecha;
    private Persona empleado;
    private TipoTramite tramite;
    private Vehiculo vehiculo;

    public Reporte(Cliente cliente, String fecha, Persona empleado, TipoTramite tramite, Vehiculo vehiculo) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.empleado = empleado;
        this.tramite = tramite;
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public Persona getEmpleado() {
        return empleado;
    }

    public TipoTramite getTramite() {
        return tramite;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    // Puedes agregar métodos adicionales según tus necesidades

    @Override
    public String toString() {
        return "Reporte{" +
                "cliente=" + cliente +
                ", fecha='" + fecha + '\'' +
                ", empleado=" + empleado +
                ", tramite=" + tramite +
                ", vehiculo=" + vehiculo +
                '}';
    }
}
