package javabasic;

public class Test {
    public static void main(String[] args){
        Test t1=new Test();
        System.out.println(t1.sum());
        System.out.println("i am in main method");
    }
public int sum(){
        int a=10;
        int b=20;
        int c=a+b;
        return c;

    }
}
