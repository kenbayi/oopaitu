package com.company;

public class Employee extends Person {
    private String position;
    private Double salary;

    public Employee(){
        super();
    }
    public Employee(String name, String surname, String position, Double salary){
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public double getPaymentAmount() {
        return getSalary();
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee: " + getId() +
                ". " + getName() + " " + getSurname();
    }
}
