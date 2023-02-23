package feb18;

public class DataTypes {

    public static void main(String[] args) {


        // 1. boolean type
        boolean flag = true;
        System.out.println(flag); //prints true

        // 2. byte type        //values from -128 to 127
        byte range;
        range = 124;
        System.out.println(range);   //prints 124

        // 3. short type       // values from -32768 to 32767
        short temperature;
        temperature = -4000;
        System.out.println(temperature);

        // 4. int type         // values from -2e31 to 2e31-1
        int scope = 98654849;
        System.out.println(scope);

        // 5. long type        // values from -2e63 to 2e63-1
        long bigNumber = -999999999999L;
        System.out.println(bigNumber);

        // 6. double type       // prints values up to 12 digits
        double digitNumber = -9877.5496465465;
        System.out.println(digitNumber);

        // 7. float type       //prints the value rounded to first 2 digits
        float multipleDigits = 89484.931F;
        System.out.println(multipleDigits);

        // 8. char type
        char experiment = '\uffff';     // unicode values
        char experiment1 = '9';         // character assigning
        char experiment2 = 42;          // ASCII values

        System.out.println(experiment);
        System.out.println(experiment1);
        System.out.println(experiment2);

    }
}
