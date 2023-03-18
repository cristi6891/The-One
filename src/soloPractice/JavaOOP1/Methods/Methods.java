package soloPractice.JavaOOP1.Methods;

public class Methods {

    //example of declaring a method
    // int addNumbers() {
    //code
    // }

    //complete syntax of declaring a method
    // modifier static returnType nameOfMethod(parameter1, parameter 2, ...) {
              //method body
     // }
              // modifier -- public, private etc.
             // static -- the method can be accessed without creating objects
            // parameter1, parameter 2 etc. -- values passed to a method; any number of arguments can be passed to a method


    // declare/create a method
    public int addNumbers(int a, int b) {
        int sum = a + b;
        //return value
        return sum;
    }


    public static int square(int num) {
        //return statement
        return num * num;
    }


    //method with no parameter
    public void display1 () {
        System.out.println("Method without parameter");
    }

    //method with single parameter
    public void display2(int q) {
        System.out.println("Method with a single parameter: " + q);
    }


    //methods are good for reusability
    private static int getSquare (int w) {
        return w * w;
    }


    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 34;

        //create an object of Methods
        Methods object = new Methods();
        //calling method
        int result = object.addNumbers(num1, num2);
        System.out.println("Sum is: " + result);

        int result1;
        //call the method
        //store returned value to result1
        result1 = square(10);
        System.out.println("Squared value of 10 is: " + result1);


        //create a new obj of Methods
        Methods object1 = new Methods();

        object1.display1();
        object1.display2(5); //'5' is the actual argument, while 'q' is the formal argument
                                // formal arguments must have the type specified
                                // type of formal and actual arguments should always match



        //!!! Java Standard Library Method

        System.out.println("Square root of 4 is: " + Math.sqrt(4));






        for (int i = 1; i <= 5; i++) {

            //method call
            int rezultat = getSquare(i);
            System.out.println("Square of " + i + " is " + rezultat);
        }

    }
}
