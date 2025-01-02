package Constructors;

class Students {
	//Data members
	private int studentId;
	private String studentName;
	private int studentAge;
    
	public Students() {
		this.studentId=100;
		this.studentName="Kamal";
		this.studentAge=22;
	}
	
	public Students(int sId,String sName,int sAge) {
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

public class Parameterized {
    public static void main(String[] args) {
		//creating the object of Class students
		Students student= new Students();

		student.displayDetails();
		
		//if more than one object
		Students student1= new Students(101,"Aditya",21);
	
		student1.displayDetails();
    }
		
}
