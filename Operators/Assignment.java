package Operators;

import java.util.Scanner;
public class Assignment{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Vlaue A : ");
        float a = scanner.nextFloat();
        System.out.print("Enter the value B : ");
        float b = scanner.nextFloat();
        int c=scanner.nextInt();
      
        System.out.println("a=b" + (a=b));
        a+=b;
        System.out.println("a+=b" +a);
        a-=b;
        System.out.println("a+=b" +a);

    }
}