package models;

import java.util.Arrays;

import enums.AireAcondicionado;
import enums.AsistentePermanencia;
import enums.DisponibilidadVehiculo;
import enums.SensorColision;
import enums.TieneCamara;
import enums.TieneSensor;
import enums.TipoABS;
import enums.TipoCombustible;
import enums.TipoEstado;
import enums.TipoTransmision;

public class Deportivo extends Automovil {
    private int numCaballosFuerza;
    private double tiempo0_100;

    public Deportivo(int precio,String marca, String modelo, TipoEstado estadoV, int cambios, int cilindraje,
                     TipoCombustible combustible, TipoTransmision transmision, String foto, int velocidadMaxima,
                     TipoABS tieneABS, String placa, DisponibilidadVehiculo disponibilidad, int numPasajeros,
                     int numPuertas, TieneCamara tieneCamara, TieneSensor tieneSensorTrafico,
                     SensorColision tieneSensorColision, int numBolsas, AsistentePermanencia asistentePermanencia,
                     AireAcondicionado aireAcondicionado, int numCaballosFuerza, double tiempo0_100) {
        super(precio, marca, modelo, estadoV, cambios, cilindraje, combustible, transmision, foto, velocidadMaxima,
                tieneABS, placa, disponibilidad, numPasajeros, numPuertas, tieneCamara, tieneSensorTrafico,
                tieneSensorColision, numBolsas, asistentePermanencia, aireAcondicionado);
        this.numCaballosFuerza = numCaballosFuerza;
        this.tiempo0_100 = tiempo0_100;
    }

    public int getNumCaballosFuerza() {
        return numCaballosFuerza;
    }

    public void setNumCaballosFuerza(int numCaballosFuerza) {
        this.numCaballosFuerza = numCaballosFuerza;
    }

    public double getTiempo0_100() {
        return tiempo0_100;
    }

    public void setTiempo0_100(double tiempo0_100) {
        this.tiempo0_100 = tiempo0_100;
    }

    @Override
    public String toString() {
        return "Deportivo{" +
        		"precio='" + getPrecio() + '\'' +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", estadoV=" + getEstadoV() +
                ", cambios=" + getCambios() +
                ", cilindraje=" + getCilindraje() +
                ", combustible=" + getCombustible() +
                ", transmision=" + getTransmision() +
                ", fotos=" +getFotos() +
                ", velocidadMaxima=" + getVelocidadMaxima() +
                ", tieneABS=" + getTieneABS() +
                ", placa='" + getPlaca() + '\'' +
                ", disponibilidad=" + getDisponibilidad() +
                ", numPasajeros=" + getNumPasajeros() +
                ", numPuertas=" + getNumPuertas() +
                ", tieneCamara=" + getTieneCamara() +
                ", tieneSensorTrafico=" + getTieneSensorTrafico() +
                ", tieneSensorColision=" + getTieneSensorColision() +
                ", numBolsas=" + getNumBolsas() +
                ", asistentePermanencia=" + getAsistentePermanencia() +
                ", aireAcondicionado=" + getAireAcondicionado() +
                ", numCaballosFuerza=" + numCaballosFuerza +
                ", tiempo0_100=" + tiempo0_100 +
                '}';
    }
}
