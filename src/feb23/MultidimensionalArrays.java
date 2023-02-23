package feb23;

public class MultidimensionalArrays {

    public static void main(String[] args) {


        //create a 2d array
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7}
        };

        //calculate the lenght of each row
        System.out.println("Lenght of row 1: " + a[0].length);
        System.out.println("Lenght of row 2: " + a[1].length);
        System.out.println("Lenght of row 3: " + a[2].length);


        //print elements of the array using loops
        //for loop
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                System.out.println(a[i][j]);
            }
        }
    }
}
