package org.PragmaticCodeSchool.Section9;

import org.PragmaticCodeSchool.Data.Student;
import org.PragmaticCodeSchool.Data.StudentDatabase;

import java.util.function.Consumer;

public class ConsumerMethodReference {

    private static Consumer<Student> c1 = System.out::println;
    private static Consumer<Student> c2 = Student::printAllActivities;

    public static void main(String[] args) {

        StudentDatabase.getAllStudents().forEach(c1);
        System.out.println("-".repeat(50));
        StudentDatabase.getAllStudents().forEach(c2);

    }
}
