package logic_repository_user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import enums.AireAcondicionado;
import enums.AsistentePermanencia;
import enums.DisponibilidadVehiculo;
import enums.SensorColision;
import enums.TieneCamara;
import enums.TieneSensor;
import enums.TipoABS;
import enums.TipoCombustible;
import enums.TipoEstado;
import enums.TipoEstadoUsuario;
import enums.TipoTramite;
import enums.TipoTransmision;
import enums.TipoUsuarioEmpresa;
import models.Administrador;
import models.Cliente;
import models.Empleado;
import models.Moto;
import models.Persona;
import models.Reporte;
import models.Vehiculo;

public class Logic_Repository_User {
	public static    ArrayList<Vehiculo> dataVehiculos = new ArrayList<>();
	public static  ArrayList<Empleado> dataEmpleados = new ArrayList<>();
	public static ArrayList<Cliente> dataClientes = new ArrayList<>();
	public static ArrayList<Administrador> dataAdministradores = new ArrayList<>();
	public static Map<String, ArrayList<Reporte>> dataReportes = new HashMap<>();
    public static Persona usuarioActualLogeado = new Cliente("", "", "", "", "",TipoUsuarioEmpresa.CLIENTE);
    
    
    
    
    public void crearUsuariosQuemadosYReportes() {
    	Moto moto = new Moto(
    		     1000,               // precio
    		    "Honda",            // marca
    		    "CBR500R",          // modelo
    		    TipoEstado.NUEVO,   // estadoV
    		    6,                  // cambios
    		    471,                // cilindraje
    		    TipoCombustible.GASOLINA,   // combustible
    		    TipoTransmision.MANUAL,     // transmision
    		    "///Users/ferney/Concecionario/ConsecionarioUq/src/images/car.png",   // fotos
    		    190,                // velocidadMaxima
    		    TipoABS.SI,         // tieneABS
    		    "ABC123",           // placa
    		    DisponibilidadVehiculo.DISPONIBLE,  // disponibilidad
    		    1,                  // numPasajeros
    		    0,                  // numPuertas
    		    TieneCamara.NO,     // tieneCamara
    		    TieneSensor.NO,     // tieneSensorTrafico
    		    SensorColision.NO,  // tieneSensorColision
    		    0,                  // numBolsas
    		    AsistentePermanencia.NO,    // asistentePermanencia
    		    AireAcondicionado.NO        // aireAcondicionado
    		);

    	
    	 Empleado empleado1 = new Empleado("Ferney", "Cardona", "1098306215", "x", "y", TipoEstadoUsuario.ACTIVO, TipoUsuarioEmpresa.EMPLEADO  );
    	 Empleado empleado2 = new Empleado("Juan", "Cardona", "1234555", "n", "n", TipoEstadoUsuario.ACTIVO, TipoUsuarioEmpresa.EMPLEADO  );
	        Cliente cliente1 = new Cliente("JAvier", "Gonzales", "sdasda", "javier@bmatch.cl", "66666",TipoUsuarioEmpresa.CLIENTE);
	        Administrador cliente2 = new Administrador("Camilo", "Siro",  "222323223", "y", "x",TipoUsuarioEmpresa.ADMIN);
	        añadirReporteAcadaUsuario("1098306215",new  Reporte(cliente1, "hoy", empleado1, TipoTramite.VENTA, moto));
	        añadirReporteAcadaUsuario("1098306215",new  Reporte(cliente1, "hoy", empleado1, TipoTramite.VENTA, moto));
	        agregarEmpleado(empleado1);
	        agregarEmpleado(empleado2);
	        agregarCliente(cliente1);
	        agregarAdministrador(cliente2);
	        agregarVehiculo(moto);
	        
	        
	       
    }
    
    public boolean agregarVehiculo(Vehiculo vehiculo) {
        if (existeVehiculo(vehiculo)) {
            System.out.println("El vehículo ya existe en la lista.");
            return false;
        }

        dataVehiculos.add(vehiculo);
        System.out.println("Vehículo agregado correctamente.");
        return true;
    }

    public boolean existeVehiculo(Vehiculo vehiculo) {
        for (Vehiculo v : dataVehiculos) {
            if (v.getPlaca().equals(vehiculo.getPlaca())) {
                return true;
            }
        }
        return false;
    }
    

    public void añadirReporteAcadaUsuario(String cedula, Reporte reporte) {
        // Obtener la lista de reportes actual asociada a la cédula
        ArrayList<Reporte> listaReportes = dataReportes.get(cedula);
        if (listaReportes == null) {
            // Si la lista no existe, crear una nueva lista y agregar el reporte
            listaReportes = new ArrayList<>();
            listaReportes.add(reporte);
            // Asociar la nueva lista a la cédula en el mapa
            dataReportes.put(cedula, listaReportes);
        } else {
            // Si la lista existe, simplemente agregar el reporte a esa lista
            listaReportes.add(reporte);
            
        }
    }
    
    
    
