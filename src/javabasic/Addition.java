package javabasic;

public class Addition {
    static {
        System.out.println("i am static block");
    }

    {
        System.out.println("i am instance block");
    }

    public Addition() {
        System.out.println("i am constructor");
    }

    public static void main(String[] args) {
        Addition a1 = new Addition();
        System.out.println(a1.sum());
        int a = 10;
        int b = 20;
        String name = "pooja";
    }

    public int sum() {
        int a = 10;
        int b = 20;
        int c = a + b;
        return c;
    }
}