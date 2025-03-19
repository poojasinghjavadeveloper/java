package javaproblems;

public class HelloTwo {

    public static void main(String[] args) {
        System.out.println(" i am in Main method");
    }


    int age=10;
    String name="Dhurv";

    public  HelloTwo(){
        System.out.println("i am in constructor");
    }

    HelloTwo helloTwo=new HelloTwo();

    static {
        System.out.println("i am in static block");
    }



    {


        System.out.println("i am in instance block");
    }

    public void test(){
        System.out.println("i am test method");
    }

    public  int sum()
    {return  5+9;

    }
}
