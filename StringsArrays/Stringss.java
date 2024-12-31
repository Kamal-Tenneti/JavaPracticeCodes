package StringsArrays;

public class Stringss{
    public static void main(String[] args) {
        //String Literteral
        String str1= "Hello ";
        System.out.println(str1);

        //String Object
        String str2 = new String("World");
        System.out.println(str2);

        //Concatination of Strings and object literals
        String str3= str1 +str2;
        System.out.println(str3);

        System.out.println(str3.length());
        System.out.println(str3.charAt(0));
        System.out.println(str3.concat(str2));
        System.out.println(str3.substring(0,4));
        System.out.println(str3.equals(str2));
        System.out.println(str3.compareTo("Hello"));
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());
        System.out.println(str3.trim());
        System.out.println(str2.replace(str2, "Kamal"));
        
    }
}