package exe;

public class Teacher extends Persons implements Payable {

    private String subject;

    public Teacher(int newage, String newname,String newsubject) {
        super(newage, newname);
        this.subject=newsubject;
    }


    public String getSubject(){
        return subject;

    }

    public void getRole() {
        System.out.println("this is a teacher");
    }

     public double getSalary() {
        return 0;
     }

     public void afficher(){
         System.out.println(getName()+" "+getAge()+" "+getSubject());
     }
}
