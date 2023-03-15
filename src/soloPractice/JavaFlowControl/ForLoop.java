package soloPractice.JavaFlowControl;

public class ForLoop {

    public static void main(String[] args) {

        //program to print a text 5 times
        int forNr = 5;
        for (int h = 0; h < forNr; ++h) {
            System.out.println("Hope this works!");
        }

        //program to print numbers from 1 to 5
        int adNr = 5;
        for (int j = 1; j <= adNr; ++j) {
            System.out.println(j);
        }


        //program to find the sum of natural numbers from 1 to 1000
        int thousand = 1000;
        int sum = 0;

        for (int k = 1; k <= thousand; ++k) {
            sum += k;
        }
        System.out.println(sum);


        int sum1 = 0;
        for (int l = 1000; l >= 1; --l) {
            sum1 += l;
        }
        System.out.println("or like this " + sum1);


        //infinite for loop
        long sum0 = 0;
        for (long oo = 0; oo < 1; --oo) {
            sum0 += oo;
            System.out.println("this will crash " + sum0);
        }
        System.out.println("this will crash " + sum0);
    }
}
