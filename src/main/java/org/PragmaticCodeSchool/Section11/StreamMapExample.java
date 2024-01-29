package org.PragmaticCodeSchool.Section11;

import org.PragmaticCodeSchool.Data.Student;
import org.PragmaticCodeSchool.Data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {


    public static void main(String[] args) {

        System.out.println(nameList());


    }

    public static List<String> nameList(){
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
