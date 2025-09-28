package Stream.EX21;

abstract class Anima27 {
    private String name;
    private int age;

    public Anima27(String name,int age){
        this.age=age;
        this.name=name;
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

    abstract public void makeSounds();

    @Override
    public String toString() {
        return "Anima27{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
