package com.company;

public class Person implements Payable, Comparable<Person> {
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;

    public Person(){
        this.id = id_gen++;
    }
    public Person(String name, String surname){
        this.id = id_gen++;
        setName(name);
        setSurname(surname);
    }

    public int getId() {
        return id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return getId() + ". " + getName() + " " + getSurname();
    }
    public String getPosition() {
        return "Student";
    }
    public double getPaymentAmount() {
        return 0.00;
    }

    public int compareTo(Person person){
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
}
