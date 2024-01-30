package org.PragmaticCodeSchool.Section15;

import org.PragmaticCodeSchool.Data.StudentDatabase;

import static java.util.stream.Collectors.counting;

public class CountingStream {

    public static void main(String[] args) {
        System.out.println(count());
    }

    public static long count(){

        return StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(counting());
    }
}
