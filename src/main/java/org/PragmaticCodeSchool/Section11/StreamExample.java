package org.PragmaticCodeSchool.Section11;

import org.PragmaticCodeSchool.Data.Student;
import org.PragmaticCodeSchool.Data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {


    public static void main(String[] args) {

        Map<String, List<String>> studentMap = StudentDatabase.getAllStudents().stream()
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(studentMap);

        Map<String,List<String>> studentFilterMap = StudentDatabase.getAllStudents().stream()
                .filter( student -> student.getGradeLevel()>=3)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentFilterMap);

        Predicate<Student> studentPredicate = student -> student.getGradeLevel()>=3;

        Map<String,List<String>> studentPredicateMap = StudentDatabase.getAllStudents().stream()
                .filter(studentPredicate)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentPredicateMap);

    }
}
