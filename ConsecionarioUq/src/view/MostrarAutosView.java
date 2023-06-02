package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import enums.TipoTramite;
import logic_repository_user.Logic_Repository_User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import models.Vehiculo;

public class MostrarAutosView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private ArrayList<Vehiculo> dataVehiculos;
    private int currentIndex;
    private JLabel lblImagen;

    public MostrarAutosView(ArrayList<Vehiculo> dataVehiculos) {
        this.dataVehiculos = dataVehiculos;
        currentIndex = 0;

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnVolver = new JButton("Volver");
        btnVolver.setFont(new Font("Arial", Font.BOLD, 14));
        btnVolver.setBounds(10, 10, 80, 30);
        contentPane.add(btnVolver);
        
        JLabel lblTitulo = new JLabel("Mostrar Autos");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 30));
        lblTitulo.setBounds(250, 20, 300, 50);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblTitulo);

        lblImagen = new JLabel();
        lblImagen.setBounds(250, 100, 300, 200);
        lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblImagen);

        JButton btnAnterior = new JButton("<");
        btnAnterior.setFont(new Font("Arial", Font.BOLD, 24));
        btnAnterior.setBounds(250, 350, 70, 50);
        contentPane.add(btnAnterior);

        JButton btnSiguiente = new JButton(">");
        btnSiguiente.setFont(new Font("Arial", Font.BOLD, 24));
        btnSiguiente.setBounds(480, 350, 70, 50);
        contentPane.add(btnSiguiente);

        JButton btnVender = new JButton("Vender auto");
        btnVender.setFont(new Font("Arial", Font.BOLD, 24));
        btnVender.setBounds(250, 450, 300, 50);
        contentPane.add(btnVender);

        JButton btnAlquilar = new JButton("Alquilar auto");
        btnAlquilar.setFont(new Font("Arial", Font.BOLD, 24));
        btnAlquilar.setBounds(250, 520, 300, 50);
        contentPane.add(btnAlquilar);

        mostrarImagen();

        btnAnterior.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (currentIndex > 0) {
                    currentIndex--;
                    mostrarImagen();
                }
            }
        });

        btnSiguiente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (currentIndex < dataVehiculos.size() - 1) {
                    currentIndex++;
                    mostrarImagen();
                }
            }
        });

        btnVender.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Vehiculo vehiculoActual = dataVehiculos.get(currentIndex);
                // Lógica para vender el auto
                CrearReporteView crearreport = new CrearReporteView(vehiculoActual, TipoTramite.VENTA);

            }
        });

        btnAlquilar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Vehiculo vehiculoActual = dataVehiculos.get(currentIndex);
               CrearReporteView crearreport = new CrearReporteView(vehiculoActual, TipoTramite.ALQUILER);
            }
        });
        
        btnVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//ir a home
            	HomeView homeView = new HomeView(Logic_Repository_User.usuarioActualLogeado);
                dispose();
            }
        });

        setVisible(true);
    }

    private void mostrarImagen() {
        if (dataVehiculos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay autos para mostrar.");
            dispose();
            return;
        }

        Vehiculo vehiculoActual = dataVehiculos.get(currentIndex);
        ImageIcon imageIcon = new ImageIcon(vehiculoActual.getFotos());
        Image image = imageIcon.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        lblImagen.setIcon(new ImageIcon(image));
    }
}
