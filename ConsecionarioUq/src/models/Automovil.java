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

public class Automovil extends Vehiculo {
	    private int numPasajeros;
	    private int numPuertas;
	    private TieneCamara tieneCamara;
	    private TieneSensor tieneSensorTrafico;
	    private  SensorColision tieneSensorColision;
	    private int numBolsas;
	    private AsistentePermanencia asistentePermanencia;
	    private AireAcondicionado aireAcondicionado;

	    public Automovil(String marca, String modelo, TipoEstado estadoV, int cambios, int cilindraje,
	                     TipoCombustible combustible, TipoTransmision transmision, String[] fotos,int velocidadMaxima, TipoABS tieneABS, String placa, DisponibilidadVehiculo disponibilidad,
	                     int numPasajeros, int numPuertas, TieneCamara tieneCamara, TieneSensor tieneSensorTrafico,
	                     SensorColision tieneSensorColision,
	                     int numBolsas, AsistentePermanencia asistentePermanencia, AireAcondicionado aireAcondicionado) {
	        super(marca, modelo, estadoV, cambios, cilindraje, combustible, transmision, fotos,velocidadMaxima, tieneABS,placa,disponibilidad);
	        this.numPasajeros = numPasajeros;
	        this.numPuertas = numPuertas;
	        this.tieneCamara = tieneCamara;
	        this.tieneSensorTrafico = tieneSensorTrafico;
	        this.tieneSensorColision = tieneSensorColision;
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
	    
	    
	    public SensorColision getTieneSensorColision() {
	        return tieneSensorColision;
	    }

	    public void setTieneSensorTrafico(SensorColision tieneSensorColision) {
	        this.tieneSensorColision = tieneSensorColision;
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
	                ", velocidadMaxima=" + getVelocidadMaxima() +
	                ", tieneABS=" + getTieneABS() +
	                ", placa='" + getPlaca() + '\'' +
	                ", disponibilidad=" + getDisponibilidad() +
	                ", numPasajeros=" + numPasajeros +
	                ", numPuertas=" + numPuertas +
	                ", tieneCamara=" + tieneCamara +
	                ", tieneSensorTrafico=" + tieneSensorTrafico +
	                ", tieneSensorColision=" + tieneSensorColision +
	                ", numBolsas=" + numBolsas +
	                ", asistentePermanencia=" + asistentePermanencia +
	                ", aireAcondicionado=" + aireAcondicionado +
	                '}';
	    }

	}
