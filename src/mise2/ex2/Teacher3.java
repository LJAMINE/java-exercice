package mise2.ex2;

public class Teacher3 extends Person3 {
    public String subject;

    public Teacher3(int id, String name, int age, String subject) {
        super(id, name, age);
        this.subject=subject;
    }

    @Override
    public void getDescription() {
        System.out.println("this is teahcer"+subject);

    }


}
