package Inheritence;

class Vehicle{
	void drive() {
		System.out.println("Driving a vehicle");
	}
}

class Car extends Vehicle{
	void drive() {
		System.out.println("Driving a car");
	}
	void speedUp() {
		System.out.println("Speed Up a car");
	}
	
}

public class UpcastinandandDowncasting {
	public static void main(String[] args) {
		
		//upcasting
		//Vehicle vehicle = new Car();
		//vehicle.drive();
		
		// Downcasting
		Vehicle vehicle=new Car();
		Car car=(Car) vehicle;
		car.drive();
		car.speedUp();
	}

}
