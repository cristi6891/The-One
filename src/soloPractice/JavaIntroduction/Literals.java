package soloPractice.JavaIntroduction;

public class Literals {

    public static void main(String[] args) {

        int a = 1;
        float b = 2.5F;
        char c = 'F';

        // boolean literals
        boolean flag1 = false;
        boolean flag2 = true;


        // integer literals

        // binary
        int binaryNumber = 0b10010;
        System.out.println(binaryNumber);

        // octal
        int octalNUmber = 027;
        System.out.println(octalNUmber);

        // hexadecimal
        int hexadecimalNumber = 0x2F;
        System.out.println(hexadecimalNumber);

        //decimal
        int decimalNumber = 34;
        System.out.println(decimalNumber);


        //floating-point literals

        double myDouble = 3.4;
        float myFloat = 3.4F;

        //3.445*10^2
        double myDoubleScientific = 3.445e2;

        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myDoubleScientific);


        //charachter literals

        char letter = 'a';
        char backspace = '\b';
        char tab = '\t';
        char newLine = '\n';

        System.out.println("myDouble: " + letter);
        System.out.println("myFloat" + backspace);
        System.out.println(tab + "myDoubleScientific");
        System.out.println(newLine + "myDouble: ");


        //string literals

        String str1 = "Java Programming";
        String str2 = "Go Wild!";


    }
}
