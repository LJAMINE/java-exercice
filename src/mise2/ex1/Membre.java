package mise2.ex1;

public class Membre {
    private  int idmembre;
    private String nom;
    private  String prenom ;
    private int nombreEmprunt = 0;

    public Membre(int idmembre, String nom, String prenom) {
        this.idmembre = idmembre;
        this.nom = nom;
        this.prenom = prenom;
     }

    @Override
    public String toString() {
        return "Membre{" +
                "idmembre=" + idmembre +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nombreEmprunt=" + nombreEmprunt +
                '}';
    }

    public int getIdmembre() {
        return idmembre;
    }

    public void setIdmembre(int idmembre) {
        this.idmembre = idmembre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNombreEmprunt() {
        return nombreEmprunt;
    }

    public void setNombreEmprunt(int nombreEmprunt) {
        this.nombreEmprunt = nombreEmprunt;
    }
}
