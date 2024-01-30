package org.PragmaticCodeSchool.Section12;

import org.PragmaticCodeSchool.Data.Student;
import org.PragmaticCodeSchool.Data.StudentDatabase;

public class FindAnyStream {
    public static void main(String[] args) {

        System.out.println(findAny());
        System.out.println(findFirst());
    }

    public static String findAny(){

        return StudentDatabase.getAllStudents().stream()
                .findAny()
                .get()
                .getName();
    }

    public static String findFirst(){

        return StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female"))
                .findFirst()
                .get()
                .getName();
    }
}
