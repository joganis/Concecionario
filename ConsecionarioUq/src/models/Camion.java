package models;
import enums.TipoEstado;
import enums.TipoFrenoAire;
import java.util.Arrays;
import enums.DisponibilidadVehiculo;
import enums.TipoABS;
import enums.TipoCamion;
import enums.TipoCombustible;
import enums.TipoTransmision;

public class Camion extends Vehiculo {
    private double capacidadCarga;
    private TipoFrenoAire tipoFrenoAire;
    private TipoCamion tipoCamion;
    private int numEjes;

    public Camion(int precio,String marca, String modelo, TipoEstado estadoV, int cambios, int cilindraje,
                  TipoCombustible combustible, TipoTransmision transmision, String foto, int velocidadMaxima,
                  TipoABS tieneABS, String placa, DisponibilidadVehiculo disponibilidad, double capacidadCarga,
                  TipoFrenoAire tipoFrenoAire, TipoCamion tipoCamion, int numEjes) {
        super(precio,marca, modelo, estadoV, cambios, cilindraje, combustible, transmision, foto, velocidadMaxima, tieneABS,
                placa, disponibilidad);
        this.capacidadCarga = capacidadCarga;
        this.tipoFrenoAire = tipoFrenoAire;
        this.tipoCamion = tipoCamion;
        this.numEjes = numEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public TipoFrenoAire getTipoFrenoAire() {
        return tipoFrenoAire;
    }

    public void setTipoFrenoAire(TipoFrenoAire tipoFrenoAire) {
        this.tipoFrenoAire = tipoFrenoAire;
    }

    public TipoCamion getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(TipoCamion tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    @Override
    public String toString() {
        return "Camion{" +
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
                ", capacidadCarga=" + capacidadCarga +
                ", tipoFrenoAire=" + tipoFrenoAire +
                ", tipoCamion=" + tipoCamion +
                ", numEjes=" + numEjes +
                '}';
    }
}
