package org.PragmaticCodeSchool.Section12;

import org.PragmaticCodeSchool.Data.Student;
import org.PragmaticCodeSchool.Data.StudentDatabase;

import java.util.function.Predicate;

public class StreamMatchExample {

    public static void main(String[] args) {
        System.out.println(allMatch());
        System.out.println(noneMatch());
        System.out.println(anyMatch());
    }

    public static boolean allMatch(){
        Predicate<Student> studentPredicate = student -> student.getGpa()>=3.5;
        return StudentDatabase.getAllStudents().stream()
                .allMatch(studentPredicate);
    }

    public static boolean noneMatch(){
        Predicate<Student> studentPredicate = student -> student.getGpa()>=3.5;
        return StudentDatabase.getAllStudents().stream()
                .noneMatch(studentPredicate);
    }

    public static boolean anyMatch(){
        Predicate<Student> studentPredicate = student -> student.getName().equals("James");
        return StudentDatabase.getAllStudents().stream()
                .anyMatch(studentPredicate);
    }
}
