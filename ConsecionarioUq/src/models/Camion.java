package models;
import enums.TipoEstado;
import enums.TipoFrenoAire;

import java.util.Arrays;

import enums.TipoCamion;
import enums.TipoCombustible;
import enums.TipoTransmision;

	
	

	public class Camion extends Vehiculo {
	    private double capacidadCarga;
	    private TipoFrenoAire tipoFrenoAire;
	    private TipoCamion tipoCamion;

	    public Camion(String marca, String modelo, TipoEstado estadoV, int cambios, int cilindraje,
	                  TipoCombustible combustible, TipoTransmision transmision, String[] fotos,
	                  double capacidadCarga,  TipoFrenoAire tipoFrenoAire, TipoCamion tipoCamion) {
	        super(marca, modelo, estadoV, cambios, cilindraje, combustible, transmision, fotos);
	        this.capacidadCarga = capacidadCarga;
	        this.tipoFrenoAire = tipoFrenoAire;
	        this.tipoCamion = tipoCamion;
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

	    @Override
	    public String toString() {
	        return "Camion{" +
	                "marca='" + getMarca() + '\'' +
	                ", modelo='" + getModelo() + '\'' +
	                ", estadoV=" + getEstadoV() +
	                ", cambios=" + getCambios() +
	                ", cilindraje=" + getCilindraje() +
	                ", combustible=" + getCombustible() +
	                ", transmision=" + getTransmision() +
	                ", fotos=" + Arrays.toString(getFotos()) +
	                ", capacidadCarga=" + capacidadCarga +
	                ", tipoFrenoAire=" + tipoFrenoAire +
	                ", tipoCamion=" + tipoCamion +
	                '}';
	    }
	}