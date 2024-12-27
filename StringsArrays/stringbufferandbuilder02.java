package StringsArrays;

public class stringbufferandbuilder02{
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Hello ");
        System.out.println(buffer.capacity());
        for(int i=0;i<1000;i++){
            buffer.append("World");
        }
        System.out.println("Time Taken: "+(System.currentTimeMillis()-startTime)+" in ms");
    }
}