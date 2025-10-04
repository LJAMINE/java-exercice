package mise2.ex1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bibliotheque {
    List<Livre2> livres = new ArrayList<>();
    List<Membre> membres = new ArrayList<>();
    Map<Membre, List<Emprunt>> empruntsParMembre = new HashMap<>();

//    public Bibliotheque(List<Livre2> livres, List<Membre> membres, Map<Membre, List<Emprunt>> empruntsParMembre) {
//        this.livres = livres;
//        this.membres = membres;
//        this.empruntsParMembre = empruntsParMembre;
//    }

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "livres=" + livres +
                ", membres=" + membres +
                ", empruntsParMembre=" + empruntsParMembre +
                '}';
    }

    public void ajouterLivre(Livre2 l) {
        livres.add(l);
    }

    public void ajouterMembre(Membre m) {
        membres.add(m);
    }

    public void emprunterLivre(Membre m, Livre2 l) {

        if (!(l.isDisponible())) {
            System.out.println("not disponible");
            throw new RuntimeException("error not disponible ");
        }

        if (!(membres.contains(m))) {
            throw new RuntimeException("not membre  ");

        }


        List<Emprunt> emprunts = empruntsParMembre.getOrDefault(m, new ArrayList<>());
        if (emprunts.size() >= 3) {
            throw new RuntimeException("more than 3  ");
        }

        Emprunt e = new Emprunt(l, m, LocalDate.now());
        emprunts.add(e);

        empruntsParMembre.put(m, emprunts);

        l.setDisponible(false);
        m.setNombreEmprunt(m.getNombreEmprunt() + 1);
    }

    public void retournerLivre(Membre m, Livre2 l) {

        if (l.isDisponible() == false) {

            List<Emprunt> emprunts = empruntsParMembre.get(m);

            emprunts.removeIf(e -> e.livre.equals(l));

            m.setNombreEmprunt(m.getNombreEmprunt() - 1);
            l.setDisponible(true);
        }
    }

    public void afficherEmprunts(Membre m) {
        List<Emprunt> emprunts = empruntsParMembre.get(m);
        emprunts.forEach(System.out::println);
    }
}
