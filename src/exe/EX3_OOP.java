package exe;

public class EX3_OOP {

    public static void main(String[] args) {
        try {
            int a=9;
            int b=0;

            double r =a/b;

            System.out.println(r);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
