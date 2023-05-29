package models;

import enums.DisponibilidadVehiculo;
import enums.TipoABS;
import enums.TipoCombustible;
import enums.TipoEstado;
import enums.TipoTransmision;
import enums.Tipo4x4;
import enums.TipoVelocidad;

public class Suv_Camioneta extends Vehiculo {
    private double capacidadMaletero;
    private TipoVelocidad velocidadCrucero;
    private Tipo4x4 es4x4;

    public Suv_Camioneta(String marca, String modelo, TipoEstado estadoV, int cambios, int cilindraje,
                         TipoCombustible combustible, TipoTransmision transmision, String[] fotos,
                         int velocidadMaxima, TipoABS tieneABS, String placa, DisponibilidadVehiculo disponibilidad,
                         double capacidadMaletero, TipoVelocidad velocidadCrucero, Tipo4x4 es4x4) {
        super(marca, modelo, estadoV, cambios, cilindraje, combustible, transmision, fotos, velocidadMaxima,
                tieneABS, placa, disponibilidad);
        this.capacidadMaletero = capacidadMaletero;
        this.velocidadCrucero = velocidadCrucero;
        this.es4x4 = es4x4;
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

    public Tipo4x4 getEs4x4() {
        return es4x4;
    }

    public void setEs4x4(Tipo4x4 es4x4) {
        this.es4x4 = es4x4;
    }

    @Override
    public String toString() {
        return "Suv_Camioneta{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", estadoV=" + getEstadoV() +
                ", cambios=" + getCambios() +
                ", cilindraje=" + getCilindraje() +
                ", combustible=" + getCombustible() +
                ", transmision=" + getTransmision() +
                ", fotos=" + java.util.Arrays.toString(getFotos()) +
                ", velocidadMaxima=" + getVelocidadMaxima() +
                ", tieneABS=" + getTieneABS() +
                ", placa='" + getPlaca() + '\'' +
                ", disponibilidad=" + getDisponibilidad() +
                ", capacidadMaletero=" + capacidadMaletero +
                ", velocidadCrucero=" + velocidadCrucero +
                ", es4x4=" + es4x4 +
                '}';
    }
}

