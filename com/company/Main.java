package com.company;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Ilyas");
        student.setSurname("Kenbay");
        student.setDateOfBirth("31.05.2005");
        student.setGpa(3.5);

        System.out.println(student.toString());
    }
}

