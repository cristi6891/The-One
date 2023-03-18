package codewarsChallenges;

public class ExesAndOhs {

    public static void main(String[] args) {

        String str = "xXxoOo";
        boolean XO = false;
        int xCounter = 0;
        int yCounter = 0;
        StringBuilder sb = new StringBuilder(str);


        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'x') xCounter++;
            if (sb.charAt(i) == 'X') xCounter++;
            if (sb.charAt(i) == 'y') yCounter++;
            if (sb.charAt(i) == 'Y') yCounter++;

        }
        if (xCounter == yCounter) {
            XO = true;
        }
        //return XO;


    }
}
