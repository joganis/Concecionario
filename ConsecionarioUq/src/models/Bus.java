package models;
import enums.TipoEstado;
import enums.TipoCombustible;
import enums.TipoTransmision;
import enums.DisponibilidadVehiculo;
import enums.TipoABS;

public class Bus extends Vehiculo {
    private int numEjes;
    private int numSalidasEmergencia;
    private double capacidadMaletero;

    public Bus(int precio,String marca, String modelo, TipoEstado estadoV, int cambios, int cilindraje,
               TipoCombustible combustible, TipoTransmision transmision, String foto, int velocidadMaxima,
               TipoABS tieneABS, String placa, DisponibilidadVehiculo disponibilidad, int numEjes,
               int numSalidasEmergencia, double capacidadMaletero) {
        super(precio,marca, modelo, estadoV, cambios, cilindraje, combustible, transmision, foto, velocidadMaxima,
                tieneABS, placa, disponibilidad);
        this.numEjes = numEjes;
        this.numSalidasEmergencia = numSalidasEmergencia;
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public int getNumSalidasEmergencia() {
        return numSalidasEmergencia;
    }

    public void setNumSalidasEmergencia(int numSalidasEmergencia) {
        this.numSalidasEmergencia = numSalidasEmergencia;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public String toString() {
        return "Bus{" +
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
                ", numEjes=" + numEjes +
                ", numSalidasEmergencia=" + numSalidasEmergencia +
                ", capacidadMaletero=" + capacidadMaletero +
                '}';
    }
}
