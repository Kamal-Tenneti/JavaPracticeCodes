package StringsArrays;


public class SDarray{
    public static void main(String[]args){
        //Declaring the arrays
        /*int[] marks;
        marks = new int[5];*/
        //or
        //int[] marks = new int[5];

        //Initialization of the array
        //int[] marks=new int[] {10,20,30,40, };
        
        //Declaring and Assigning the values
        int[] marks = new int[5];
        marks[0]=100;
        marks[1]=99;
        marks[2]=98;
        marks[3]=97;
        marks[4]=96;
        //for loop
        for(int i =0; i<=marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("********************");
        //This is for each loop
        for(int value :marks){
            System.out.println(value);
        }
    }
}