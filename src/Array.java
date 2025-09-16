

class Person{
    int age ;
    String name;
}

public class Array {

    public static void main(String[] args) {

        Person p1=new Person();
        p1.age=10;
        p1.name="said";

        System.out.println(p1.age);
        System.out.println(p1.name);



        int nums[]={1,3,2,4};

//        for (int i=0;i<nums.length;i++){
//            System.out.println(nums[i]);
//        }

        for(int n:nums){
            System.out.println(n);
        }
    }
}
