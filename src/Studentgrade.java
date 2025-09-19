import java.util.ArrayList;



class Mathss{
    public int id;
    public String name;
    ArrayList<Integer> grades;


    public  Mathss(int id, String name){
        this.id=id;
        this.name=name;
        this.grades=new ArrayList<>();

    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getAverage(){
        double somme = 0;
        for (int i = 0; i <grades.size() ; i++) {
            somme+= grades.get(i);
        }
        return somme/grades.size();


    }

    public  void afficher(){
        System.out.println(id+name);
    }
}
public class Studentgrade {

    public static void main(String[] args) {
        Mathss m=new Mathss(1,"amine");
        m.addGrade(12);
        m.addGrade(10);
        m.addGrade(2);
        m.addGrade(3);

//        System.out.println(m.getAverage());;

        m.afficher();
    }

}
