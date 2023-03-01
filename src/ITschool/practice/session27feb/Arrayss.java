package ITschool.practice.session27feb;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arrayss {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int index = 0; index < 50000000; index++) {
            arrayList.add("a");
            linkedList.add("a");
        }

        long startTime = System.currentTimeMillis();
        String getArrayValueList = arrayList.get(4900000);
        long endTime = System.currentTimeMillis();
        System.out.println("Array List: " + (endTime - startTime));

        long startTime2 = System.currentTimeMillis();
        String getLinkedValueList = linkedList.get(4900000);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Linked List: " + (endTime - startTime));

    }
}
