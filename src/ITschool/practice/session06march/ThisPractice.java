package ITschool.practice.session06march;

public class ThisPractice {

    int age;
    int height;

    public ThisPractice(int age) {
        this.age = age;
        System.out.println("first constructor was called");
    }

    public ThisPractice(int age, int height) {
        this.age = age;
        this.height = height;
    }


    void getName() {

    }

    void getAge() {
        this.getName();
    }
}
