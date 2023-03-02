package ITschool.practice.session02mar;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<String>();
        ArrayList<String> graduateList = new ArrayList<String>();

        studentList.add("Mihai");
        studentList.add("Alina");
        studentList.add("Ioan");
        studentList.add("Oana");
        studentList.add("Adina");
        studentList.add("Florin");
        studentList.add("Alex");
        studentList.add("Andrei");
        studentList.add("Irina");
        studentList.add("Elena");

        graduateList = studentList;
        for (String student : graduateList) {
            System.out.println(student);
        }

    }
}
