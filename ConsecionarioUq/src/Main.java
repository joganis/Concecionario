
import logic_repository_user.Logic_Repository_User;
import view.LoginView;

public class Main {
    public static void main(String[] args) {
    	        // Crear una instancia de la clase Logic_Repository_User
    	        Logic_Repository_User repository = new Logic_Repository_User();
    	        // Agregar usuarios a las listas de empleado, cliente y admin
    	        repository.crearUsuariosQuemadosYReportes();
        LoginView loginView = new LoginView();
    }
}
