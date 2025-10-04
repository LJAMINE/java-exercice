package mise2.ex1;

import java.time.LocalDate;

public class Emprunt {

    public Livre2 livre;
    public Membre membre;
    private LocalDate dateEmprunt;

    @Override
    public String toString() {
        return "Emprunt{" +
                "livre=" + livre +
                ", membre=" + membre +
                ", dateEmprunt='" + dateEmprunt + '\'' +
                '}';
    }

    public Emprunt(Livre2 livre, Membre membre, LocalDate dateEmprunt) {
        this.livre = livre;
        this.membre = membre;
        this.dateEmprunt = dateEmprunt;
    }
}
