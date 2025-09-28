package OOP_ex;

import java.util.ArrayList;
import java.util.HashMap;

class Student22{
    public String name ;
    public  int id ;

    public Student22(String name,int id){
        this.id=id;
        this.name=name;
    }
}


class Manager{
    HashMap<Integer, ArrayList<Integer>> storeGrade;
    HashMap<Integer,Student22> storeStudent;


    public Manager (){
        storeGrade=new HashMap<>();
        storeStudent=new HashMap<>();
    }


    public void addStudent(  Student22 student22){
        storeStudent.put(student22.id,student22);
        storeGrade.put(student22.id,new ArrayList<>());
    }

    public void addGrades(int studentId, int grade  ){
    ArrayList<Integer> grades=storeGrade.get(studentId);

    if (grades!=null){
        grades.add(grade);
    }else{
        System.out.println("not found ");
    }
    }

    public double getAvg(int studentId){
        double sum=0;

        ArrayList<Integer> grades= storeGrade.get(studentId);
        if (grades==null){
            System.out.println("no notes");
        }else {
            for ( int grade: grades){
                sum += grade;
            }
        }
        return sum/grades.size();
    }



    public void printAllavgGrade() {
        for ( int id : storeStudent.keySet()){
            Student22 student22=  storeStudent.get(id);
            double avg=getAvg(id);
            System.out.println(student22.name+avg);
        }
    }
}


public class StudentGradesImportant {

    public static void main(String[] args) {
        Student22 s1=new Student22("amine",1);
        Student22 s2=new Student22("said",2);
        Student22 s3=new Student22("med",3);

        Manager m=new Manager();
        m.addStudent(s1);
        m.addStudent(s2);

        m.addGrades(1,20);
        m.addGrades(1,10);
        m.addGrades(1,10);

        m.addGrades(2,12);
        m.addGrades(2,12);
        m.addGrades(2,12);

 m.printAllavgGrade();
     }


}
