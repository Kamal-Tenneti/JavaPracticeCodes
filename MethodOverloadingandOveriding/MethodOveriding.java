package MethodOverloadingandOveriding;

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

class Employee extends Person {
    String designation;
    float salary;
    public Employee(String name, int age, String designation, float salary) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }
    public void print() {
        super.print();
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

public class MethodOveriding {
    public static void main(String[] args) {
        Employee employee = new Employee("Kamal", 22, "Dev", 500000);
        employee.print();
    }
}
