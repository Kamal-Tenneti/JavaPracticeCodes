package Constructors;

class Studentsss{
    //Data Members
    public int studentId;
    public String studentName;
    public int studentAge;

    public Studentsss(){
        this(102,"Karthik",23);
        this.studentId=100;
        this.studentName="Kamal";
        this.studentAge=22;
    }
    public Studentsss(int studentId,String studentName,int stuedntAge){
        this(103,"Kalyan",23);
        this.studentId=100;
        this.studentName="Kamal";
        this.studentAge=22;

    public Studentsss(int sId,String sName,int sAge){
        this.studentId=sId;
        this.studentName=sName;
        this.studentAge=sAge;
    }
    void displayDetails(){
		System.out.println("Student Id :"+studentId);
		System.out.println("Student Name:"+studentName);
		System.out.println("Student Age:"+studentAge);
	}
}

public class ConstructorChaining {
    public static void main(String[]args) {
		//creating the object of Class students
		Studentsss student= new Studentsss();

		student.displayDetails();
		
		//if more than one object
		Studentsss student1= new Studentsss(101,"Aditya",21);
	
		student1.displayDetails();
		
		
	}
    
}
