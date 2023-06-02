package models;

import java.util.Arrays;

import enums.DisponibilidadVehiculo;
import enums.TipoABS;
import enums.TipoCombustible;
import enums.TipoEstado;
import enums.TipoTransmision;

public class Van extends Vehiculo {
    private double capacidadMaletero;

    public Van(int precio,String marca, String modelo, TipoEstado estadoV, int cambios, int cilindraje,
               TipoCombustible combustible, TipoTransmision transmision, String foto,
               int velocidadMaxima, TipoABS tieneABS, String placa, DisponibilidadVehiculo disponibilidad,
               double capacidadMaletero) {
        super(precio, marca, modelo, estadoV, cambios, cilindraje, combustible, transmision, foto,
                velocidadMaxima, tieneABS, placa, disponibilidad);
        this.capacidadMaletero = capacidadMaletero;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public String toString() {
        return "Van{" +
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
                '}';
    }
}
