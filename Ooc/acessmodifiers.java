package Ooc;

import java.util.Scanner;

class Student{
    //data members
    private char studentId;
    private String studentName;
    int studentAge;
    Scanner scanner = new Scanner(System.in);

    //member function // this is method [accept Details()]
    void acceptDetails() {
		System.out.println("Enter the Student Id:");
		studentId = scanner.next().charAt(0);
		System.out.println("Enter Student Name:");
		studentName = scanner.next();
		System.out.println("Enter Student Age:");
		studentAge = scanner.nextInt();	
	}
	 void displayDetails(){
		System.out.println("Student Id :"+studentId);
		System.out.println("Student Name:"+studentName);
		System.out.println("Student Age:"+studentAge);
	}
}
public class accessmodifiers {
	public static void main(String[]args) {
		//creating the object of Class students
		Student student= new Student();
		student.acceptDetails();
		student.displayDetails();
		
		//if more than one object
		Student student1= new Student();
		student1.acceptDetails();
		student1.displayDetails();
		
		System.out.println(student.studentAge);
		
	}

}