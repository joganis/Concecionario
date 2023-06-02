package models;

import enums.DisponibilidadVehiculo;
import enums.TipoABS;
import enums.TipoCombustible;
import enums.TipoEstado;
import enums.TipoTransmision;
import enums.Tipo4x4;

public class Pick_Up extends Vehiculo {
    private Tipo4x4 es4x4;
    private double capacidadCajaCarga;

    public Pick_Up(int precio,String marca, String modelo, TipoEstado estadoV, int cambios, int cilindraje,
                   TipoCombustible combustible, TipoTransmision transmision, String foto,
                   int velocidadMaxima, TipoABS tieneABS, String placa, DisponibilidadVehiculo disponibilidad,
                   Tipo4x4 es4x4, double capacidadCajaCarga) {
        super(precio,marca, modelo, estadoV, cambios, cilindraje, combustible, transmision, foto, velocidadMaxima,
                tieneABS, placa, disponibilidad);
        this.es4x4 = es4x4;
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    public Tipo4x4 getEs4x4() {
        return es4x4;
    }

    public void setEs4x4(Tipo4x4 es4x4) {
        this.es4x4 = es4x4;
    }

    public double getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    public void setCapacidadCajaCarga(double capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    @Override
    public String toString() {
        return "Pick_Up{" +
        		"precio='" + getPrecio() + '\'' +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", estadoV=" + getEstadoV() +
                ", cambios=" + getCambios() +
                ", cilindraje=" + getCilindraje() +
                ", combustible=" + getCombustible() +
                ", transmision=" + getTransmision() +
                ", fotos=" + getFotos() +
                ", velocidadMaxima=" + getVelocidadMaxima() +
                ", tieneABS=" + getTieneABS() +
                ", placa='" + getPlaca() + '\'' +
                ", disponibilidad=" + getDisponibilidad() +
                ", es4x4=" + es4x4 +
                ", capacidadCajaCarga=" + capacidadCajaCarga +
                '}';
    }
}
