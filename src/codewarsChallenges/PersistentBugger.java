package codewarsChallenges;

public class PersistentBugger {


    public static void main(String[] args) {
        System.out.println(PersistentBugger.persistence(999));
    }

    long num;
    String n = String.valueOf(num);

    public static String reverseNr(String n) {

        StringBuilder revNr = new StringBuilder(n);
        revNr.reverse();
        String reverseNr = revNr.toString();
        return reverseNr;
    }

    long reversed = Long.valueOf(reverseNr(n));

    public static int persistence(long reversed) {
        int counter = 0;
        long product = 1;
        if (reversed > 10) {

            while (reversed > 0) {
                long x = reversed % 10;
                product = product * x;
                reversed = reversed / 10;
            }
            counter = counter + 1;
            while (product > 10) {

                long y = product % 10;
                product = product * y;
                product = product / 10;
            }
            counter = counter + 1;


        } else {
            return counter;
        }
        return counter;
    }


}
