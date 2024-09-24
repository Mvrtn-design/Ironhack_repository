package com.example.Week1.D4;

public class Student_exc_3 extends Person_exc3 {
    private String studentId;

    public Student_exc_3(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "The student name is" + super.getName() + "\n"
                + "The student age is " + super.getAge() + "\n"
                + "The student ID is " + studentId;
    }
}
