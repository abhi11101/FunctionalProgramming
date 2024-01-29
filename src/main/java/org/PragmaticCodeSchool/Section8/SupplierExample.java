package org.PragmaticCodeSchool.Section8;

import org.PragmaticCodeSchool.Data.Student;

import java.util.function.Supplier;

public class SupplierExample {

    private static Supplier<Student> s1 = () -> {

        return new Student();
    };

    private static Supplier<Supplier<Student>> studentSupplier = () -> Student::new;

    public static void main(String[] args) {
        System.out.println(s1.get());
        System.out.println(studentSupplier.get().get());
    }
}
