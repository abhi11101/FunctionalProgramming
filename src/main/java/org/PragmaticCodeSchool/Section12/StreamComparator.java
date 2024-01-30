package org.PragmaticCodeSchool.Section12;

import org.PragmaticCodeSchool.Data.Student;
import org.PragmaticCodeSchool.Data.StudentDatabase;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamComparator {
    public static void main(String[] args) {
        System.out.println(sortByName());
        System.out.println(sortByGPA());
    }

    public static List<Student> sortByName(){

        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }

    public static List<String> sortByGPA(){

        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .map(Student::getName)
                .collect(toList());

    }
}
