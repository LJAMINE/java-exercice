package mise2.ex1;

public class Livre2 {
    private int id;
    private String title;
    private String auteur;
    private  boolean disponible=true;

    public Livre2(int id, String title, String auteur, boolean disponible) {
        this.id = id;
        this.title = title;
        this.auteur = auteur;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Livre2{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", auteur='" + auteur + '\'' +
                ", disponible=" + disponible +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
