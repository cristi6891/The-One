package ITschool.practice.session13mar;

public class Polygon {

    public void render() {

        System.out.println("Rendering polygon.");

    }

    public static void main(String[] args) {

        Polygon polygon;
        Square s1 = new Square();
        s1.render();

        Triangle t1 = new Triangle();
        t1.render();

        polygon = new Square();
        polygon.render();
    }
}

class Square extends Polygon {
    public void render() {
        System.out.println("Rendering square");
    }

    public void getAea() {

    }
}

class Triangle extends Polygon {
    public void render() {
        System.out.println("Rendering Triangle");
    }

    public void getHeight() {

    }
}

