package ControlStatements;

import java.util.Scanner;
public class ladder{
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the Selling Price: ");
        Float A=scanner.nextFloat();
        System.out.print("Enter the Cost Price: ");
        Float B=scanner.nextFloat();
        
        if(A>B)
            System.out.println("Profit");
        if(B>A)
            System.out.println("Loss");
        else if(A==B)
            System.out.println("Margin");
        else{
            if(A<=B)
                System.out.print("There is Loss ");
            else
                System.out.println("Got Extra Price");
        }
    }
}