package ITschool.practice.session06march;

public class ConstructorPractice {

    public static void main(String[] args) {

        Animal cat = new Animal("red", 2, 20);  //the part after '=' is the constructor
        System.out.println(cat.colour);

        Animal dog = new Animal("Yellow");
        Animal dog1 = new Animal("blue", 3);
        System.out.println(dog1.age);

        ThisPractice thisPractice = new ThisPractice(12, 22);
        System.out.println(thisPractice.height);

    }
}
