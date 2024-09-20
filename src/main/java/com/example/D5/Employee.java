package com.example.D5;

public class Employee {
    /**
     * This class has the information of a employee to be used as an object
     * 
     * @param standard information of an employee
     * 
     */
    String name;
    int ID;
    String position;
    double salary;

    public Employee(String name, int iD, String position, double salary) {
        this.name = name;
        this.ID = iD;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
