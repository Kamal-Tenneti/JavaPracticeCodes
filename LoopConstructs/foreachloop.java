package LoopConstructs;

public class foreach{
    public static void main(String[] args){
        String names[]= {"King","Queen","Joker","Solder"};
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        } 
        for(String name : names){
            System.out.println(name);
        }
    }
}