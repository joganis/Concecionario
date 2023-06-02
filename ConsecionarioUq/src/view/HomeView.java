
package view;
import javax.swing.border.EmptyBorder;
import enums.TipoUsuarioEmpresa;
import logic_repository_user.Logic_Repository_User;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import models.Persona;
import javax.swing.SwingUtilities;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblWelcome;

    public HomeView(Persona usuario) {
        initialize(usuario);
    }

    private void initialize(Persona usuario) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        if (usuario.getTipoUsuario().equals(TipoUsuarioEmpresa.EMPLEADO)) {
            // Vista para empleado
            lblWelcome = new JLabel("Welcome, " + usuario.getNombre());
            lblWelcome.setFont(new Font("Arial", Font.BOLD, 24));
            lblWelcome.setBounds(200, 200, 400, 30);
            contentPane.add(lblWelcome);

            JButton btnMostrarAutos = new JButton("Mostrar Autos");
            btnMostrarAutos.setFont(new Font("Arial", Font.BOLD, 18));
            btnMostrarAutos.setBounds(200, 300, 200, 50);
            contentPane.add(btnMostrarAutos);

            JButton btnRegistrarClientes = new JButton("Registrar Clientes");
            btnRegistrarClientes.setFont(new Font("Arial", Font.BOLD, 18));
            btnRegistrarClientes.setBounds(200, 400, 200, 50);
            contentPane.add(btnRegistrarClientes);

            JButton btnAnadirAutos = new JButton("Añadir Autos");
            btnAnadirAutos.setFont(new Font("Arial", Font.BOLD, 18));
            btnAnadirAutos.setBounds(200, 500, 200, 50);
            contentPane.add(btnAnadirAutos);

            JButton btnCerrarSesion = new JButton("Cerrar Sesión");
            btnCerrarSesion.setFont(new Font("Arial", Font.BOLD, 14));
            btnCerrarSesion.setBounds(650, 500, 120, 30);
            contentPane.add(btnCerrarSesion);

            setVisible(true);
            contentPane.setBounds(50, 50, 700, 500);

            // Acción del botón "Mostrar Autos"
            btnMostrarAutos.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    MostrarAutosView mostrarAutosView = new MostrarAutosView(Logic_Repository_User.dataVehiculos);
                    dispose();

                }
            });

            // Acción del botón "Registrar Clientes"
            btnRegistrarClientes.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Acción del botón "Registrar Clientes" para el empleado
                    RegistrarClientesView registrarClientesView = new RegistrarClientesView();
                   dispose();
                }
            });

            // Acción del botón "Añadir Autos"
            btnAnadirAutos.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Acción del botón "Añadir Autos" para el empleado
                	AñadirAutosView añadirAutos = new AñadirAutosView();
                	closeCurrentView();
                }
            });

            // Acción del botón "Cerrar Sesión"
            btnCerrarSesion.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Preguntar al usuario si está seguro de cerrar la sesión
                    int confirm = JOptionPane.showConfirmDialog(contentPane, "¿Estás seguro de cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);

                    if (confirm == JOptionPane.YES_OPTION) {
                        // Si el usuario confirma, cerrar la sesión y dirigirlo a LoginView
                        LoginView login = new LoginView();
                        closeCurrentView();
                    }
                }
            });

        } else if (usuario.getTipoUsuario().equals(TipoUsuarioEmpresa.ADMIN)) {
            // Vista para admin
            JButton btnVerEmpleados = new JButton("Ver Empleados");
            btnVerEmpleados.setFont(new Font("Arial", Font.BOLD, 18));
            btnVerEmpleados.setBounds(200, 300, 200, 50);
            contentPane.add(btnVerEmpleados);

            JButton btnAnadirEmpleado = new JButton("Añadir Empleado");
            btnAnadirEmpleado.setFont(new Font("Arial", Font.BOLD, 18));
            btnAnadirEmpleado.setBounds(200, 400, 200, 50);
            contentPane.add(btnAnadirEmpleado);

            JButton btnCerrarSesion = new JButton("Cerrar Sesión");
            btnCerrarSesion.setFont(new Font("Arial", Font.BOLD, 14));
            btnCerrarSesion.setBounds(650, 500, 120, 30);
            contentPane.add(btnCerrarSesion);

            lblWelcome = new JLabel("Welcome, Admin: " + usuario.getNombre());
            lblWelcome.setFont(new Font("Arial", Font.BOLD, 24));
            lblWelcome.setBounds(200, 100, 400, 30);
            contentPane.add(lblWelcome);
            setVisible(true);
            contentPane.setBounds(50, 50, 700, 500);

            // Acción del botón "Ver Reportes"
           

            // Acción del botón "Ver Empleados"
            btnVerEmpleados.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    VerEmpleadosView verEmpleadosView = new VerEmpleadosView(Logic_Repository_User.dataEmpleados);
                    closeCurrentView();
                }
            });

            // Acción del botón "Añadir Empleado"
            btnAnadirEmpleado.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Acción del botón "Añadir Empleado" para el admin
                	AñadirEmpleadoView verEmpleadosView = new AñadirEmpleadoView();
                     closeCurrentView();
                	
                }
            });

            // Acción del botón "Cerrar Sesión"
            btnCerrarSesion.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Preguntar al usuario si está seguro de cerrar la sesión
                    int confirm = JOptionPane.showConfirmDialog(contentPane, "¿Estás seguro de cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);

                    if (confirm == JOptionPane.YES_OPTION) {
                        // Si el usuario confirma, cerrar la sesión y dirigirlo a LoginView
                        LoginView login = new LoginView();
                        closeCurrentView();
                    }
                }
            });
        }
    }

    private void closeCurrentView() {
        SwingUtilities.getWindowAncestor(contentPane).dispose();
    }
}
