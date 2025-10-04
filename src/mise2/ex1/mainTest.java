package mise2.ex1;

public class mainTest {
    public static void main(String[] args) {
        Livre2 livre1 =new Livre2(1,"azer","amine",true);
        Livre2 livre2 =new Livre2(2,"aqw","said",true);
        Membre m1=new Membre(1,"bro","great");
        Membre m2=new Membre(4,"zara","great");

        Bibliotheque b=new Bibliotheque();
        b.ajouterLivre(livre1);
        b.ajouterLivre(livre2);

        b.ajouterMembre(m1);
        b.ajouterMembre(m2);

        b.emprunterLivre(m1,livre1);

    }
}
