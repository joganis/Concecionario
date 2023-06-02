package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import enums.DisponibilidadVehiculo;
import enums.TipoABS;
import enums.TipoCombustible;
import enums.TipoEstado;
import enums.TipoTransmision;
import logic_repository_user.Logic_Repository_User;
import models.Bus;

public class AñadirBusView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtPrecio;
    private JTextField txtMarca;
    private JTextField txtModelo;
    private JTextField txtCambios;
    private JTextField txtCilindraje;
    private JTextField txtPlaca;
    private JTextField txtVelocidadMaxima;
    private JTextField txtNumEjes;
    private JTextField txtNumSalidasEmergencia;
    private JTextField txtCapacidadMaletero;
    private JComboBox<TipoEstado> cmbTipoEstado;
    private JComboBox<TipoABS> cmbTipoABS;
    private JComboBox<TipoCombustible> cmbTipoCombustible;
    private JComboBox<TipoTransmision> cmbTipoTransmision;
    private JComboBox<DisponibilidadVehiculo> cmbDisponibilidadVehiculo;
    private JComboBox<String> cmbFotos;

    public AñadirBusView() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 800, 800); // Ajusta el tamaño de la ventana
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitulo = new JLabel("Añadir Bus"); // Cambia el título
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitulo.setBounds(200, 20, 150, 30);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblTitulo);

        JLabel lblPrecio = new JLabel("Precio:");
        lblPrecio.setFont(new Font("Arial", Font.PLAIN, 18));
        lblPrecio.setBounds(50, 70, 100, 30);
        contentPane.add(lblPrecio);

        txtPrecio = new JTextField();
        txtPrecio.setBounds(160, 70, 150, 30);
        contentPane.add(txtPrecio);
        txtPrecio.setColumns(10);

        JLabel lblMarca = new JLabel("Marca:");
        lblMarca.setFont(new Font("Arial", Font.PLAIN, 18));
        lblMarca.setBounds(50, 120, 100, 30);
        contentPane.add(lblMarca);

        txtMarca = new JTextField();
        txtMarca.setBounds(160, 120, 150, 30);
        contentPane.add(txtMarca);
        txtMarca.setColumns(10);

        JLabel lblModelo = new JLabel("Modelo:");
        lblModelo.setFont(new Font("Arial", Font.PLAIN, 18));
        lblModelo.setBounds(50, 170, 100, 30);
        contentPane.add(lblModelo);

        txtModelo = new JTextField();
        txtModelo.setBounds(160, 170, 150, 30);
        contentPane.add(txtModelo);
        txtModelo.setColumns(10);

        JLabel lblCambios = new JLabel("Cambios:");
        lblCambios.setFont(new Font("Arial", Font.PLAIN, 18));
        lblCambios.setBounds(50, 220, 100, 30);
        contentPane.add(lblCambios);

        txtCambios = new JTextField();
        txtCambios.setBounds(160, 220, 150, 30);
        contentPane.add(txtCambios);
        txtCambios.setColumns(10);

        JLabel lblCilindraje = new JLabel("Cilindraje:");
        lblCilindraje.setFont(new Font("Arial", Font.PLAIN, 18));
        lblCilindraje.setBounds(50, 270, 100, 30);
        contentPane.add(lblCilindraje);

        txtCilindraje = new JTextField();
        txtCilindraje.setBounds(160, 270, 150, 30);
        contentPane.add(txtCilindraje);
        txtCilindraje.setColumns(10);

        JLabel lblPlaca = new JLabel("Placa:");
        lblPlaca.setFont(new Font("Arial", Font.PLAIN, 18));
        lblPlaca.setBounds(50, 320, 100, 30);
        contentPane.add(lblPlaca);

        txtPlaca = new JTextField();
        txtPlaca.setBounds(160, 320, 150, 30);
        contentPane.add(txtPlaca);
        txtPlaca.setColumns(10);

        JLabel lblVelocidadMaxima = new JLabel("Velocidad Máxima:");
        lblVelocidadMaxima.setFont(new Font("Arial", Font.PLAIN, 18));
        lblVelocidadMaxima.setBounds(50, 370, 160, 30);
        contentPane.add(lblVelocidadMaxima);

        txtVelocidadMaxima = new JTextField();
        txtVelocidadMaxima.setBounds(210, 370, 100, 30);
        contentPane.add(txtVelocidadMaxima);
        txtVelocidadMaxima.setColumns(10);

        JLabel lblNumEjes = new JLabel("Número de Ejes:");
        lblNumEjes.setFont(new Font("Arial", Font.PLAIN, 18));
        lblNumEjes.setBounds(50, 420, 140, 30);
        contentPane.add(lblNumEjes);

        txtNumEjes = new JTextField();
        txtNumEjes.setBounds(190, 420, 120, 30);
        contentPane.add(txtNumEjes);
        txtNumEjes.setColumns(10);

        JLabel lblNumSalidasEmergencia = new JLabel("Número de Salidas de Emergencia:");
        lblNumSalidasEmergencia.setFont(new Font("Arial", Font.PLAIN, 18));
        lblNumSalidasEmergencia.setBounds(50, 470, 270, 30);
        contentPane.add(lblNumSalidasEmergencia);

        txtNumSalidasEmergencia = new JTextField();
        txtNumSalidasEmergencia.setBounds(310, 470, 100, 30);
        contentPane.add(txtNumSalidasEmergencia);
        txtNumSalidasEmergencia.setColumns(10);

        JLabel lblCapacidadMaletero = new JLabel("Capacidad de Maletero:");
        lblCapacidadMaletero.setFont(new Font("Arial", Font.PLAIN, 18));
        lblCapacidadMaletero.setBounds(50, 520, 190, 30);
        contentPane.add(lblCapacidadMaletero);

        txtCapacidadMaletero = new JTextField();
        txtCapacidadMaletero.setBounds(240, 520, 100, 30);
        contentPane.add(txtCapacidadMaletero);
        txtCapacidadMaletero.setColumns(10);

        JLabel lblTipoEstado = new JLabel("Estado:");
        lblTipoEstado.setFont(new Font("Arial", Font.PLAIN, 18));
        lblTipoEstado.setBounds(350, 70, 100, 30);
        contentPane.add(lblTipoEstado);

        cmbTipoEstado = new JComboBox<TipoEstado>();
        cmbTipoEstado.setBounds(450, 70, 80, 30);
        cmbTipoEstado.addItem(TipoEstado.NUEVO);
        cmbTipoEstado.addItem(TipoEstado.USADO);
        
        contentPane.add(cmbTipoEstado);

        JLabel lblTipoABS = new JLabel("ABS:");
        lblTipoABS.setFont(new Font("Arial", Font.PLAIN, 18));
        lblTipoABS.setBounds(350, 120, 100, 30);
        contentPane.add(lblTipoABS);

        cmbTipoABS = new JComboBox<TipoABS>();
        cmbTipoABS.setBounds(400, 120, 130, 30);
        cmbTipoABS.addItem(TipoABS.SI);
        cmbTipoABS.addItem(TipoABS.NO);
        contentPane.add(cmbTipoABS);

        JLabel lblTipoCombustible = new JLabel("Combustible:");
        lblTipoCombustible.setFont(new Font("Arial", Font.PLAIN, 18));
        lblTipoCombustible.setBounds(350, 170, 120, 30);
        contentPane.add(lblTipoCombustible);

        cmbTipoCombustible = new JComboBox<TipoCombustible>();
        cmbTipoCombustible.setBounds(470, 170, 90, 30);
        cmbTipoCombustible.addItem(TipoCombustible.GASOLINA);
        cmbTipoCombustible.addItem(TipoCombustible.DIESEL);
        cmbTipoCombustible.addItem(TipoCombustible.ELECTRICO);
        cmbTipoCombustible.addItem(TipoCombustible.HIBRIDO);
        contentPane.add(cmbTipoCombustible);

        JLabel lblTipoTransmision = new JLabel("Transmisión:");
        lblTipoTransmision.setFont(new Font("Arial", Font.PLAIN, 18));
        lblTipoTransmision.setBounds(350, 220, 120, 30);
        contentPane.add(lblTipoTransmision);

        cmbTipoTransmision = new JComboBox<TipoTransmision>();
        cmbTipoTransmision.setBounds(470, 220, 90, 30);
        cmbTipoTransmision.addItem(TipoTransmision.MANUAL);
        cmbTipoTransmision.addItem(TipoTransmision.AUTOMATICA);
        contentPane.add(cmbTipoTransmision);

        JLabel lblDisponibilidadVehiculo = new JLabel("Disponibilidad:");
        lblDisponibilidadVehiculo.setFont(new Font("Arial", Font.PLAIN, 18));
        lblDisponibilidadVehiculo.setBounds(350, 270, 130, 30);
        contentPane.add(lblDisponibilidadVehiculo);

        cmbDisponibilidadVehiculo = new JComboBox<DisponibilidadVehiculo>();
        cmbDisponibilidadVehiculo.setBounds(480, 270, 80, 30);
        cmbDisponibilidadVehiculo.addItem(DisponibilidadVehiculo.DISPONIBLE);
        cmbDisponibilidadVehiculo.addItem(DisponibilidadVehiculo.NO);
        contentPane.add(cmbDisponibilidadVehiculo);

        JLabel lblFotos = new JLabel("Fotos:");
        lblFotos.setFont(new Font("Arial", Font.PLAIN, 18));
        lblFotos.setBounds(350, 320, 100, 30);
        contentPane.add(lblFotos);

        cmbFotos = new JComboBox<String>();
        cmbFotos.setBounds(400, 320, 130, 30);
        cmbFotos.addItem("car2.png");        
        cmbFotos.addItem("car3.png");
        contentPane.add(cmbFotos);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener los valores ingresados por el usuario
                int precio = Integer.parseInt(txtPrecio.getText());
                String marca = txtMarca.getText();
                String modelo = txtModelo.getText();
                int cambios = Integer.parseInt(txtCambios.getText());
                int cilindraje = Integer.parseInt(txtCilindraje.getText());
                String placa = txtPlaca.getText();
                int velocidadMaxima = Integer.parseInt(txtVelocidadMaxima.getText());
                TipoEstado estadoV = (TipoEstado) cmbTipoEstado.getSelectedItem();
                TipoCombustible combustible = (TipoCombustible) cmbTipoCombustible.getSelectedItem();
                TipoTransmision transmision = (TipoTransmision) cmbTipoTransmision.getSelectedItem();
                String foto = (String) cmbFotos.getSelectedItem();
                TipoABS tieneABS = (TipoABS) cmbTipoABS.getSelectedItem();
                DisponibilidadVehiculo disponibilidad = (DisponibilidadVehiculo) cmbDisponibilidadVehiculo.getSelectedItem();
                int numEjes = Integer.parseInt(txtNumEjes.getText());
                int numSalidasEmergencia = Integer.parseInt(txtNumSalidasEmergencia.getText());
                double capacidadMaletero = Double.parseDouble(txtCapacidadMaletero.getText());

                // Crear una instancia de la clase Bus con los valores ingresados
                Bus bus = new Bus(precio, marca, modelo, estadoV, cambios, cilindraje, combustible, transmision,"///Users/ferney/Concecionario/ConsecionarioUq/src/images/" + foto,
                        velocidadMaxima, tieneABS, placa, disponibilidad, numEjes, numSalidasEmergencia,
                        capacidadMaletero);

                Logic_Repository_User repository = new Logic_Repository_User();
//guardar en la lista de vehiculos               
                repository.agregarVehiculo(bus);
System.out.println(foto);
                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(null, "Bus guardado exitosamente");

                // Limpiar los campos de entrada
                limpiarCampos();
                dispose();
            }
        });
        btnGuardar.setFont(new Font("Arial", Font.BOLD, 18));
        btnGuardar.setBounds(200, 580, 150, 40);
        contentPane.add(btnGuardar);
        
        
        setVisible(true);
    }

    private void limpiarCampos() {
        txtPrecio.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtCambios.setText("");
        txtCilindraje.setText("");
        txtPlaca.setText("");
        txtVelocidadMaxima.setText("");
        txtNumEjes.setText("");
        txtNumSalidasEmergencia.setText("");
        txtCapacidadMaletero.setText("");
        cmbTipoEstado.setSelectedIndex(0);
        cmbTipoABS.setSelectedIndex(0);
        cmbTipoCombustible.setSelectedIndex(0);
        cmbTipoTransmision.setSelectedIndex(0);
        cmbDisponibilidadVehiculo.setSelectedIndex(0);
        cmbFotos.setSelectedIndex(0);
    }
    
    
}
