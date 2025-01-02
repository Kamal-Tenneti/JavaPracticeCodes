package Constructors;

import java.util.Scanner;

class Student {
    // Data Members
    private int studentId;
    private String studentName;
    int studentAge;
    Scanner scanner = new Scanner(System.in);

    public Student() {
        this.studentId = 100;
        this.studentName = "Kamal";
        this.studentAge = 22;
    }

    void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails();
    }
}
