package org.PragmaticCodeSchool.Section8.Consumer;

import org.PragmaticCodeSchool.Data.Student;
import org.PragmaticCodeSchool.Data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<Integer,Integer> multiply = (a,b)->{

            System.out.println("Multiply result: " + (a*b));

        };

        BiConsumer<Integer,Integer> divide = (a,b) -> {

            System.out.println("Divide Result: " + (a/b) );
        };

        multiply.andThen(divide).accept(9,6);

        nameAndActivities();
    }

    public static void nameAndActivities(){

        List<Student> studentList = StudentDatabase.getAllStudents();

        BiConsumer<String, List<String>> biConsumer = (name,activities) -> System.out.println(name + " : " + activities);

        studentList.forEach( student -> biConsumer.accept(student.getName(),student.getActivities()));
    }
}
