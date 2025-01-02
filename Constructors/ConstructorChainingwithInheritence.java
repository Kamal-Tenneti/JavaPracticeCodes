package Constructors;

class Person{
	String name;
	public Person() {
		System.out.println("Person Class Constructor Invoked.");
		name="King of Kotha";
	}
	public Person(String name) {
		System.out.println("Person Class Parameterized Constructor Invoked");
		this.name=name;
	}
}
class Employee extends Person{
	String designation;
	public Employee() {
		System.out.println("Employee Class Constructor Invoked.");
		designation="Don";
	}
	public Employee(String designation) {
		super("Karthik");
		System.out.println("Employee Class Parameterized Constructor Invoked");
		this.designation=designation;
	}
}

public class ConstructorChainingwithInheritence {
	public static void main(String[]args) {
		
		Employee employee= new Employee();
		System.out.println(""+employee);
		
		Employee employee01= new Employee("Senior Manager");
	}

}