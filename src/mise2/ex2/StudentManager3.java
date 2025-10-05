package mise2.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StudentManager3 {

    List<Student3> studentes=new ArrayList<>();


    public void addStudent(Student3 s){
        studentes.add(s);
    }

    public void removeStudentById(int id){
        studentes.removeIf(s->s.getId()==id);
    }

    public void updateStudent(int id, Student3 newStudent){
        for (int i = 0; i < studentes.size(); i++) {
            if (studentes.get(i).getId()==id){
                studentes.set(i,newStudent);
                break;
            }
        }
    }

    public Student3 getStudentById(int id){
       Optional<Student3> studentFound = (studentes.stream().filter(s -> s.getId() == id).findFirst());
       return studentFound.orElse(null);

    }

    public List<Student3> getAllStudents(){
        return studentes;
    }

    // Example: Stream method to get students above a certain age

    public  List<Student3>student3saboveAge(int age){
        return studentes.stream().filter(s->s.getAge()>10).toList();
    }

    // Example: Stream method to get students enrolled in a specific course

}
