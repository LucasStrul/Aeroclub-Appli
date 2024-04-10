package appaeroclub.metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class membres {

    private int numMembre;
    private String num_civilite;
    private int num_qualif;
    private String nom;
    private String prenom;
    private String adresse;
    private String codePostal;
    private String ville;
    private String tel;
    private String portable;
    private String email;
    private String motDePasse;
    private int numSecu;
    private Date dateVM;
    private String validiteVM;
    private Date dateSEP;
    private String validiteSEP;
    private String numBadge;
    private String profession;
    private Date dateNaissance;
    private String lieuNaissance;
    private String carteFederale;
    private Date dateAttestation;
    private Date dateTheoriqueBB;
    private Date dateTheoriquePPLA;
    private Date dateBB;
    private Date datePPLA;
    private Date dateEntree;
    private String membreActif;
    private String membreInscrit;
    
    
    public membres() {

    }

    // Méthode pour obtenir les attributs sous forme de tableau de chaînes de caractères
    public String[] getMembreList() {
        List<String> membreList = new ArrayList<>();
        membreList.add("" + this.getNumMembre());
        membreList.add("" + this.getNumCivilite());
        membreList.add("" + this.getNumQualif());
        membreList.add("" + this.getNom());
        membreList.add("" + this.getPrenom());
        membreList.add("" + this.getAdresse());
        membreList.add("" + this.getCodePostal());
        membreList.add("" + this.getVille());
        membreList.add("" + this.getTel());
        membreList.add("" + this.getPortable());
        membreList.add("" + this.getEmail());
        membreList.add("" + this.getMotDePasse());
        membreList.add("" + this.getNumSecu());
        membreList.add("" + this.getDateVM());
        membreList.add("" + this.getValiditeVM());
        membreList.add("" + this.getDateSEP());
        membreList.add("" + this.getValiditeSEP());
        membreList.add("" + this.getNumBadge());
        membreList.add("" + this.getProfession());
        membreList.add("" + this.getDateNaissance());
        membreList.add("" + this.getLieuNaissance());
        membreList.add("" + this.getCarteFederale());
        membreList.add("" + this.getDateAttestation());
        membreList.add("" + this.getDateTheoriqueBB());
        membreList.add("" + this.getDateTheoriquePPLA());
        membreList.add("" + this.getDateBB());
        membreList.add("" + this.getDatePPLA());
        membreList.add("" + this.getDateEntree());
        membreList.add("" + this.getMembreActif());
        membreList.add("" + this.getMembreInscrit());
        

        // Convertir la liste en tableau
        return membreList.toArray(new String[0]);
    }

    public int getNumMembre() {
        return numMembre;
    }

    public String getNumCivilite() {
        return num_civilite;
    }

    public int getNumQualif() {
        return num_qualif;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }

    public String getTel() {
        return tel;
    }

    public String getPortable() {
        return portable;
    }

    public String getEmail() {
        return email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public int getNumSecu() {
        return numSecu;
    }


    public Date getDateVM() {
        return dateVM;
    }

    public String getValiditeVM() {
        return validiteVM;
    }

    public Date getDateSEP() {
        return dateSEP;
    }

    public String getValiditeSEP() {
        return validiteSEP;
    }

    public String getNumBadge() {
        return numBadge;
    }

    public String getProfession() {
        return profession;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public String getCarteFederale() {
        return carteFederale;
    }

    public Date getDateAttestation() {
        return dateAttestation;
    }

    public Date getDateTheoriqueBB() {
        return dateTheoriqueBB;
    }

    public Date getDateTheoriquePPLA() {
        return dateTheoriquePPLA;
    }

    public Date getDateBB() {
        return dateBB;
    }

    public Date getDatePPLA() {
        return datePPLA;
    }

    public Date getDateEntree() {
        return dateEntree;
    }

    public String getMembreActif() {
        return membreActif;
    }

    public String getMembreInscrit() {
        return membreInscrit;
    }

    public void setNumMembre(int numMembre) {
        this.numMembre = numMembre;
    }

    public void setNumCivilite(String numCivilite) {
        this.num_civilite = numCivilite;
    }

    public void setNumQualif(int numQualif) {
        this.num_qualif = numQualif;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setPortable(String portable) {
        this.portable = portable;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setNumSecu(int numSecu) {
        this.numSecu = numSecu;
    }

    public void setDateVM(Date dateVM) {
        this.dateVM = dateVM;
    }

    public void setValiditeVM(String validiteVM) {
        this.validiteVM = validiteVM;
    }

    public void setDateSEP(Date dateSEP) {
        this.dateSEP = dateSEP;
    }

    public void setValiditeSEP(String validiteSEP) {
        this.validiteSEP = validiteSEP;
    }

    public void setNumBadge(String numBadge) {
        this.numBadge = numBadge;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public void setCarteFederale(String carteFederale) {
        this.carteFederale = carteFederale;
    }

    public void setDateAttestation(Date dateAttestation) {
        this.dateAttestation = dateAttestation;
    }

    public void setDateTheoriqueBB(Date dateTheoriqueBB) {
        this.dateTheoriqueBB = dateTheoriqueBB;
    }

    public void setDateTheoriquePPLA(Date dateTheoriquePPLA) {
        this.dateTheoriquePPLA = dateTheoriquePPLA;
    }

    public void setDateBB(Date dateBB) {
        this.dateBB = dateBB;
    }

    public void setDatePPLA(Date datePPLA) {
        this.datePPLA = datePPLA;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    public void setMembreActif(String membreActif) {
        this.membreActif = membreActif;
    }

    public void setMembreInscrit(String membreInscrit) {
        this.membreInscrit = membreInscrit;
    }

    public void setNumSecu(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNumQualif(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNumCivilite(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
