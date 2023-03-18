package soloPractice.JavaOOP1.AccessModifiers;

class PrivateAccesModifier {

    //DECLARATIONS ARE VISIBLE WITHIN THE CLASS ONLY
    //NOT POSSIBLE FOR CLASSES OR INTERFACES, JUST NESTED CLASSES

    //private variable
    private String name;

}

 class Main {
    public static void main(String[] args) {
        //create an object of PrivateAccessModifier
        PrivateAccesModifier object = new PrivateAccesModifier();

        //access private variable and field from another class
        //object.name = "java";

        //we get an error because we try to access the private variable of the PrivateAccessModifier in the Main class
    }
}
