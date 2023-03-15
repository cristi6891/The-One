package soloPractice.JavaOOP1;

public class ClassAndObjects {

    class ClassName {
        // fields / variables = STATES of the object || used to store data
        // methods = BEHAVIORS of the object || used to perform some operations

        ClassName object = new ClassName();  // creating an object
        // the Object "object" share the fields and methods of the prototype -- ClassName
    }

    class Bicycle {

        // state or field
        private int gear = 5;

        // behavior or method
        public void braking() {
            System.out.println("Working of Braking");
        }

        //creating new objects
        Bicycle sportsBicycle = new Bicycle();
        Bicycle touringBicycle = new Bicycle();


        //accessing members of a class
       // sportsBicycle.gear;
       // touringBicycle.braking();

    }
}
