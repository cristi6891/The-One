package challangesPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {

        Scanner inputInteger = new Scanner(System.in);
        System.out.println("Please give your desired number: ");
        int chosenNumber = inputInteger.nextInt();
        new Fibonacci().hundredFibonacciElements(closestFibonacci(chosenNumber));


    }

    public static int closestFibonacci(int number) {
        int nearest;


        int first = 0;
        int second = 1;
        int third = first + second;

        if (number == 0) {
            nearest = number;
        }

        while (third <= number) {
            first = second;
            second = third;
            third = first + second;
        }

        if (Math.abs(third - number) >= Math.abs(second - number)) {
            nearest = second;
        } else {
            nearest = third;
        }
        return nearest;

    }

    public void hundredFibonacciElements(int givenNumber) {
        ArrayList<Integer> fibonacciSequence = new ArrayList<>();
        double x = givenNumber / ((1 + Math.sqrt(5)) / 2);
        int previousNumber = (int) Math.round(x);

        for (int i = 0; i < 100; i++) {
            int nextNumber = previousNumber + givenNumber;
            fibonacciSequence.add((int) nextNumber);
            previousNumber = givenNumber;
            givenNumber = nextNumber;
        }
        System.out.println(fibonacciSequence);
    }

}
