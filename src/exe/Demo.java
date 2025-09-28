package exe;

class Calc{
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }

    public int add(int n1,int n2  ){
        return n1+n2 ;
    }
}

public class Demo {

    public static void main(String[] args) {

        Calc c=new Calc();
        System.out.println( c.add(1,2));
        System.out.println(c.add(2,22,2));
    }
}
