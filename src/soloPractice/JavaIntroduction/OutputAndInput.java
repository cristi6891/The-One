package soloPractice.JavaIntroduction;

import java.util.Scanner;

public class OutputAndInput {

    public static void main(String[] args) {

        //Output
        System.out.println("1st println");
        System.out.println("2nd println");

        System.out.print("1st print ");
        System.out.print("2nd print");

        double unNr = -10.6;
        System.out.println();
        System.out.println(19);
        System.out.println(unNr);

        // Concatenated Strings
        System.out.println("I am " + "learning Java");
        System.out.println("The Number is: " + unNr);


        //Input with Scanner
        //in order to use the object of Scanner, we need to import java.util.Scanner package outside the main method

        //create an object of Scanner
        Scanner input = new Scanner(System.in);

        //take input from the user
        System.out.print("Enter an integer: ");
        int numero = input.nextInt();
        System.out.println("You entered " + numero);


        //getting float input
        System.out.print("Enter your float: ");
        float nextNr = input.nextFloat();
        System.out.println("Your float is " + nextNr);

        //getting double input
        System.out.print("My double number is: ");
        double myDouble = input.nextDouble();
        System.out.println("Here is my double number: " + myDouble);

        //getting String input
        System.out.print("Enter a text please: ");
        String myString = input.next();        //next() --- reads only a word from the user, nextLine() --- reads a line of text from the user
        System.out.println("Text you entered is " + myString);

        //closing the Scanner object
        input.close();

    }
}
