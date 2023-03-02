package ITschool.practice.session02mar;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    private String brand;
    private String colour;

    public static void main(String[] args) {
        List<String> brandList = new ArrayList<>();
        brandList.add("Ferrari");
        brandList.add("BMW");

        PracticeWithVariables practice = new PracticeWithVariables();
        practice.genericMethod();

        PracticeWithVariables.printElementsFromString(brandList); //static method
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
