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

public class Moto extends Automovil {
    public Moto(int precio,String marca, String modelo, TipoEstado estadoV, int cambios, int cilindraje,
                TipoCombustible combustible, TipoTransmision transmision, String foto, int velocidadMaxima, TipoABS tieneABS, String placa, DisponibilidadVehiculo disponibilidad,
                int numPasajeros, int numPuertas, TieneCamara tieneCamara, TieneSensor tieneSensorTrafico,
                SensorColision tieneSensorColision,
                int numBolsas, AsistentePermanencia asistentePermanencia, AireAcondicionado aireAcondicionado) {
        super(precio,marca, modelo, estadoV, cambios, cilindraje, combustible, transmision, foto, velocidadMaxima, tieneABS,placa,disponibilidad,
                numPasajeros, numPuertas, tieneCamara, tieneSensorTrafico, tieneSensorColision,
                numBolsas, asistentePermanencia, aireAcondicionado);
    }

    @Override
    public String toString() {
        return "Moto{" +
        		"precio='" + getPrecio() + '\'' +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", estadoV=" + getEstadoV() +
                ", cambios=" + getCambios() +
                ", cilindraje=" + getCilindraje() +
                ", combustible=" + getCombustible() +
                ", transmision=" + getTransmision() +
                ", fotos=" + getFotos() +
                ", numPasajeros=" + getNumPasajeros() +
                ", numPuertas=" + getNumPuertas() +
                ", tieneCamara=" + getTieneCamara() +
                ", tieneSensorTrafico=" + getTieneSensorTrafico() +
                ", numBolsas=" + getNumBolsas() +
                ", asistentePermanencia=" + getAsistentePermanencia() +
                ", aireAcondicionado=" + getAireAcondicionado() +
                '}';
    }

}
