package soloPractice.JavaOOP1.Methods;

public class MethodOverloading {

    private static void vision(int a) {
        System.out.println("Arguments " + a);
    }

    private static void vision(int a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    private static void vision (String str) {
        System.out.println("This method got a String obj as a parameter");
    }

    public static void main(String[] args) {
        vision(2);
        vision(3, 9);
        vision("henlo");

    }
}
