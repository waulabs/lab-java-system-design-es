package org.alvarowau.models;

import java.util.Map;
import java.util.Objects;

public class Student {

    private String name;
    private int grade;

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade < 0) {
            this.grade = 0;
        } else if (grade > 100) {
            this.grade = 100;
        } else {
            this.grade = grade;
        }
    }

    // Método para incrementar las notas de todos los estudiantes en el mapa
    public static Map<String, Student> increaseGrades(Map<String, Student> studentMap) {
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            Student student = entry.getValue();
            increaseGrade(student, 10);
        }
        return studentMap;
    }

    // Método privado para subir la nota de un estudiante
    private static Student increaseGrade(Student student, int percentage) {
        int newGrade = student.getGrade() + (student.getGrade() * percentage / 100);
        if (newGrade > 100) {
            newGrade = 100;
        }
        student.setGrade(newGrade);
        return student;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return grade == student.grade && Objects.equals(name, student.name);
    }

    // Sobrescritura de hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    // Sobrescritura de toString para una representación textual del objeto Student
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
