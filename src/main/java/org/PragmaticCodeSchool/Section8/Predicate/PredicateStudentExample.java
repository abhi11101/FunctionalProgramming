package org.PragmaticCodeSchool.Section8.Predicate;

import org.PragmaticCodeSchool.Data.Student;
import org.PragmaticCodeSchool.Data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    private static Predicate<Student> studentPredicate  = student -> student.getGradeLevel()>3;
    private static Predicate<Student> studentPredicateGPA = student -> student.getGpa()>=3.9;
    private static List<Student> studentList = StudentDatabase.getAllStudents();

    public static void main(String[] args) {

        filterStudentByGradeLevel();
        System.out.println("-".repeat(100));
        filterStudentByGPALevel();
        System.out.println("-".repeat(100));
        filterStudent();
    }

    public static void filterStudentByGradeLevel(){

        studentList.forEach(student -> {
            if (studentPredicate.test(student)){
                System.out.println(student);
            };
        });

    }

    public static void filterStudentByGPALevel(){

        studentList.forEach(student -> {
            if (studentPredicateGPA.test(student)){
                System.out.println(student);
            }
        });

    }

    public static void filterStudent(){

        studentList.forEach(student -> {

            if (studentPredicate.and(studentPredicateGPA).test(student)){
                System.out.println(student);
            }
        });
    }



    }
