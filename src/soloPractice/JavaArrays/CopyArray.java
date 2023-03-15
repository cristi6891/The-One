package soloPractice.JavaArrays;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] positiveNumbers = numbers;              // copying arrays
        // this is a SHALLOW COPY, the reference of a value is copied , not the value itself
        for (int number : positiveNumbers) {
            System.out.println(number);
        }

        numbers[0] = -1;
        for (int number : positiveNumbers) {
            System.out.print(number + ", ");
            System.out.println();
        }


        int[] source = {1, 2, 3, 4, 5, 6};
        int[] destination = new int[6];

        //iterate and copy elements from source to destination = DEEP COPY
        for (int i = 0; i < source.length; ++i) {
            destination[i] = source[i];
        }

        //converting array to string
        System.out.println(Arrays.toString(destination));


        // System.arraycopy (Object src, int srcPos, Object dest, int destPos, int length)
        // src = source array
        // srcPos = starting position (index) in the source array
        // dest = destination array
        // destPos = starting position (index) in the destination array
        // length = number of elements to copy


        System.arraycopy(source, 2, destination, 0, 3);
        System.out.println(Arrays.toString(destination));


        int[] n1 = {2, 3, 12, 4, 12, -2};
        int[] n3 = new int[5];

        //creating n2 array, having length of n1 array
        int[] n2 = new int[n1.length];

        //copying entire n1 array to n2
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2= " + Arrays.toString(n2));

        //copying elements from index 2 on n1 array
        //copying element to index 1 of n3 array
        //2 elements will be copied
        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3= " + Arrays.toString(n3));


        //Arrays.copyOfRange()
        int[] source1 = {2, 3, 12, 4, 12, -2};

        //copying entire source array to destination
        int[] destination1 = Arrays.copyOfRange(source1, 0, source1.length);
        System.out.println("destination1= " + Arrays.toString(destination1));

        //copying from index 2 to 5 (5 excluded)
        int[] destination2 = Arrays.copyOfRange(source1, 2, 5);
        System.out.println("destination2= " + Arrays.toString(destination2));


        //copying 2d arrays using loop
        int[][] sursa = {
                {1, 2, 3, 4},
                {5, 6},
                {0, 2, 42, -4, 5}
        };
        int[][] destinatia = new int[sursa.length][];

        for (int i = 0; i < destinatia.length; ++i) {

            //allocating space for each row of destination array
            destinatia[i] = new int[sursa[i].length];

            for (int j = 0; j < destinatia[i].length; ++j) {
                destinatia[i][j] = sursa[i][j];
            }

        }
        //displaying destination array
        System.out.println(Arrays.deepToString(destinatia));    //deepToString()  better representation of a 2d array


        //copying 2d arrays using arraycopy()
        int[][] destinatia2 = new int[sursa.length][];
        for (int i = 0; i < sursa.length; ++i) {
            destinatia2[i] = new int[sursa[i].length];
            System.arraycopy(sursa[i], 0, destinatia2[i], 0, destinatia2[i].length);

        }
        System.out.println(Arrays.deepToString(destinatia2));

    }
}
