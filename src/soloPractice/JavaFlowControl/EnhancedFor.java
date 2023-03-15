package soloPractice.JavaFlowControl;

public class EnhancedFor {

    public static void main(String[] args) {
        //for-each loop is used mainly for iterating through arrays


        //print array elements

        //create an array
        int[] numbers = {2, 5, -9, 15, 7};

        //for-each loop
        for (int numar : numbers) {
            System.out.println(numar);
        }



        //sum of array elements
        float[] experiment = {6.9F, 5.85F, 4.5F, 198.8F, -989.65F};
        float sum2 = 0F;
        for (float w : experiment) {
            sum2 += w;
        }
        System.out.println("suma experimentala e " + sum2);


    }
}
