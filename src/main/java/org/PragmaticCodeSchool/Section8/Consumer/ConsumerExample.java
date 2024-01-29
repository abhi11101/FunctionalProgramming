package org.PragmaticCodeSchool.Section8.Consumer;

import org.PragmaticCodeSchool.Data.Student;
import org.PragmaticCodeSchool.Data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c2 = (student) -> System.out.println(student.getName());
    static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());
    private static List<Student> studentList = StudentDatabase.getAllStudents();

    public static void main(String[] args) {

        Consumer<String> c1 = (str) -> System.out.println(str.toUpperCase());

        c1.accept("java 8");

//        printName();
//        printNameAndActivities();
        printNameActivitiesUsingCondition();
    }
    public static void printName() {
        Consumer<Student> c2 = (student) -> System.out.println(student);

        studentList.forEach(c2);
        System.out.println("-".repeat(20));
        studentList.forEach(student -> System.out.println(student));
    }

    public static void printNameAndActivities(){
        studentList.forEach(c2.andThen(c3));
    }

    public static void printNameActivitiesUsingCondition(){

        studentList.forEach((student) -> {
            if (student.getGradeLevel() >=3){
             c2.andThen(c3).accept(student);
            }
        });

    }

}
