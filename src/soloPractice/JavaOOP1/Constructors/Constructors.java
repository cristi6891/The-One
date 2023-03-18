package soloPractice.JavaOOP1.Constructors;

public class Constructors {
    private String name;

    //constructor:
    Constructors() {
        System.out.println("Constuctor Called:");
        name = "Programming";
    }

    public static void main(String[] args) {
        //constructor is invoked while creating an object of the Constuctors class
        Constructors obj = new Constructors();
        System.out.println("The name is " + obj.name);
    }


    // 1.NO-ARG Constructor

}
