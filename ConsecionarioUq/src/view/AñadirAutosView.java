package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import logic_repository_user.Logic_Repository_User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AñadirAutosView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public AñadirAutosView() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 550, 400); // Aumentamos el tamaño de la ventana
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitulo = new JLabel("Selecciona auto a agregar"); // Cambiamos el título
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitulo.setBounds(150, 20, 300, 30); // Ajustamos la posición y el tamaño
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblTitulo);

        JButton btnAñadirBus = new JButton("Añadir Bus");
        btnAñadirBus.setFont(new Font("Arial", Font.BOLD, 18));
        btnAñadirBus.setBounds(50, 70, 200, 30); // Ajustamos la posición y el tamaño
        contentPane.add(btnAñadirBus);

        JButton btnAñadirCamion = new JButton("Añadir Camion");
        btnAñadirCamion.setFont(new Font("Arial", Font.BOLD, 18));
        btnAñadirCamion.setBounds(300, 70, 200, 30); // Ajustamos la posición y el tamaño
        contentPane.add(btnAñadirCamion);

        JButton btnAñadirDeportivo = new JButton("Añadir Deportivo");
        btnAñadirDeportivo.setFont(new Font("Arial", Font.BOLD, 18));
        btnAñadirDeportivo.setBounds(50, 130, 200, 30); // Ajustamos la posición y el tamaño
        contentPane.add(btnAñadirDeportivo);

        JButton btnAñadirMoto = new JButton("Añadir Moto");
        btnAñadirMoto.setFont(new Font("Arial", Font.BOLD, 18));
        btnAñadirMoto.setBounds(300, 130, 200, 30); // Ajustamos la posición y el tamaño
        contentPane.add(btnAñadirMoto);

        JButton btnAñadirPickUp = new JButton("Añadir Pick-up");
        btnAñadirPickUp.setFont(new Font("Arial", Font.BOLD, 18));
        btnAñadirPickUp.setBounds(50, 190, 200, 30); // Ajustamos la posición y el tamaño
        contentPane.add(btnAñadirPickUp);

        JButton btnAñadirSedan = new JButton("Añadir Sedan");
        btnAñadirSedan.setFont(new Font("Arial", Font.BOLD, 18));
        btnAñadirSedan.setBounds(300, 190, 200, 30); // Ajustamos la posición y el tamaño
        contentPane.add(btnAñadirSedan);

        JButton btnAñadirSuvCamioneta = new JButton("Añadir SUV/Camioneta");
        btnAñadirSuvCamioneta.setFont(new Font("Arial", Font.BOLD, 18));
        btnAñadirSuvCamioneta.setBounds(17, 250, 288, 30); // Ajustamos la posición y el tamaño
        contentPane.add(btnAñadirSuvCamioneta);

        JButton btnAñadirVan = new JButton("Añadir Van");
        btnAñadirVan.setFont(new Font("Arial", Font.BOLD, 18));
        btnAñadirVan.setBounds(329, 250, 200, 30); // Ajustamos la posición y el tamaño
        contentPane.add(btnAñadirVan);
        
        JButton btnVolver = new JButton("Volver");
        btnVolver.setFont(new Font("Arial", Font.BOLD, 18));
        btnVolver.setBounds(10, 330, 120, 30); // Ajustamos la posición y el tamaño
        contentPane.add(btnVolver);

        btnAñadirBus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para añadir un bus
                // ...
                AñadirBusView a = new AñadirBusView();

            }
        });

        btnAñadirCamion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para añadir un camion
                // ...
              
            }
        });

        btnAñadirDeportivo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para añadir un deportivo
                // ...
            }
        });

        btnAñadirMoto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para añadir una moto
                // ...
            }
        });

        btnAñadirPickUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para añadir una pick-up
                // ...
            }
        });

        btnAñadirSedan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para añadir un sedan
                // ...
            }
        });

        btnAñadirSuvCamioneta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para añadir un SUV/Camioneta
                // ...
            }
        });

        btnAñadirVan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para añadir una van
                // ...
            }
        });
        
        btnVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HomeView homeview = new HomeView(Logic_Repository_User.usuarioActualLogeado);
                // ...
                dispose(); // Cierra la ventana actual
            }
        });

        setVisible(true);
    }
}
