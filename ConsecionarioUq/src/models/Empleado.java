package models;



import enums.TipoEstadoUsuario;


public class Empleado extends Persona {
    private TipoEstadoUsuario estado;

    public Empleado(String nombre, String apellido, String cedula, String correo, String contraseña, TipoEstadoUsuario estado) {
        super(nombre, apellido, cedula, correo, contraseña);
      
        this.estado = estado;
    }

    
    public TipoEstadoUsuario getEstado() {
        return estado;
    }

    public void setEstado(TipoEstadoUsuario estado) {
        this.estado = estado;
    }

    

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", cedula='" + getCedula() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                ", contraseña='" + getContraseña() + '\'' +
                ", estado=" + estado +
                '}';
    }
}
    