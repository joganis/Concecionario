package logic_repository_user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


import models.Administrador;
import models.Cliente;
import models.Empleado;
import models.Reporte;
import models.Vehiculo;

public class Logic_Repository_User {
    ArrayList<Vehiculo> dataVehiculos = new ArrayList<>();
    ArrayList<Empleado> dataEmpleados = new ArrayList<>();
    ArrayList<Cliente> dataClientes = new ArrayList<>();
    ArrayList<Administrador> dataAdministradores = new ArrayList<>();
    Map<String, ArrayList<Reporte>> dataReportes = new HashMap<>();

    void añadirReporteAcadaUsuario(String cedula, Reporte reporte) {
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
            
            
            

            // Método para agregar un cliente si no existe previamente
            void agregarCliente(Cliente cliente) {
                if (!existeCliente(cliente)) {
                    dataClientes.add(cliente);
                    System.out.println("Cliente agregado correctamente.");
                } else {
                    System.out.println("El cliente ya existe.");
                }
            }

            // Método para eliminar un cliente por cédula
            void eliminarCliente(Cliente cliente) {
                if (existeCliente(cliente)) {
                    dataClientes.remove(cliente);
                    System.out.println("Cliente eliminado correctamente.");
                } else {
                    System.out.println("El cliente no existe.");
                }
            }

            // Método para verificar si un cliente existe en la lista
            boolean existeCliente(Cliente cliente) {
                return dataClientes.contains(cliente);
            }

            // Método para agregar un empleado si no existe previamente
            void agregarEmpleado(Empleado empleado) {
                if (!existeEmpleado(empleado)) {
                    dataEmpleados.add(empleado);
                    System.out.println("Empleado agregado correctamente.");
                } else {
                    System.out.println("El empleado ya existe.");
                }
            }

            // Método para eliminar un empleado por cédula
            void eliminarEmpleado(Empleado empleado) {
                if (existeEmpleado(empleado)) {
                    dataEmpleados.remove(empleado);
                    System.out.println("Empleado eliminado correctamente.");
                } else {
                    System.out.println("El empleado no existe.");
                }
            }

            // Método para verificar si un empleado existe en la lista
            boolean existeEmpleado(Empleado empleado) {
                return dataEmpleados.contains(empleado);
            }

            // Método para agregar un administrador si no existe previamente
            void agregarAdministrador(Administrador administrador) {
                if (!existeAdministrador(administrador)) {
                    dataAdministradores.add(administrador);
                    System.out.println("Administrador agregado correctamente.");
                } else {
                    System.out.println("El administrador ya existe.");
                }
            }

            // Método para eliminar un administrador por cédula
            void eliminarAdministrador(Administrador administrador) {
                if (existeAdministrador(administrador)) {
                    dataAdministradores.remove(administrador);
                    System.out.println("Administrador eliminado correctamente.");
                } else {
                    System.out.println("El administrador no existe.");
                }
            }

            // Método para verificar si un administrador existe en la lista
            boolean existeAdministrador(Administrador administrador) {
                return dataAdministradores.contains(administrador);
            }
        
}










