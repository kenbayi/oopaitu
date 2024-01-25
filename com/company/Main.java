package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        //creating arraylist
        ArrayList<Person> personArray = new ArrayList<>();
        //giving data
        personArray.add(new Employee("Barry", "Alan", "Softare Engineer", 850000.00));
        personArray.add(new Employee("Doctor", "Strange", "Footballer", 500000.00));
        personArray.add(new Student("Dominic", "Cobb", 2.66));
        personArray.add(new Student("Murphy", "Cooper",  3.6));
        //sorting by payment
        Collections.sort(personArray);
        //output
        printData(personArray);
    }
    //output method
    public static void printData(Iterable<Person> personArray){
        for(Person person : personArray) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge" + " Position: "+person.getPosition());
        }
    }
}
