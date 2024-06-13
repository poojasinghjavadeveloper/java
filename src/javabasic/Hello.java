package javabasic;

public class Hello {
    public static void main(String[] args) {
        System.out.println("i am in main method");
        Hello h1 = new Hello();
       System.out.println(h1.name());
    }
    public String name() {
        String name = "as";
        return name;

    }
}
