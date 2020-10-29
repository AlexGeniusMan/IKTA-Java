package ru.alexgeniusman.java2020.part_13;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        int i = 0;
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(5.0));
        students.add(new Student(4.91));
        students.add(new Student(4.78));
        students.add(new Student(3.25));
        students.add(new Student(4.47));
        students.add(new Student(3.82));
        students.add(new Student(4.24));

        Collections.sort(students, new SortingStudentsByGPA());
        for (Student s : students) {
            if (i == 0) System.out.println("Первый список");
            System.out.println(s.toString()+" ");
            i++;
        }
        System.out.println("\n");

        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(new Student(3.12));
        students1.add(new Student(2.93));
        students1.add(new Student(3.75));
        students1.add(new Student(2.27));
        students1.add(new Student(3.48));
        students1.add(new Student(4.86));
        students1.add(new Student(3.20));

        i=0;
        Collections.sort(students1, new SortingStudentsByGPA());
        for (Student s1 : students1) {
            if (i == 0) System.out.println("второй список");
            System.out.println(s1.toString()+" ");
            i++;
        }
        System.out.println("\n");

        i=0;
        students.addAll(students1);
        Collections.sort(students, new SortingStudentsByGPA());
        for (Student s : students) {
            if (i == 0) System.out.println("объединённый список");
            System.out.println(s.toString()+" ");
            i++;
        }
    }
}
