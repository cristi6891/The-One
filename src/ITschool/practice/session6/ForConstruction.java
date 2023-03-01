package ITschool.practice.session6;

public class ForConstruction {

    public static void main(String[] args) {
        // int[] myArray = {1, 2, 3, 4};
        //   0  1  2  3
        // String[] stringArray = {"dog", "cat", "horse"};

        // System.out.println(myArray.length); //print nr of integers

        //   for (int index = 0; index < myArray.length; index++) {
        // System.out.println(myArray[index]);

        //for(int value : myArray){
        //System.out.println(value);


        int[] testArray = {1, 2, 3, 8, 4, 7};
        for (int index = 0; index < testArray.length; index++) {
            for (int y = 0; y < testArray.length; y++) {
                if (testArray[index] + testArray[y] == 10) {
                    //   System.out.println(testArray[index] + " " + testArray[y]);
                }
            }

            //find where the max value from the array is
            //array = [1, 5, 3, 9, 8, 15, 4, 3]


            int[] problemArray = {1, 5, 3, 9, 8, 15, 4, 3};
            for (int a = 0; (a + 1) < problemArray.length; a = 0) {

                if (problemArray[a] < problemArray[a + 1]) {
                    problemArray[a] = problemArray[a + 1];

                    for (int b = (a + 1); b < problemArray.length; b++) {

                        if (problemArray[a] < problemArray[b]) {
                            problemArray[a] = problemArray[b];
                        }
                    }
                    System.out.println("Max value is " + problemArray[a]);

                }

            }
        }

    }
}
