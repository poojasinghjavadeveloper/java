package javaproblems;

public class HelloOne {
    //varaible

    int age = 10;
    String name = "moti singh";
    long aadharNumber = 1234123451234l;
    double salary = 2345;

    // main method
    public static void main(String[] args) {
        System.out.println(" i am in main method");
    }

    //instance block
    {
        System.out.println("I am in instance block");
    }

    //static block
    static {
        System.out.println("I am in static block");
    }

    HelloOne helloOne = new HelloOne();
}
