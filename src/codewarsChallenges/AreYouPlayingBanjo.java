package codewarsChallenges;

import java.util.Scanner;

public class AreYouPlayingBanjo {

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        //System.out.println("please enter the name: ");
        //String name = input.next();
        String name = new String();

        if (name.startsWith("R")) {
            System.out.println(name + " plays banjo");
        } else if (name.startsWith("r")) {
            System.out.println(name + " plays banjo");
        } else {
            System.out.println(name + " does not play banjo");
        }

       // input.close();
    }
}
