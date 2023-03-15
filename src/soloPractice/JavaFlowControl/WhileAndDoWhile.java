package soloPractice.JavaFlowControl;

import java.util.Scanner;

public class WhileAndDoWhile {

    public static void main(String[] args) {

        //display numbers from 1 to 10
        int e = 1, r = 10;
        while (e <= r) {
            System.out.println(e++);
        }


        //sum of positive numbers only
        int sum3 = 0;
        //create an object of Scanner class
        Scanner input1 = new Scanner(System.in);
        //take integer input from the user
        System.out.println("Enter a number ");
        int t = input1.nextInt();

        //while loop
        while (t >= 0) {
            sum3 += t;

            System.out.println("Enter next number");
            t = input1.nextInt();
        }
        System.out.println("The sum is " + sum3);


        //do-while display numbers from 1 to 10
        int u = 1, o = 10;
        do {
            System.out.println(u++);
        }
        while (u <= o);


        //do-while sum of positive numbers
        Scanner input2 = new Scanner(System.in);
        int sum4 = 0, p = 0;

        do {
            sum4 += p;
            System.out.println("Next damn number");
            p = input2.nextInt();
        } while (p >= 0);
        System.out.println("The damn sum is " + sum4);


    }
}
