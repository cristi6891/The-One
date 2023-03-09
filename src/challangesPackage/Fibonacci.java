package challangesPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {

        Scanner inputInteger = new Scanner(System.in);
        System.out.println("Please give your desired number: ");
        long chosenNumber = inputInteger.nextInt();
        new Fibonacci().hundredFibonacciElements(closestFibonacci(chosenNumber));


    }

    public static long closestFibonacci(long number) {
        long nearest;


        long first = 0;
        long second = 1;
        long third = first + second;

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

    public void hundredFibonacciElements(long givenNumber) {
        ArrayList<Integer> fibonacciSequence = new ArrayList<>();
        double x = givenNumber / ((1 + Math.sqrt(5)) / 2);
        long previousNumber = (int) Math.round(x);

        for (int i = 0; i < 100; i++) {
            long nextNumber = previousNumber + givenNumber;
            fibonacciSequence.add((int) nextNumber);
            previousNumber = givenNumber;
            givenNumber = nextNumber;
        }
        System.out.println(fibonacciSequence);
    }

}
