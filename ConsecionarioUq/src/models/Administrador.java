package models;

public class Administrador extends Persona {
    public Administrador(String nombre, String apellido, String cedula, String correo, String contraseña) {
        super(nombre, apellido, cedula, correo, contraseña);
    }
    @Override
    public String toString() {
        return "Administrador{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", cedula='" + getCedula() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                ", contraseña='" + getContraseña() + '\'' +
                '}';
    }
}
