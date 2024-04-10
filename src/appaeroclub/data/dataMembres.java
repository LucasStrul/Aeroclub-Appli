package appaeroclub.data;

import config.Connect;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import appaeroclub.metier.membres;
import java.sql.Connection;
import java.sql.Date;

public class dataMembres extends Connect {

    Connection connection = dbConnection();

    public dataMembres() {
        this.connection = dbConnection();
    }

 public membres selectMembres(int numMembre) {
        membres membre = null;
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM membres WHERE num_membre = ?")) {
            statement.setInt(1, numMembre);
            try (ResultSet resultset = statement.executeQuery()) {
                if (resultset.next()) {
                    membre = new membres();
                membre.setNumMembre(resultset.getInt("NUM_MEMBRE"));
                membre.setNumCivilite(resultset.getString("NUM_CIVILITE"));
                membre.setNumQualif(resultset.getInt("NUM_QUALIF"));
                membre.setNom(resultset.getString("NOM"));
                membre.setPrenom(resultset.getString("PRENOM"));
                membre.setAdresse(resultset.getString("ADRESSE"));
                membre.setCodePostal(resultset.getString("CODE_POSTAL"));
                membre.setVille(resultset.getString("VILLE"));
                membre.setTel(resultset.getString("TEL"));
                membre.setPortable(resultset.getString("PORTABLE"));
                membre.setEmail(resultset.getString("EMAIL"));
                membre.setMotDePasse(resultset.getString("MOTDEPASSE"));
                membre.setNumSecu(resultset.getInt("NUM_SECU"));
                membre.setDateVM(resultset.getDate("DATE_VM"));
                membre.setValiditeVM(resultset.getString("VALIDITE_VM"));
                membre.setDateSEP(resultset.getDate("DATE_SEP"));
                membre.setValiditeSEP(resultset.getString("VALIDITE_SEP"));
                membre.setNumBadge(resultset.getString("NUM_BADGE"));
                membre.setProfession(resultset.getString("PROFESSION"));
                membre.setDateNaissance(resultset.getDate("DATE_NAISSANCE"));
                membre.setLieuNaissance(resultset.getString("LIEU_NAISSANCE"));
                membre.setCarteFederale(resultset.getString("CARTE_FEDERALE"));
                membre.setDateAttestation(resultset.getDate("DATE_ATTESTATION"));
                membre.setDateTheoriqueBB(resultset.getDate("DATE_THEORIQUE_BB"));
                membre.setDateTheoriquePPLA(resultset.getDate("DATE_THEORIQUE_PPLA"));
                membre.setDateBB(resultset.getDate("DATE_BB"));
                membre.setDatePPLA(resultset.getDate("DATE_PPLA"));
                membre.setDateEntree(resultset.getDate("DATE_ENTREE"));
                membre.setMembreActif(resultset.getString("MEMBREACTIF"));
                membre.setMembreInscrit(resultset.getString("MEMBREINSCRIT"));

            }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Gérez l'exception de manière appropriée
        }
        return membre; // Renvoie le membre trouvé ou null s'il n'existe pas
    }
    

    public void updateMembre(membres membre) {
        try {
            String query = "UPDATE membres SET NUM_CIVILITE = ?, NUM_QUALIF = ?, NOM = ?, PRENOM = ?, ADRESSE = ?, CODE_POSTAL = ?,"
                    + "VILLE = ?, TEL = ?, PORTABLE = ?, EMAIL = ?, NUM_SECU = ?, DATE_VM = ?,"
                    + "VALIDITE_VM = ?, DATE_SEP = ?, VALIDITE_SEP = ?, NUM_BADGE = ?, PROFESSION = ?, DATE_NAISSANCE = ?,"
                    + "LIEU_NAISSANCE = ?, CARTE_FEDERALE = ?, DATE_ATTESTATION = ?, DATE_THEORIQUE_BB = ?, DATE_THEORIQUE_PPLA = ?,"
                    + "DATE_BB = ?, DATE_PPLA = ?, DATE_ENTREE = ?, MEMBREACTIF = ?, membreInscrit = ? WHERE NUM_MEMBRE = ?";

            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, membre.getNumCivilite());
            statement.setInt(2, membre.getNumQualif());
            statement.setString(3, membre.getNom());
            statement.setString(4, membre.getPrenom());
            statement.setString(5, membre.getAdresse());
            statement.setString(6, membre.getCodePostal());
            statement.setString(7, membre.getVille());
            statement.setString(8, membre.getTel());
            statement.setString(9, membre.getPortable());
            statement.setString(10, membre.getEmail());
            statement.setInt(11, membre.getNumSecu());
            statement.setDate(12, (Date) membre.getDateVM());
            statement.setString(13, membre.getValiditeVM());
            statement.setDate(14, (Date) membre.getDateSEP());
            statement.setString(15, membre.getValiditeSEP());
            statement.setString(16, membre.getNumBadge());
            statement.setString(17, membre.getProfession());
            statement.setDate(18, (Date) membre.getDateNaissance());
            statement.setString(19, membre.getLieuNaissance());
            statement.setString(20, membre.getCarteFederale());
            statement.setDate(21, (Date) membre.getDateAttestation());
            statement.setDate(22, (Date) membre.getDateTheoriqueBB());
            statement.setDate(23, (Date) membre.getDateTheoriquePPLA());
            statement.setDate(24, (Date) membre.getDateBB());
            statement.setDate(25, (Date) membre.getDatePPLA());
            statement.setDate(26, (Date) membre.getDateEntree());
            statement.setString(27, membre.getMembreActif());
            statement.setString(28, membre.getMembreInscrit());
            statement.setInt(29, membre.getNumMembre());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteMembre(int numMembre) {
        try {
            String query = "DELETE FROM membres WHERE NUM_MEMBRE = ?";

            PreparedStatement statement = connection.prepareStatement(query);

            statement.setInt(1, numMembre);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
