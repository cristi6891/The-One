package ITschool.practice.session02mar;

import java.util.ArrayList;
import java.util.List;

public class PracticeWithParameterList {

    public static void main(String[] args) {
        List<String> humanNamesList = new ArrayList<String>();
        humanNamesList.add("Maria");
        humanNamesList.add("Razvan");
        printListOfString(humanNamesList);
    }

    public void genericMethod1(int a, int b, int c) {

    }

    public void genericMethod2(String name1, String name2, String name3) {

    }

    public static void printListOfString(List<String> humanNames) {
        for (String name : humanNames) {
            System.out.println(name);
        }
    }
}
