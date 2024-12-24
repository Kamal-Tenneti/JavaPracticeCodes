package Operators;

import java.util.Scanner;
public class Arthematics{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        float a = scanner.nextFloat();
        System.out.print("Enter the value of B: ");
        float b = scanner.nextFloat();
        System.out.println("Addition = "+(a + b));
        System.out.println("Subraction = "+(a - b));
        System.out.println("Multiplication = "+(a * b));
        System.out.println("Division = "+(a / b));
        System.out.println("Remainder = "+(a % b));

        System.out.println(" + Post incre= "+(a++));
        System.out.println(" + Pre incre= "+(++a));

        System.out.println(" - Post incre= "+(a--));
        System.out.println(" - Post incre= "+(--a));       
    }
}