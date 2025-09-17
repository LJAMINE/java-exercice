public class Students extends Persons {

    private int studentId;

    public Students(int newage, String newname, int newStudentId) {
        super(newage, newname);
        this.studentId = newStudentId;
    }

    public int getStudentId() {
        return studentId;

    }

    public void getRole() {
        System.out.println("this is a students");
    }

    public void afficher() {
        System.out.println(getName() + " " + getAge() + " " + getStudentId());
    }
}
