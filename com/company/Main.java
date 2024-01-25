package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Person> personArray = new ArrayList<>();

        personArray.add(new Employee("Barry", "Alan", "Softare Engineer", 850000.00));
        personArray.add(new Employee("Doctor", "Strange", "Footballer", 500000.00));
        personArray.add(new Student("Dominic", "Cobb", 2.66));
        personArray.add(new Student("Murphy", "Cooper",  3.6));

        Collections.sort(personArray);
        printData(personArray);
    }
    public static void printData(Iterable<Person> personArray){
        for(Person person : personArray) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge" + " Position: "+person.getPosition());
        }
    }
}
