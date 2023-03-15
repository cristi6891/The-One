package soloPractice.JavaArrays;

public class MultiArraysPart2 {

    public static void main(String[] args) {

        int[][] a = {
                {1, -2, 3},
                {-4, -5, 6, 9},
                {7}
        };
        for (int[] innerArray : a) {
            for (int data : innerArray) {
                System.out.println(data);
            }
        }


        //initializing a 3d array (an array of 2d arrays)
        int[][][] test = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };

        for (int[][] array2D : test) {
            for (int[] array1D : array2D) {
                for (int item : array1D) {
                    System.out.println(item);
                }
            }
        }
    }
}
