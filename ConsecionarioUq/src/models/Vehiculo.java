package models;

import enums.DisponibilidadVehiculo;
import enums.TipoABS;
import enums.TipoCombustible;
import enums.TipoEstado;
import enums.TipoTransmision;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private TipoEstado estadoV;
    private int cambios;
    private int cilindraje;
    private TipoCombustible combustible;
    private TipoTransmision transmision;
    private String[] fotos;
    private int velocidadMaxima;
    private TipoABS tieneABS;
    private String placa;
    private DisponibilidadVehiculo disponibilidad;

    public Vehiculo(String marca, String modelo, TipoEstado estadoV, int cambios, int cilindraje,
                    TipoCombustible combustible, TipoTransmision transmision, String[] fotos,
                    int velocidadMaxima, TipoABS tieneABS, String placa, DisponibilidadVehiculo disponibilidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.estadoV = estadoV;
        this.cambios = cambios;
        this.cilindraje = cilindraje;
        this.combustible = combustible;
        this.transmision = transmision;
        this.fotos = fotos;
        this.velocidadMaxima = velocidadMaxima;
        this.tieneABS = tieneABS;
        this.placa = placa;
        this.disponibilidad = disponibilidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoEstado getEstadoV() {
        return estadoV;
    }

    public void setEstadoV(TipoEstado estadoV) {
        this.estadoV = estadoV;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public TipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TipoCombustible combustible) {
        this.combustible = combustible;
    }

    public TipoTransmision getTransmision() {
        return transmision;
    }

    public void setTransmision(TipoTransmision transmision) {
        this.transmision = transmision;
    }

    public String[] getFotos() {
        return fotos;
    }

    public void setFotos(String[] fotos) {
        this.fotos = fotos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public TipoABS getTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(TipoABS tieneABS) {
        this.tieneABS = tieneABS;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public DisponibilidadVehiculo getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(DisponibilidadVehiculo disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public abstract String toString();
}
