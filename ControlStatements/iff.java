package ControlStatements;

import java.util.Scanner;
public class iff {
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Your GPA : ");
    Float A=scanner.nextFloat();
    System.out.println("*****************");
    if(A>=7.1)
        System.out.println("First Class ");
    if(A>=6.5 & A<=7.1)
        System.out.println("Second Class");
    else{
        if(A<6.5)
            System.out.println("Sorry You are Failed");
        else
            System.out.println("Congradulations You Have Secured Your Degree ");
        }
    
    }

}