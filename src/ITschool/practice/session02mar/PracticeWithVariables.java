package ITschool.practice.session02mar;

import java.util.List;

public class PracticeWithVariables {

    String name = "Marius";   //instance variable

    static String colour = "red"; // static variable

    //local variables = the ones inside of method
    public void genericMethod() {
        int age = 10; //local variable
    }


    public static void printElementsFromString(List<String> stringElements) {               // static method, putem sa o apelam din main method direct, fara sa facem un obiect nou
        for (String element : stringElements) {
            System.out.println(element);
        }

    }
}
