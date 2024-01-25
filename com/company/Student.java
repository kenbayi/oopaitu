package com.company;

public class Student extends Person{
    private Double gpa;
    public Student(){
        super();
    }
    public Student(String name, String surname, Double gpa){
        super(name, surname);
        setGpa(gpa);
    }
    //getters and setter others inherited from Person
    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
    public Double getGpa() {
        return gpa;
    }
    @Override
    public double getPaymentAmount() {
        if(getGpa() > 2.67){
            return 36660.00;
        }
        else{
            return 0.00;
        }
    }
    //output
    @Override
    public String toString() {
        return "Student: " + getId() + ". " + getName() + " " + getSurname();
    }
}
