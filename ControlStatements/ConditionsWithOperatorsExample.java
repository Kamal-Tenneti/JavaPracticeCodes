package ControlStatements;

import java.util.Scanner;

public class ConditionsWithOperatorsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Your MailID: ");
        String A = scanner.next();
        
        System.out.print("Enter Your ID.NO: ");
        String B = scanner.next();
        
        System.out.print("Enter Your Password: ");
        float C = scanner.nextFloat();
        
        if (A.equals("20eg103254@anurag.edu.in") && B.equals("20eg103254") && C == 12345) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }
}
