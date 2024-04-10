package appaeroclub.data;

import config.Connect;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mindrot.jbcrypt.BCrypt;

public class dataUtilisateurs extends Connect {

    PreparedStatement preparedStatement = null;
    Connection connection = dbConnection();

    public dataUtilisateurs() {
        this.connection = dbConnection();
    }


    
    public boolean verifUtilisateur(String login, String motdepasse) {
        try {
            String sql = "SELECT password FROM admin WHERE email = ? AND id = 1";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, login);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String hashedPasswordFromDB = resultSet.getString("password");

                if (BCrypt.checkpw(motdepasse, hashedPasswordFromDB)) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(dataUtilisateurs.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
