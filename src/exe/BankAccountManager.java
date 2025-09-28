package exe;

import java.util.HashMap;

class BankAccount{
public String accountNumber;
public String ownerName;
public double balance;

public BankAccount(String accountNumber,String ownerName,double balance){
    this.accountNumber=accountNumber;
    this.ownerName=ownerName;
    this.balance=balance;
}

}


class Bank{

    HashMap<String,BankAccount> storeAccount;

    public Bank(){
        this.storeAccount=new HashMap<>();
    }

    public  void addAccount(String accountNumber,BankAccount bankAccount){
     storeAccount.put(accountNumber,bankAccount);
    }

    public void Withdraw (double balance,BankAccount bankAccount){
        if (balance<0 && balance >bankAccount.balance){
            System.out.println("balance is negative or balance is bigger");
        }else {
            bankAccount.balance-=balance;
        }
    }

    public void deposit (double balance,BankAccount bankAccount){
        if (balance<0 ){
            System.out.println("balance is negative");
        }else {
            bankAccount.balance+=balance;
        }
    }

    public void affichage(){
//        for (int i=0;i<storeAccount.size();i++){
//            System.out.println(storeAccount.keySet());
//            System.out.println(storeAccount.get("12"));
//        }
        for (BankAccount bankAccount : storeAccount.values()){
            System.out.println(bankAccount.accountNumber+bankAccount.ownerName+bankAccount.balance);
        }

    }
}





public class BankAccountManager {
    public static void main(String[] args) {


        BankAccount a=new BankAccount("12","aziz",12);
        BankAccount b=new BankAccount("112","amine",100);
        BankAccount c=new BankAccount("13","med",2);

        Bank bank=new Bank();

        bank.addAccount("12",a);
        bank.addAccount("112",b);
        bank.addAccount("13",c);

        bank.affichage();

    }

}
