package soloPractice.JavaArrays;

public class Arrays {

    public static void main(String[] args) {

        int[] age = {12, 3, 5, 6, 7};

        System.out.println("Accessing the elements of the array:");
        System.out.println("First element: " + age[0]);
        System.out.println("Second element: " + age[1]);
        System.out.println("Third element: " + age[2]);
        System.out.println("Fourth element: " + age[3]);
        System.out.println("Fifth element: " + age[4]);


        //using loops to acces all the elements at once
        //for loop

        for (int i = 0; i < age.length; i++) {
            System.out.println("Elements of the array are: " + age[i]);
        }


        //for-each loop
        for (int j : age) {
            System.out.println(j);
        }


        //compute sum and average of array elements
        double sum = 0.0;
        double average;

        for (double sNr : age) {
            sum += sNr;
        }
        average = sum / age.length;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}
