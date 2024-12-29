package LoopConstructs;

import java.util.Scanner;
public class whileloop{
    public static void main(String[] args) {
        //Declaring the while loop
        //int i=1;
        //while(i<=10){
          //  System.out.println("Hello World");
            //i++;

        Scanner scanner= new Scanner(System.in);
        String input="";
        while(!input.equals("quit")){
            System.out.println("Enter Message: ");
            input = scanner.nextLine().toLowerCase();
            System.out.println(input);
        }
    }
}