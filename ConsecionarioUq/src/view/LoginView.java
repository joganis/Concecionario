package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic_repository_user.Logic_Repository_User;
import models.Persona;

public class LoginView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginView() {
        initialize();
    }

    private void initialize() {
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        setResizable(false); // Bloquea la capacidad de redimensionar la ventana
        contentPane = new JPanel();
        contentPane.setBackground(Color.LIGHT_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblLogin = new JLabel("Login");
        lblLogin.setForeground(new Color(254, 255, 255));
        lblLogin.setFont(new Font("Arial", Font.BOLD, 70));
        lblLogin.setBounds(315, 39, 244, 106);
        contentPane.add(lblLogin);

        JLabel lblCompanyName = new JLabel("CarRentalCo");
        lblCompanyName.setForeground(Color.WHITE);
        lblCompanyName.setFont(new Font("Arial", Font.BOLD, 30));
        lblCompanyName.setBounds(315, 523, 223, 43);
        contentPane.add(lblCompanyName);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setForeground(new Color(254, 255, 255));
        lblUsername.setFont(new Font("Arial", Font.PLAIN, 24));
        lblUsername.setBounds(249, 157, 150, 30);
        contentPane.add(lblUsername);

        usernameField = new JTextField();
        usernameField.setFont(new Font("Arial", Font.PLAIN, 20));
        usernameField.setBounds(411, 157, 255, 30);
        usernameField.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        contentPane.add(usernameField);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setForeground(new Color(254, 255, 255));
        lblPassword.setFont(new Font("Arial", Font.PLAIN, 23));
        lblPassword.setBounds(249, 199, 150, 30);
        contentPane.add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 20));
        passwordField.setBounds(411, 199, 255, 30);
        passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        contentPane.add(passwordField);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBackground(new Color(254, 255, 255));
        btnLogin.setFont(new Font("Arial", Font.BOLD, 18));
        btnLogin.setBounds(154, 354, 150, 52);
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Lógica de autenticación
                Logic_Repository_User repository = new Logic_Repository_User();
                Persona usuario = repository.buscarUsuarioLogin(email, password);
                if (usuario != null) {
                    // Inicio de sesión exitoso
                    JOptionPane.showMessageDialog(contentPane, "Login successful!");
                    //cierra ventana login
                    dispose();
                    HomeView homeView = new HomeView(usuario);
                } else {
                    // Inicio de sesión fallido
                    JOptionPane.showMessageDialog(contentPane, "Invalid username or password!");
                }
            }
        });
        contentPane.add(btnLogin);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("Arial", Font.BOLD, 18));
        btnCancel.setBounds(483, 354, 150, 52);
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        contentPane.add(btnCancel);

        ImageIcon carImage = new ImageIcon(LoginView.class.getResource("/images/car.png"));
        JLabel lblCarImage = new JLabel(carImage);
        lblCarImage.setBounds(0, -29, 813, 632);
        contentPane.add(lblCarImage);

        setVisible(true);
    }
}
