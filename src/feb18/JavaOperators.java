package feb18;

public class JavaOperators {

    public static void main(String[] args) {

        // 1. Arithmetic Operators

        int x = 15, y = 13;
        double z = 13.0;

        //addition operator
        System.out.println("x + y = " + (x + y));

        // substraction operator
        System.out.println("x - y = " + (x - y));

        // multiplication operator
        System.out.println("x * y = " + (x * y));

        // division operator
        System.out.println("x / y = " + (x / y));     // division between 2 integers -- result is also an integer
        System.out.println("x / z = " + (x / z));    // division between 1 integer, 1 float or double/ 2 float or double is also a float or double

        // modulo operator - used mainly with integers
        System.out.println("x % y = " + (x % y));


        // 2. Assignment Operators  --  var keeps the value of the precedent operation

        int a = 5;
        int var;

        // assign value using =  // [var = a]
        var = a;
        System.out.println("var using =:" + var);

        // assign value using -=  // [var = var - a]
        var -= a;
        System.out.println("var using -=:" + var);

        // assign value using +=  // [var = var + a]
        var += a;
        System.out.println("var using +=:" + var);

        // assign value using *=  // [var = var * a]
        var *= a;
        System.out.println("var using *=:" + var);

        // assign value using /=  // [var = var / a]
        var /= a;
        System.out.println("var using /=:" + var);

        // assign value using %=  // [var = var % a]
        var %= a;
        System.out.println("var using %:" + var);


        // 3. Relational Operators

        // create variables
        int xx = 4;
        int yy = 12;

        System.out.println("xx is " + xx + " and yy is " + yy);

        // == (Is Equal To)
        System.out.println("Is xx == yy? " + (xx == yy));  //false

        // != (Not Equal To)
        System.out.println("Is xx 1= yy? " + (xx != yy));  //true

        // > (Greater Than)
        System.out.println("Is xx > yy? " + (xx > yy));   //false

        // < (Lesser Than)
        System.out.println("Is xx < yy? " + (xx < yy));   //true

        // >= (Greater Than or Equal To)
        System.out.println("Is xx >= yy? " + (xx >= yy));   //false

        // <= (Lesser Than or Equal To)
        System.out.println("Is xx <= yy? " + (xx <= yy));   //true


        // 4. Logical Operators

        // && operator [logical AND] ---- expression1 && expression2 -- true only if both expressions are true
        System.out.println((9 < 12) && (7 > 5)); //true
        System.out.println((9 < 12) && (7 > 5) && (5 < 3));  //false

        // || operator [logical OR] ---- expression1 || expression2 -- true if either of the expressions is true
        System.out.println((9 > 12) || (7 > 5));  //true
        System.out.println((9 > 12) && (7 < 5));  //false

        // ! operator [logical NOT] ---- !expression1 -- true if the expression is false and viceversa
        System.out.println(!(9 > 12));  //true
        System.out.println(!(9 < 12) || !(7 > 5));  //false


        // 5. Unary Operators

        // !!! if ++/-- operator used as PREFIX like ++var, value of var is incremented by 1 first, then it returns the value
        // !!! if ++/-- operators used as a POSTFIX like var++, the original value of var is returned first, then var is incremented with 1

        // declare variables
        int num1 = 8, num2 = 8;
        int result1, result2;

        //original values
        System.out.println("Value of num1: " + num1);
        System.out.println("Value of num2: " + num2);

        // ++ increment operator
        result1 = ++num1;
        System.out.println("Incremented value of num1: " + result1);

        // -- decrement operator
        result2 = --num2;
        System.out.println("Decremented value of num2: " + result2);


        // 6. Other Operators

        // instanceof Operator
        String str = "Programming";
        boolean result;
        // checking if str is an instance of the String class
        result = str instanceof String;
        System.out.println("Is str an object of String? " + result);

        // Ternary Operator  [variable = Expression ? expression1 : expression2]
        int testResult = 32;
        String rezultat;

        rezultat = (testResult > 50) ? "You passed! Congrats!!!" : "You suck! Go back to learning!";
        System.out.println(rezultat);

    }
}
