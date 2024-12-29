package LoopConstructs;

import java.util.Scanner;

public class fizzbuzz{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float number = scanner.nextFloat();

        for(float i=1;i<=number;i++){
            if(i%5==0 && i%3==0)
                System.out.println("FizzBuzz");
            else if(i%5==0)
                System.out.println("Buzz ");
            else if(i%3==0)
                System.out.println("Fizz ");
            else
                System.out.println(i+" ");
        }
    }
}