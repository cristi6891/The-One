package soloPractice.JavaOOP1.Strings;

public class JoinTwoStrings {
    public static void main(String[] args) {
        String first = "Java ";
        System.out.println("First String: " + first);

        String second = "Programming";
        System.out.println("Second String: " + second);

        String joinedStrings = first.concat(second);
        System.out.println("Joined Strings: " + joinedStrings);
    }
}
