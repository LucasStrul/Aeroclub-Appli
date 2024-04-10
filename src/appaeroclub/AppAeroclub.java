package appaeroclub;

//import org.mindrot.jbcrypt.BCrypt;

import org.mindrot.jbcrypt.BCrypt;


public class AppAeroclub {
    
    public static void main(String[] args) {    
        Login.LoginGraph.setVisible(true);
        Login.LoginGraph.setTitle("Fenêtre Login"); //On donne un titre à l'application
        Login.LoginGraph.setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
        Login.LoginGraph.setResizable(false); //On interdit la redimensionnement de la fenêtre
        Login.LoginGraph.setDefaultCloseOperation(Login.LoginGraph.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
        String password = "aeroclub";
        
        // Génération du mot de passe haché avec BCrypt
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        
        System.out.println("Mot de passe original : " + password);
        System.out.println("Mot de passe haché : " + hashedPassword);
    }
}