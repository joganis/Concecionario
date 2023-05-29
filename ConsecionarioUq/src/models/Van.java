package models;

import java.util.Arrays;

import enums.DisponibilidadVehiculo;
import enums.TipoABS;
import enums.TipoCombustible;
import enums.TipoEstado;
import enums.TipoTransmision;

public class Van extends Vehiculo {
    private double capacidadMaletero;

    public Van(String marca, String modelo, TipoEstado estadoV, int cambios, int cilindraje,
               TipoCombustible combustible, TipoTransmision transmision, String[] fotos,
               int velocidadMaxima, TipoABS tieneABS, String placa, DisponibilidadVehiculo disponibilidad,
               double capacidadMaletero) {
        super(marca, modelo, estadoV, cambios, cilindraje, combustible, transmision, fotos,
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
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", estadoV=" + getEstadoV() +
                ", cambios=" + getCambios() +
                ", cilindraje=" + getCilindraje() +
                ", combustible=" + getCombustible() +
                ", transmision=" + getTransmision() +
                ", fotos=" + Arrays.toString(getFotos()) +
                ", velocidadMaxima=" + getVelocidadMaxima() +
                ", tieneABS=" + getTieneABS() +
                ", placa='" + getPlaca() + '\'' +
                ", disponibilidad=" + getDisponibilidad() +
                ", capacidadMaletero=" + capacidadMaletero +
                '}';
    }
}
