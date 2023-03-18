package soloPractice.JavaOOP1.AccessModifiers;

public class Public {

    public static void main(String[] args) {
        //accessing the public class
        PublicAccesModifier dog = new PublicAccesModifier();

        //accessing the public variable
        dog.legCount = 4;

        //accessing the public method
        dog.display();
    }
}
