package soloPractice.JavaOOP1.Strings;

public class CompareStrings {
    public static void main(String[] args) {

        String first = "Java programming";
        String second = "Java programming";
        String third = "Python programming";

        boolean result1 = first.equals(second);
        System.out.println("First and second strings are equal: " + result1);

        boolean result2 = first.equals(third);
        System.out.println("First and third strings are equal: " + result2);

    }
}
