package Ooc;

class person{
    private String firstname;
    private String lastname;
    public String getfirstname(){
        return this.firstname;
    }
    public void setfirstname(Sring firstname){
        this.firstname=firstname;
    }
    public string getlastname(){
        return this.lastname;
    }
    public void setlastname(String lastname){
        this.lastname = lastname;
    }
}
public class gettersandsetters {
    public static void main(String[] args) {
        Person person = new Person();
        person.setfirstname("King");
        System.out.println(person.getfirstname());
        person.setlast("Tenneti");
        System.out.println(person.getlastname());
    }
}