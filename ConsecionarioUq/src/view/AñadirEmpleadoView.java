package view;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import enums.TipoEstadoUsuario;
import enums.TipoUsuarioEmpresa;
import logic_repository_user.Logic_Repository_User;
import models.Empleado;
import models.Persona;
import javax.swing.SwingUtilities;

public class AñadirEmpleadoView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtCedula;
    private JTextField txtCorreo;
    private JTextField txtContraseña;
    private JButton btnGuardar;
    private JButton btnCancelar;

    public AñadirEmpleadoView() {
        initialize();
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 400);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel lblTitulo = new JLabel("Añadir Empleado");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setBounds(120, 20, 200, 30);
        contentPane.add(lblTitulo);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Arial", Font.PLAIN, 14));
        lblNombre.setBounds(40, 70, 100, 20);
        contentPane.add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setFont(new Font("Arial", Font.PLAIN, 14));
        txtNombre.setBounds(140, 70, 200, 25);
        contentPane.add(txtNombre);
        txtNombre.setColumns(10);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setFont(new Font("Arial", Font.PLAIN, 14));
        lblApellido.setBounds(40, 110, 100, 20);
        contentPane.add(lblApellido);

        txtApellido = new JTextField();
        txtApellido.setFont(new Font("Arial", Font.PLAIN, 14));
        txtApellido.setBounds(140, 110, 200, 25);
        contentPane.add(txtApellido);
        txtApellido.setColumns(10);

        JLabel lblCedula = new JLabel("Cédula:");
        lblCedula.setFont(new Font("Arial", Font.PLAIN, 14));
        lblCedula.setBounds(40, 150, 100, 20);
        contentPane.add(lblCedula);

        txtCedula = new JTextField();
        txtCedula.setFont(new Font("Arial", Font.PLAIN, 14));
        txtCedula.setBounds(140, 150, 200, 25);
        contentPane.add(txtCedula);
        txtCedula.setColumns(10);

        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setFont(new Font("Arial", Font.PLAIN, 14));
        lblCorreo.setBounds(40, 190, 100, 20);
        contentPane.add(lblCorreo);

        txtCorreo = new JTextField();
        txtCorreo.setFont(new Font("Arial", Font.PLAIN, 14));
        txtCorreo.setBounds(140, 190, 200, 25);
        contentPane.add(txtCorreo);
        txtCorreo.setColumns(10);

        JLabel lblContraseña = new JLabel("Contraseña:");
        lblContraseña.setFont(new Font("Arial", Font.PLAIN, 14));
        lblContraseña.setBounds(40, 230, 100, 20);
        contentPane.add(lblContraseña);

        txtContraseña = new JTextField();
        txtContraseña.setFont(new Font("Arial", Font.PLAIN, 14));
        txtContraseña.setBounds(140, 230, 200, 25);
        contentPane.add(txtContraseña);
        txtContraseña.setColumns(10);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setFont(new Font("Arial", Font.BOLD, 14));
        btnGuardar.setBounds(70, 290, 100, 30);
        contentPane.add(btnGuardar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setFont(new Font("Arial", Font.BOLD, 14));
        btnCancelar.setBounds(220, 290, 100, 30);
        contentPane.add(btnCancelar);

        setVisible(true);

        // Acción del botón "Guardar"
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener los valores de los campos de texto
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String cedula = txtCedula.getText();
                String correo = txtCorreo.getText();
                String contraseña = txtContraseña.getText();

                // Validar que los campos no estén vacíos
                if (nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty() || correo.isEmpty() || contraseña.isEmpty()) {
                    JOptionPane.showMessageDialog(contentPane, "Por favor, complete todos los campos.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Crear el objeto Empleado con los datos ingresados
                Empleado empleado = new Empleado(nombre, apellido, cedula, correo, contraseña,
                        TipoEstadoUsuario.ACTIVO, TipoUsuarioEmpresa.EMPLEADO);

                // Agregar el empleado a la lista de empleados
                Logic_Repository_User.dataEmpleados.add(empleado);

                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(contentPane, "Empleado agregado exitosamente.", "Éxito",
                        JOptionPane.INFORMATION_MESSAGE);

                // Cerrar la vista actual y volver a la vista de administrador
                VerEmpleadosView verEmpleadosView = new VerEmpleadosView(Logic_Repository_User.dataEmpleados);
                closeCurrentView();
            }
        });

        // Acción del botón "Cancelar"
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cerrar la vista actual y volver a la vista de administrador
                VerEmpleadosView verEmpleadosView = new VerEmpleadosView(Logic_Repository_User.dataEmpleados);
                closeCurrentView();
            }
        });
    }

    private void closeCurrentView() {
        SwingUtilities.getWindowAncestor(contentPane).dispose();
    }
}
