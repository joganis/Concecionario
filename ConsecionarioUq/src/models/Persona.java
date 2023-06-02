package models;

import enums.TipoUsuarioEmpresa;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
    private String contraseña;
    private  TipoUsuarioEmpresa tipoDeUsuario;

    public Persona(String nombre, String apellido, String cedula, String correo, String contraseña, TipoUsuarioEmpresa tipoDeUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.contraseña = contraseña;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public TipoUsuarioEmpresa getTipoUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoUsuario(TipoUsuarioEmpresa tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }
    
    
    public abstract String toString();
}
