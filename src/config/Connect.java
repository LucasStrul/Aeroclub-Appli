package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Connect {

    Connection connection;

    public Connection dbConnection() {

        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/aeroclub09";
            String utilisateur = "postgres";
            String motDePasse = "postgres";
            connection = DriverManager.getConnection(url, utilisateur, motDePasse);
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur : le pilote PostgreSQL n'est pas trouvé. Assurez-vous d'avoir ajouté le pilote JDBC à votre projet.");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Failed to connect !");
        }
        return connection;
    }

    public static void main(String[] args) {
        Connect database = new Connect();
        database.dbConnection();
    }
}
