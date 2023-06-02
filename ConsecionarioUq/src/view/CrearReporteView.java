package view;


import models.Cliente;
import models.Empleado;
import models.Reporte;
import models.Vehiculo;
import enums.TipoTramite;
import logic_repository_user.Logic_Repository_User;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CrearReporteView extends JFrame {
	
	

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtCedula;
    
    
    public CrearReporteView(Vehiculo vehiculo, TipoTramite tipotramite) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitulo = new JLabel("Crear Reporte");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitulo.setBounds(150, 20, 200, 30);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblTitulo);

        JLabel lblCedula = new JLabel("Cédula del cliente:");
        lblCedula.setFont(new Font("Arial", Font.PLAIN, 18));
        lblCedula.setBounds(50, 80, 150, 20);
        contentPane.add(lblCedula);

        txtCedula = new JTextField();
        txtCedula.setFont(new Font("Arial", Font.PLAIN, 16));
        txtCedula.setBounds(200, 80, 200, 25);
        contentPane.add(txtCedula);
        txtCedula.setColumns(10);

        JLabel lblTipoTramite = new JLabel("Tipo de trámite:");
        lblTipoTramite.setFont(new Font("Arial", Font.PLAIN, 18));
        lblTipoTramite.setBounds(50, 120, 150, 20);
        contentPane.add(lblTipoTramite);

       

        JButton btnGenerarReporte = new JButton("Generar Reporte");
        btnGenerarReporte.setFont(new Font("Arial", Font.BOLD, 16));
        btnGenerarReporte.setBounds(150, 180, 150, 30);
        contentPane.add(btnGenerarReporte);

        btnGenerarReporte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cedula = txtCedula.getText();
               

                
                Logic_Repository_User repository = new Logic_Repository_User();
              //guardar en la lista de vehiculos               
                Cliente cliente = repository.buscarClientePorCedula(cedula);
                 // Crea un objeto Empleado (debes ajustarlo según tu implementación)
                String fecha = obtenerFechaActual(); // Obtiene la fecha actual (debes ajustarlo según tu implementación)

                Reporte reporte = new Reporte(cliente, fecha, Logic_Repository_User.usuarioActualLogeado, tipotramite, vehiculo);
                // Realiza las operaciones adicionales que necesites con el objeto Reporte
                repository.añadirReporteAcadaUsuario(Logic_Repository_User.usuarioActualLogeado.getCedula(), reporte);
                JOptionPane.showMessageDialog(CrearReporteView.this, "Se ha generado el reporte.");
            }
        });

        setVisible(true);
    }


private String obtenerFechaActual() {
    // Obtener la fecha actual
    Date fechaActual = new Date();
    
    // Definir el formato deseado
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
    
    // Formatear la fecha actual con el formato deseado
    String fechaFormateada = formatoFecha.format(fechaActual);
    
    return fechaFormateada;
}
}