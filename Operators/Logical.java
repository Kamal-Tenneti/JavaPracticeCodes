package Operators;

import java.util.Scanner;

public class Logical{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the X value: ");
        boolean x=scanner.nextBoolean();
        System.out.print("Enter the Y value: ");
        boolean y=scanner.nextBoolean();

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
    }
}