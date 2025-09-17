abstract class Persons{
  private   int age ;



    private String name;

    public Persons(int newage, String newname){
        age=newage;
        name=newname;
    }

    public String getName(){
        return name ;
    }

    public void setName(String name){
this.name=name;
    }

    public int getAge(){
        return age ;
    }

    public void setAge(int age){
        this.age=age;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public abstract void getRole() ;

}
