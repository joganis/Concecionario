package models;

import enums.TipoUsuarioEmpresa;

public class Cliente extends Persona {
    public Cliente(String nombre, String apellido, String cedula, String correo, String contraseña,TipoUsuarioEmpresa tipoDeUsuario) {
        super(nombre, apellido, cedula, correo, contraseña, tipoDeUsuario);
    }

    
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", cedula='" + getCedula() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                ", contraseña='" + getContraseña() + '\'' +
                ", tipo usuario='" + getTipoUsuario() + '\'' +
                '}';
    }
}
