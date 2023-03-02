package ITschool.practice.session02mar;

public class PracticeWithMethods {

    public static void main(String[] args) {

        String name = getName();
        System.out.println("Name value is: " + name);

        printSumNumbers(10, 45);
    }

    //access modifier :
    //           public / protected / private / default
    //can be applied on class, on propriety, on variables


    //method signature =  name of the method and parameters of the method


    // public = access in all stuff contained by src folder

    public void someMethod() {
    }

    protected void anotherMethod() {
    }

    private void someMethod1() {
    }


    //return type can be "void" or some type (ex. String, int, double etc.)

    public static String getName() {     //can e type-ul (ex. String etc.) acolo cere unreturn
        String someName = "George";
        return someName;
    }

    public static void printSumNumbers(int a, int b) {   // void nu cere return
        System.out.println(a + b);
    }

    public Human getHuman() {

        Human human = new Human();
        return human;
    }

}
