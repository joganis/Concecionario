
package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;

import models.Reporte;

@SuppressWarnings("serial")
public class VerReportesEmpleado extends JFrame {

    private JPanel contentPane;
    private JLabel lblReportes;
    private JTextArea txtAreaReportes;

    public VerReportesEmpleado(String cedula, Map<String, ArrayList<Reporte>> dataReportes) {
        initialize(cedula, dataReportes);
    }

    private void initialize(String cedula, Map<String, ArrayList<Reporte>> dataReportes) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        lblReportes = new JLabel("Reportes de Usuario");
        lblReportes.setFont(new Font("Arial", Font.BOLD, 20));
        lblReportes.setBounds(110, 20, 200, 30);
        contentPane.add(lblReportes);

        txtAreaReportes = new JTextArea();
        txtAreaReportes.setFont(new Font("Arial", Font.PLAIN, 12));
        txtAreaReportes.setEditable(false);
        txtAreaReportes.setLineWrap(true);
        txtAreaReportes.setBounds(30, 70, 340, 160);
        contentPane.add(txtAreaReportes);

        // Obtener la lista de reportes del usuario seleccionado
        ArrayList<Reporte> reportesUsuario = dataReportes.get(cedula);
        if (reportesUsuario != null && !reportesUsuario.isEmpty()) {
            // Si hay reportes, mostrarlos en el área de texto
            for (Reporte reporte : reportesUsuario) {
                txtAreaReportes.append("- " + reporte.toString() + "\n");
            }
        } else {
            // Si no hay reportes, mostrar un mensaje indicando que no hay reportes disponibles
            txtAreaReportes.append("No hay reportes disponibles para este usuario.");
        }

        // Botón de retroceso
        JButton btnRetroceso = new JButton("Volver");
        btnRetroceso.setFont(new Font("Arial", Font.BOLD, 18));
        btnRetroceso.setBounds(145, 240, 100, 30);
        contentPane.add(btnRetroceso);
        btnRetroceso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }
}
