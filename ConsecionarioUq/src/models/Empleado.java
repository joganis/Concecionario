package models;



import enums.TipoEstadoUsuario;
import enums.TipoUsuarioEmpresa;


public class Empleado extends Persona {
    private TipoEstadoUsuario estado;

    public Empleado(String nombre, String apellido, String cedula, String correo, String contraseña, TipoEstadoUsuario estado, TipoUsuarioEmpresa tipoDeUsuario) {
        super(nombre, apellido, cedula, correo, contraseña,tipoDeUsuario);
      
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
                ", tipo usuario='" + getTipoUsuario() + '\'' +
                ", estado=" + estado +
                '}';
    }
}
    