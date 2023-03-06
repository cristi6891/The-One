package ITschool.practice.session06march;

public class Animal {


    String colour;
    int age;
    int height;

    public Animal(String colour, int age, int height) {

        this.colour = colour;
        this.age = age;
        this.height = height;

    }

    public Animal(String colour) {
        this.colour = colour;
    }

    public Animal(String colour, int age) {
        this.colour = colour;
        this.age = age;

        if (age < 5) {
            System.out.println("Animal is too young!");
        }


    }
}
