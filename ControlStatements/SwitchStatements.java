package ControlStatements;

import java.util.Scanner;
public class SwitchStatements{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("admin-Gets full accsess");
		System.out.println("subadmin-Gets semi");
		System.out.println("testprep-Gets access");
		System.out.println("User-Gets access to consumer");
		System.out.print("Enter Your Choice: ");
        String user =scanner.nextLine();

        switch(user){
            case "admin":
            System.out.println("Gets Full Access");
            break;
            case "subadmin":
            System.out.println("Gets semi Access");
            break;
            case "testprep":
            System.out.println("Gets Full Guide");
            break;
            case "user":
            System.out.println("Gets Entry Access");
            break;
            default:
            System.out.println("Access Denied");
            break;
        }
    }
}
