public class Vars {
    int x=3;

    public void myPublicMethod(){
        System.out.println("this is a public method");
    }

    static void myStaticMethod(){
        System.out.println("this is a static method");
    }


    public static void main(String[] args){

        Vars v=new Vars();
        v.x=111;
        System.out.println(v.x);
        v.myPublicMethod();
        myStaticMethod();


    }


}
