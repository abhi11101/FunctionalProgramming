package org.PragmaticCodeSchool.Section12;

import org.PragmaticCodeSchool.Data.Student;
import org.PragmaticCodeSchool.Data.StudentDatabase;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMap {

    public static void main(String[] args) {
        System.out.println(nameList());
    }


    public static List<String> nameList(){

        Function<Student,String> studentFunction = Student::getName;

        return StudentDatabase.getAllStudents().stream()
                .map(studentFunction)
                .collect(Collectors.toList());

    }
}
