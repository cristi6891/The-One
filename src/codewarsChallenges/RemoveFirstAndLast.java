package codewarsChallenges;

public class RemoveFirstAndLast {

    public static void main(String[] args) {

        // your code here
        String str = "Majkhsgdfjashgfasdhjkfgkljdsahfgbkjadhsfbgkajdshbfg!";
        int first = 0;
        int last = str.length();
        if (last < 2) {
            System.out.println(str);
        } else {
            str = str.substring(1, last-1);
            System.out.println(str);
        }

    }
}
