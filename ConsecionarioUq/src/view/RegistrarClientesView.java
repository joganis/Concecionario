package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JOptionPane;
import models.Cliente;
import enums.TipoUsuarioEmpresa;
import logic_repository_user.Logic_Repository_User;

public class RegistrarClientesView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtCedula;
    private JTextField txtCorreo;
    private JTextField txtContrasena;

    public RegistrarClientesView() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 400, 400);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitulo = new JLabel("Registrar Cliente");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBounds(120, 20, 200, 30);
        contentPane.add(lblTitulo);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(50, 80, 100, 20);
        contentPane.add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(150, 80, 200, 25);
        contentPane.add(txtNombre);
        txtNombre.setColumns(10);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(50, 120, 100, 20);
        contentPane.add(lblApellido);

        txtApellido = new JTextField();
        txtApellido.setBounds(150, 120, 200, 25);
        contentPane.add(txtApellido);
        txtApellido.setColumns(10);

        JLabel lblCedula = new JLabel("Cédula:");
        lblCedula.setBounds(50, 160, 100, 20);
        contentPane.add(lblCedula);

        txtCedula = new JTextField();
        txtCedula.setBounds(150, 160, 200, 25);
        contentPane.add(txtCedula);
        txtCedula.setColumns(10);

        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setBounds(50, 200, 100, 20);
        contentPane.add(lblCorreo);

        txtCorreo = new JTextField();
        txtCorreo.setBounds(150, 200, 200, 25);
        contentPane.add(txtCorreo);
        txtCorreo.setColumns(10);

        JLabel lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setBounds(50, 240, 100, 20);
        contentPane.add(lblContrasena);

        txtContrasena = new JTextField();
        txtContrasena.setBounds(150, 240, 200, 25);
        contentPane.add(txtContrasena);
        txtContrasena.setColumns(10);

        JButton btnRegistrar = new JButton("Registrar");
        btnRegistrar.setFont(new Font("Arial", Font.BOLD, 14));
        btnRegistrar.setBounds(90, 290, 100, 30);
        contentPane.add(btnRegistrar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setFont(new Font("Arial", Font.BOLD, 14));
        btnCancelar.setBounds(210, 290, 100, 30);
        contentPane.add(btnCancelar);

        // Acción del botón "Registrar"
        btnRegistrar.addActionListener(e -> {
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String cedula = txtCedula.getText();
            String correo = txtCorreo.getText();
            String contrasena = txtContrasena.getText();

            Cliente cliente = new Cliente(nombre, apellido, cedula, correo, contrasena, TipoUsuarioEmpresa.CLIENTE);
   
            Logic_Repository_User repository = new Logic_Repository_User();
            // Agregar cliente a la dataUsuarios del repository
            repository.agregarCliente(cliente);

            // Mostrar mensaje de registro exitoso
            JOptionPane.showMessageDialog(this, "El usuario ha sido registrado correctamente", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
            
            HomeView homeView = new HomeView(Logic_Repository_User.usuarioActualLogeado);
            dispose();            
        });

        // Acción del botón "Cancelar"
        btnCancelar.addActionListener(e -> {
            HomeView homeView = new HomeView(Logic_Repository_User.usuarioActualLogeado);
            dispose();
        });

        setVisible(true);
    }
}
