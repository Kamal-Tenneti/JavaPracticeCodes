package StringsArrays;

public class MDarray{
    public static void main(String[] args) {
        float marks[][]={
            {1.5F,2.3F,3.9F},
            {4.0F,5.1F,6.9F},
            {7.5F,8.3F,9.2F}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(marks[i][j] +"\t");
            }
            System.out.println();
        }
    }
}