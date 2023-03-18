package soloPractice.JavaOOP1.Constructors;

public class DefaultConstructor {

    int a;
    boolean b;

    public static void main(String[] args) {
        //a default constructor is called
        DefaultConstructor obj = new DefaultConstructor();

        System.out.println("Default value:");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }
}
