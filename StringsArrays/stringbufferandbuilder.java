package StringsArrays;

public class stringbufferandbuilder{
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello ");
        System.out.println(buffer.capacity());
        buffer.append("World");
        System.out.println(buffer);

        System.out.println("****************");
        StringBuilder Builder = new StringBuilder("Hello ");
        System.out.println(Builder.capacity());
        Builder.append("world");
        System.out.println(Builder);
    }
}