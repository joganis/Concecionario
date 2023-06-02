package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import logic_repository_user.Logic_Repository_User;
import models.Empleado;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VerEmpleadosView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblEmpleados;

    public VerEmpleadosView(ArrayList<Empleado> empleados) {
        initialize(empleados);
    }

    private void initialize(ArrayList<Empleado> empleados) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        lblEmpleados = new JLabel("Lista de Empleados");
        lblEmpleados.setFont(new Font("Arial", Font.BOLD, 40));
        lblEmpleados.setBounds(219, 57, 422, 50);
        contentPane.add(lblEmpleados);

        // Posición inicial de las tarjetas
        int x = 150;
        int y = 150;

        for (Empleado empleado : empleados) {
            // Crear una tarjeta para el empleado
            JPanel cardPanel = new JPanel();
            cardPanel.setBackground(Color.WHITE);
            cardPanel.setLayout(null);
            cardPanel.setBounds(x, y, 500, 60);
            cardPanel.setBorder(new RoundBorder(10, Color.BLACK));

            // Agregar el nombre del empleado a la tarjeta
            JLabel lblEmpleado = new JLabel(empleado.getNombre());
            lblEmpleado.setFont(new Font("Arial", Font.PLAIN, 18));
            lblEmpleado.setBounds(10, 10, 300, 30);
            cardPanel.add(lblEmpleado);

            // Agregar el botón de eliminar a la tarjeta
            JButton btnEliminar = new JButton("Eliminar");
            btnEliminar.setFont(new Font("Arial", Font.PLAIN, 12));
            btnEliminar.setBounds(400, 20, 80, 30);
            cardPanel.add(btnEliminar);

            // Agregar ActionListener para el botón de eliminar
            btnEliminar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Logic_Repository_User repository = new Logic_Repository_User();
                    repository.eliminarEmpleado(empleado);
                    contentPane.remove(cardPanel); // Remover la tarjeta eliminada
                    contentPane.revalidate(); // Actualizar el contenido del panel
                    contentPane.repaint(); // Repintar el panel
                }
            });
            // Agregar el botón "Ver Reportes" a la tarjeta
            JButton btnVerReportes = new JButton("Ver Reportes");
            btnVerReportes.setFont(new Font("Arial", Font.PLAIN, 12));
            btnVerReportes.setBounds(300, 20, 100, 30);
            cardPanel.add(btnVerReportes);

            // Agregar ActionListener para el botón "Ver Reportes"
            btnVerReportes.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    VerReportesEmpleado reportesEmpleado = new VerReportesEmpleado(empleado.getCedula(),
                            Logic_Repository_User.dataReportes);
                }
            });
            // Agregar la tarjeta al contenido principal
            contentPane.add(cardPanel);

            // Actualizar las posiciones para la siguiente tarjeta
            y += 80;
        }

        // Botón de retroceso
        JButton btnRetroceso = new JButton("Volver");
        btnRetroceso.setFont(new Font("Arial", Font.BOLD, 18));
        btnRetroceso.setBounds(34, 20, 89, 30);
        contentPane.add(btnRetroceso);
        btnRetroceso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        setVisible(true);
    }
}
