package models;

import java.util.Arrays;

import enums.DisponibilidadVehiculo;
import enums.TipoABS;
import enums.TipoCombustible;
import enums.TipoEstado;
import enums.TipoTransmision;
import enums.TipoVelocidad;

public class Sedan extends Vehiculo {
    private double capacidadMaletero;
    private TipoVelocidad velocidadCrucero;

    public Sedan(int precio,String marca, String modelo, TipoEstado estadoV, int cambios, int cilindraje,
                 TipoCombustible combustible, TipoTransmision transmision, String foto, int velocidadMaxima, TipoABS tieneABS,
                 TipoVelocidad velocidadCrucero, double capacidadMaletero, String placa,
                 DisponibilidadVehiculo disponibilidad) {
        super(precio, marca, modelo, estadoV, cambios, cilindraje, combustible, transmision, foto, velocidadMaxima, tieneABS, placa,
                disponibilidad);
        this.capacidadMaletero = capacidadMaletero;
        this.velocidadCrucero = velocidadCrucero;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public TipoVelocidad getVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(TipoVelocidad velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    @Override
    public String toString() {
        return "Sedan{" +
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
                ", capacidadMaletero=" + capacidadMaletero +
                ", velocidadCrucero=" + velocidadCrucero +
                '}';
    }
}
