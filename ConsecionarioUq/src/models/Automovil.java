package models;

import java.util.Arrays;

import enums.AireAcondicionado;
import enums.AsistentePermanencia;
import enums.TieneCamara;
import enums.TieneSensor;
import enums.TipoCombustible;
import enums.TipoEstado;
import enums.TipoTransmision;

public class Automovil extends Vehiculo {
	    private int numPasajeros;
	    private int numPuertas;
	    private TieneCamara tieneCamara;
	    private TieneSensor tieneSensorTrafico;
	    private int numBolsas;
	    private AsistentePermanencia asistentePermanencia;
	    private AireAcondicionado aireAcondicionado;

	    public Automovil(String marca, String modelo, TipoEstado estadoV, int cambios, int cilindraje,
	                     TipoCombustible combustible, TipoTransmision transmision, String[] fotos,
	                     int numPasajeros, int numPuertas, TieneCamara tieneCamara, TieneSensor tieneSensorTrafico,
	                     int numBolsas, AsistentePermanencia asistentePermanencia, AireAcondicionado aireAcondicionado) {
	        super(marca, modelo, estadoV, cambios, cilindraje, combustible, transmision, fotos);
	        this.numPasajeros = numPasajeros;
	        this.numPuertas = numPuertas;
	        this.tieneCamara = tieneCamara;
	        this.tieneSensorTrafico = tieneSensorTrafico;
	        this.numBolsas = numBolsas;
	        this.asistentePermanencia = asistentePermanencia;
	        this.aireAcondicionado = aireAcondicionado;
	    }

	    public int getNumPasajeros() {
	        return numPasajeros;
	    }

	    public void setNumPasajeros(int numPasajeros) {
	        this.numPasajeros = numPasajeros;
	    }

	    public int getNumPuertas() {
	        return numPuertas;
	    }

	    public void setNumPuertas(int numPuertas) {
	        this.numPuertas = numPuertas;
	    }

	    public TieneCamara getTieneCamara() {
	        return tieneCamara;
	    }

	    public void setTieneCamara(TieneCamara tieneCamara) {
	        this.tieneCamara = tieneCamara;
	    }

	    public TieneSensor getTieneSensorTrafico() {
	        return tieneSensorTrafico;
	    }

	    public void setTieneSensorTrafico(TieneSensor tieneSensorTrafico) {
	        this.tieneSensorTrafico = tieneSensorTrafico;
	    }

	    public int getNumBolsas() {
	        return numBolsas;
	    }

	    public void setNumBolsas(int numBolsas) {
	        this.numBolsas = numBolsas;
	    }

	    public AsistentePermanencia getAsistentePermanencia() {
	        return asistentePermanencia;
	    }

	    public void setAsistentePermanencia(AsistentePermanencia asistentePermanencia) {
	        this.asistentePermanencia = asistentePermanencia;
	    }

	    public AireAcondicionado getAireAcondicionado() {
	        return aireAcondicionado;
	    }

	    public void setAireAcondicionado(AireAcondicionado aireAcondicionado) {
	        this.aireAcondicionado = aireAcondicionado;
	    }

	    @Override
	    public String toString() {
	        return "Automovil{" +
	                "marca='" + getMarca() + '\'' +
	                ", modelo='" + getModelo() + '\'' +
	                ", estadoV=" + getEstadoV() +
	                ", cambios=" + getCambios() +
	                ", cilindraje=" + getCilindraje() +
	                ", combustible=" + getCombustible() +
	                ", transmision=" + getTransmision() +
	                ", fotos=" + Arrays.toString(getFotos()) +
	                ", numPasajeros=" + numPasajeros +
	                ", numPuertas=" + numPuertas +
	                ", tieneCamara=" + tieneCamara +
	                ", tieneSensorTrafico=" + tieneSensorTrafico +
	                ", numBolsas=" + numBolsas +
	                ", asistentePermanencia=" + asistentePermanencia +
	                ", aireAcondicionado=" + aireAcondicionado +
	                '}';
	    }
	}
