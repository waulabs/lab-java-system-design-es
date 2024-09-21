package org.alvarowau;

import org.alvarowau.models.Student;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();

        Student student1 = new Student("Álvaro", 85);
        Student student2 = new Student("Rebeca", 78);
        Student student3 = new Student("Macarena", 92);
        Student student4 = new Student("María", 67);

        studentMap.put(student1.getName(), student1);
        studentMap.put(student2.getName(), student2);
        studentMap.put(student3.getName(), student3);
        studentMap.put(student4.getName(), student4);

        System.out.println("Estudiantes antes de aumentar las notas:");
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        Student.increaseGrades(studentMap);

        System.out.println("\nEstudiantes después de aumentar las notas:");
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getValue());
        }

    }
}