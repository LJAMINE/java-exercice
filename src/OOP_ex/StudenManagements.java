package OOP_ex;


import java.util.ArrayList;
import java.util.Iterator;

class Student25{
    int id ;
    String name;
    double grade;

    public Student25(int id ,String name, double grade ){
        this.id=id;
        this.name=name;
        this.grade=grade;
    }
}


class StudentManager25{

    ArrayList<Student25> studentStore=new ArrayList<>();

//    public StudentManager25(){
//        ArrayList<Student25> studentStore=new ArrayList<>();
//    }

    public void addStudents(Student25 student25){
        studentStore.add(student25);
    }

//    public  void removeById(int id){
//        for (Student25 s : studentStore){
//            if (s.id==id){
//                studentStore.remove(s);
//            }
//        }
//    }

    public void removeById(int id){
        Iterator<Student25> iterator = studentStore.iterator();
        while (iterator.hasNext()) {
            Student25 s = iterator.next();
            if (s.id == id) {
                iterator.remove();
            }
        }
    }

    public void findStudent (){
        for (Student25 s : studentStore){
            if (s.grade>12){
                System.out.println(s.name);
            }
        }
    }



    public void displayStudents (){
        for (Student25 s : studentStore){
                 System.out.println(s.name);
         }
    }


    public void addContactss(Contact25 c1) {
    }


}
public class StudenManagements {

    public static void main(String[] args) {
        Student25 s1=new Student25(1,"said",18);
        Student25 s2=new Student25(2,"BRO",10);
        Student25 s3=new Student25(3,"great",20);

    StudentManager25 studentManager25=new StudentManager25();

        studentManager25.addStudents(s1);
        studentManager25.addStudents(s2);
        studentManager25.addStudents(s3);

        studentManager25.displayStudents();
        System.out.println("------------------------------------------------------");
//        studentManager25.findStudent();
        System.out.println("------------------------------------------------------");

        studentManager25.removeById(1);

        studentManager25.displayStudents();


    }
}
