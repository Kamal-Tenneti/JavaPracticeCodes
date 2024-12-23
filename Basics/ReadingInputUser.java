package basics;

import java.util.Scanner;
public class ReadingInputUser {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		String name = scanner.nextLine();
		System.out.print("Enter Your Age : ");
		int age= scanner.nextInt();
		System.out.println("Enter Your Gender(M/F) :");
		char gender = scanner.next().charAt(0);
		System.out.println("Enter the contact Number:");
		double contact = scanner.nextDouble();
		
		
		System.out.println("User Details: ");
		System.out.println("User is : Mr."+ name);
		System.out.println("User Age is: "+ age);
		System.out.println("User Gender is: "+ gender);
		System.out.println("User Contact is: "+ contact);
		
	}

}
