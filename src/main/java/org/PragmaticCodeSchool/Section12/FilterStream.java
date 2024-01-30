package org.PragmaticCodeSchool.Section12;

import org.PragmaticCodeSchool.Data.Student;
import org.PragmaticCodeSchool.Data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterStream {

    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);
    }

    public static List<Student> filterStudents(){

        Predicate<Student> studentPredicate = student -> student.getGender().equals("female");
        return StudentDatabase.getAllStudents().stream()
                .filter(studentPredicate)
                .collect(Collectors.toList());
    }
}
