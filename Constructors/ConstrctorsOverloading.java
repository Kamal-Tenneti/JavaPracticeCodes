package Constructors;

class Studentss{
    //Data members
    private int studentId;
    private String studentName;
    private int studentAge;

    public Studentss(){
        this.studentId=100;
        this.studentName="kamal";
        this.studentAge=22;
    }
    public Studentss(int sId,String sName,int sAge){
        this.studentId=sId;
        this.studentName=sName;
        this.studentAge=sAge;

    }
    void displayDetails(){
        System.out.println("Studnt ID:"+studentId);
        System.out.println("Student Name:"+studentName);
        System.out.println("Student Age:"+studentAge);
    }
}

public class ConstrctorsOverloading {
    public static void main(String[] args) {
        Studentss student= new Studentss();

        student.displayDetails();
    }
    
}
