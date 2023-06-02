package models;

import enums.TipoUsuarioEmpresa;

public class Administrador extends Persona {
    public Administrador(String nombre, String apellido, String cedula, String correo, String contraseña,TipoUsuarioEmpresa tipoDeUsuario ) {
        super(nombre, apellido, cedula, correo, contraseña,tipoDeUsuario);
    }
    @Override
    public String toString() {
        return "Administrador{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", cedula='" + getCedula() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                ", contraseña='" + getContraseña() + '\'' +
                ", tipo usuario='" + getTipoUsuario() + '\'' +
                '}';
    }
}
