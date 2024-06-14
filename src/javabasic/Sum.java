package javabasic;

public class Sum {
    public static void main(String[] args) {
        System.out.println("test");
        Sum s1 = new Sum();
       s1.sum();
    }

    public int sum() {
        int a = 20;
        int b = 30;
        int c = a + b;
        return c;
    }

    {
        System.out.println("i am in instance block");
    }

    static {
        System.out.println("i am in static block");
    }
    public Sum(){
        System.out.println("i am a constructor ");
    }

}
