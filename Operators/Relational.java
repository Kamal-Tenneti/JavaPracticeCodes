package Operators;

import java.util.Scanner;

public class Relational{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the A Value : " );
        Float a=scanner.nextFloat();
        System.out.print("Enter the B Value : ");
        Float b=scanner.nextFloat();

        System.out.println("a>b"+(a>b));
        System.out.println("b>a"+(b>a));
        System.out.println("b>=a"+(b>=a));
        System.out.println("a>=b"+(a>=b));
        System.out.println("a==b"+(a==b));
        System.out.println("a!=b"+(a!=b));
        
    }
}