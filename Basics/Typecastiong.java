package basics;

public class Typecasting {

    public static void main(String[]args) {
    	
    	// implicit  
    	int intvalue =100;
    	long longvalue =(long)intvalue;
    	double doublevalue=longvalue;
    	
    	System.out.println(intvalue);
    	System.out.println(longvalue);
    	System.out.println(doublevalue);
    	/*
    	//Explicit
    	double doublevalue=100.56;
    	
    	int intvalue=(int)doublevalue;
    	
    	byte bytevalue = (byte)intvalue;
    	
    	System.out.println(doublevalue);
    	System.out.println(intvalue);
    	System.out.println(bytevalue);
    	*/
    }
}
