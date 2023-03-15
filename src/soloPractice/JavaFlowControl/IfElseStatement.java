package soloPractice.JavaFlowControl;

public class IfElseStatement {

    public static void main(String[] args) {

        int ifNr = 10;
        if (ifNr < 5) {  //the condition is false, so the code inside the block of the if statement is skipped
            System.out.println("This number is less than 5.");
        }
        System.out.println("This is the code outside the if block!");


        //if statement with String
        String language = "Java";  //create a string variable

        if (language != "Java") {
            System.out.println("Java is the best programming language");
        }
        System.out.println("This sucks!");


        //if...else (if-then-else) statement
        int elseNr = 23;
        if (elseNr < 0) {
            System.out.println("ElseNr is negative");
        } else {
            System.out.println("ElseNumber is positive");
        }
        System.out.println("Statement outside if...else block");


        //if-else-if statement
        int aNumber = 0;

        //checks if number greater than 0
        if (aNumber > 0) {
            System.out.println("Your number is positive");
        } else if (aNumber < 0) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("Your number is zero");
        }
        System.out.println("code outside of if-else-if ladder");


        //nested if-else Statement
        Double n1 = 98.8, n2 = -333.89, n3 = 67.43, biggest; //declaring the variables

        //checks if n1 >= n2
        if (n1 >= n2) {

            //checks if n1 >= n3
            if (n1 >= n3) {
                biggest = n1;
            } else {
                biggest = n3;
            }
        } else {

            //checks if n2>= n3
            if (n2 >= n3) {
                biggest = n2;
            } else {
                biggest = n3;
            }
        }
        System.out.println("the largest number is " + biggest);
    }

}


