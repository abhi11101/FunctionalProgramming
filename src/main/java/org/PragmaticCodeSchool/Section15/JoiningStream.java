package org.PragmaticCodeSchool.Section15;

import org.PragmaticCodeSchool.Data.Student;
import org.PragmaticCodeSchool.Data.StudentDatabase;

import java.util.stream.Collectors;

public class JoiningStream {

    public static void main(String[] args) {

        System.out.println(joining1());
        System.out.println(joining2());
        System.out.println(joining3());
    }

    public static  String joining1(){

        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static  String joining2(){

        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
    }

    public static  String joining3(){

        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(", ", "Name<< ", " >>"));
    }
}
