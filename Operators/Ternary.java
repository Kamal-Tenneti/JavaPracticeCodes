package Operators;
public class Ternary {
public static void main(String[] args) {
    boolean isAuthenticated =true;

    if(isAuthenticated)
    System.out.println("You are Logged in ");
    else
    System.out.println("Your are Not Logged in ");

    String result =(isAuthenticated)? "SuccessFully" : "Successful";
    System.out.println(result);
}
}