package newss;

import java.util.ArrayList;
import java.util.List;

public class IapprenantImpl implements Iapprenant {

    List<Apprenant> list = new ArrayList<>();


    @Override
    public void ajouterApprenant(Apprenant apprenant) {

        if (apprenant.getScore()<8){
            throw new exceptionScore("your score is under 10");
        }else {
            list.add(apprenant);

        }
    }

    @Override
    public void afficherApprenant() {
        for (Apprenant a : list) {
            System.out.println(a);
        }
    }


    public static void main(String[] args) {
        Apprenant apprenant=new Apprenant("amine",12);
        Apprenant apprenant2=new Apprenant("said",2);


        IapprenantImpl iapprenant=new IapprenantImpl();

        try {
            iapprenant.ajouterApprenant(apprenant);
            iapprenant.ajouterApprenant(apprenant2);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        iapprenant.afficherApprenant();



    }
}


