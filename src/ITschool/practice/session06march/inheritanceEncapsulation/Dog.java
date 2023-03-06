package ITschool.practice.session06march.inheritanceEncapsulation;

public class Dog extends Animal {

    void makeNoise() {
        System.out.println("dog barks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
       dog.makeNoise();
    }
}
