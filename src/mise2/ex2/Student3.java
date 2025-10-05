package mise2.ex2;

import java.util.ArrayList;
import java.util.List;

public class Student3  extends Person3{

    List<String> courses=new ArrayList<>();

    public Student3(int id,String name,int age){
        super(id, name, age);
        this.courses=new ArrayList<>();
    }

    @Override
    public void getDescription() {
        System.out.println("this is student");
    }


}
