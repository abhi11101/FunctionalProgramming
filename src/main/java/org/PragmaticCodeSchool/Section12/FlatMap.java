package org.PragmaticCodeSchool.Section12;

import org.PragmaticCodeSchool.Data.Student;
import org.PragmaticCodeSchool.Data.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlatMap {
    public static void main(String[] args) {
        System.out.println(printActivities());
        System.out.println(printDistinctActivities());
        System.out.println(printCountActivities());
        System.out.println(printSortedActivities());
    }

    public static List<String> printActivities(){

        return StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(toList());

    }

    public static List<String> printDistinctActivities(){
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(toList());
    }

    public static Long printCountActivities(){
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }

    public static List<String> printSortedActivities(){
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .sorted()
                .collect(toList());
    }
}