    public void eliminarListaReportesUsuario(String cedula) {
        dataReportes.remove(cedula);
    }
    
    
    
     public Persona buscarUsuarioLogin(String correo, String contraseña) {
    	 System.out.println(correo);
    	 System.out.println(contraseña);
    	 System.out.println("Aqui essssssss");
    	System.out.println(dataEmpleados);
        // Buscar en la lista de empleados
        for (Empleado empleado : dataEmpleados) {
            if (empleado.getCorreo().equals(correo) && empleado.getContraseña().equals(contraseña)) {
            	usuarioActualLogeado = empleado;
                return empleado;
            }
        }
        // Buscar en la lista de clientes
        for (Cliente cliente : dataClientes) {
            if (cliente.getCorreo().equals(correo) && cliente.getContraseña().equals(contraseña)) {
            	usuarioActualLogeado = cliente;
                return cliente;
            }
        }
        // Buscar en la lista de administradores
        for (Administrador administrador : dataAdministradores) {
            if (administrador.getCorreo().equals(correo) && administrador.getContraseña().equals(contraseña)) {
            	usuarioActualLogeado = administrador;
            	
                return administrador;
            }
        }
        // Si no se encontró el usuario, retornar null
        return null;
    }
     
     

     
     
                     
            // Método para agregar un cliente si no existe previamente
     public  boolean agregarCliente(Cliente cliente) {
                if (!existeCliente(cliente)) {
                    dataClientes.add(cliente);
                    System.out.println("Cliente agregado correctamente.");
                } else {
                    System.out.println("El cliente ya existe.");
                }
                
               return existeCliente(cliente);
            }

            // Método para eliminar un cliente por cédula
     public  boolean eliminarCliente(Cliente cliente) {
                if (existeCliente(cliente)) {
                    dataClientes.remove(cliente);
                    System.out.println("Cliente eliminado correctamente.");
                } else {
                    System.out.println("El cliente no existe.");
                }
                return existeCliente(cliente);
            }

            // Método para verificar si un cliente existe en la lista
     public   boolean existeCliente(Cliente cliente) {
                return dataClientes.contains(cliente);
            }

            // Método para agregar un empleado si no existe previamente
     public    boolean agregarEmpleado(Empleado empleado) {
                if (!existeEmpleado(empleado)) {
                    dataEmpleados.add(empleado);
                    System.out.println("Empleado agregado correctamente.");
                } else {
                    System.out.println("El empleado ya existe.");
                }
                return existeEmpleado(empleado);
            }

            // Método para eliminar un empleado por cédula
     public  boolean eliminarEmpleado(Empleado empleado) {
                if (existeEmpleado(empleado)) {
                    dataEmpleados.remove(empleado);
                    eliminarListaReportesUsuario(empleado.getCedula());
                    System.out.println("Empleado eliminado correctamente.");
                } else {
                    System.out.println("El empleado no existe.");
                }
                return existeEmpleado(empleado);
            }

            // Método para verificar si un empleado existe en la lista
     public   boolean existeEmpleado(Empleado empleado) {
                return dataEmpleados.contains(empleado);
            }

            // Método para agregar un administrador si no existe previamente
     public   boolean agregarAdministrador(Administrador administrador) {
                if (!existeAdministrador(administrador)) {
                    dataAdministradores.add(administrador);
                    System.out.println("Administrador agregado correctamente.");
                } else {
                    System.out.println("El administrador ya existe.");
                }
               return existeAdministrador(administrador);
            }

            // Método para eliminar un administrador por cédula
     public  boolean eliminarAdministrador(Administrador administrador) {
                if (existeAdministrador(administrador)) {
                    dataAdministradores.remove(administrador);
                    System.out.println("Administrador eliminado correctamente.");
                } else {
                    System.out.println("El administrador no existe.");
                }
               return existeAdministrador(administrador);
            }

            // Método para verificar si un administrador existe en la lista
     public boolean existeAdministrador(Administrador administrador) {
                return dataAdministradores.contains(administrador);
            }
     
     
     
     //Metodo para traer un cliente con cedula filtrada 
     public Cliente buscarClientePorCedula(String cedula) {
    	    for (Cliente cliente : dataClientes) {
    	        if (cliente.getCedula().equals(cedula)) {
    	            return cliente;
    	        }
    	    }
    	    return null; // Si no se encuentra el cliente, se retorna null
    	}
        
}










