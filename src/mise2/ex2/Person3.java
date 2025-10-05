package mise2.ex2;

public abstract   class Person3 {
    private int id;
    private String name;
    private int age;

    public Person3(int id,String name,int age){
        this.age=age;
        this.name=name;
        this.id=id;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public abstract void getDescription();
}
