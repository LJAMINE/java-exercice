package exe;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


class Computer  {
int a;
int b;

public int sommeNbr(int a, int b){
    return a+b;
  }

  public String afficherNbr(){
    return "computer is 100";
  }

  public  void typeOfpc(){
      System.out.println("computer is hp ");
  }

}

public class Main {
    public static void main(String[] args) {

        int a=2;
        int b=3;

Computer computer=new Computer();

int result=computer.sommeNbr(a,b);
        System.out.println(result);
        System.out.println(computer.afficherNbr());
computer.typeOfpc();

    }
}

