package soloPractice.JavaOOP1.Constructors;

public class NoArgConstructor {

    int i;
    String name;

    //constructor with no parameter
    private NoArgConstructor() {
        i = 5;
        System.out.println("Constructor is called");
    }

    /*public no-arg constructor
    public NoArgConstructor() {
        name = "Programming";
    }*/

    public static void main(String[] args) {
        //calling the constructor without any parameter
        NoArgConstructor obj = new NoArgConstructor();
        System.out.println("Value of i: " + obj.i);
    }
}

/*class Main {
    public static void main(String[] args) {
        // object is created in another class
        NoArgConstructor obj1 = new NoArgConstructor();
        System.out.println("Company name = " + obj1.name);
    }
}*/
