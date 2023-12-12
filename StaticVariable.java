//1. What happens if we make any data member Static
//Then its not a Objects property(data member), its a class property.
//The static variable  is commmon for all the objects of that class.
//Changes made by any object to static varible will we reflcted for every Object.
//We can call static variable using class name.
//We can call static variable even before creating the object of that class using class name.
//Static variable get Initialise at Compile time only.
class Student{
    int id; //0
    String name; //null
    static int noOfStudents; //0

    Student(){

    }
    Student(int id, String name){
        this.id = id;
        this.name = name;
        this.noOfStudents++;
    }
    
    void print(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.noOfStudents);
    }
}
class Bollywood{
    static int noOfMovies;
    static String language = "Hindi";
    String name;

    public Bollywood(String name) {
        this.name = name;
        
    }

    public void print(){
        System.out.println(++Bollywood.noOfMovies);
        System.out.println(Bollywood.language);
        System.out.println(this.name);
        System.out.println();
        System.out.println(10/0);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        //System.out.println(Bollywood.language);   //hindi
        Bollywood m1 = new Bollywood("Golmaal");
        m1.print(); //1

        Bollywood m2 = new Bollywood("Golmaal 2");
        m2.print();

        Bollywood m3 = new Bollywood("Golmaal 3");
        m3.print();

        System.out.println(m1.noOfMovies);  //3
        System.out.println(m2.noOfMovies);  //3
        
        // Student s1 = new Student(1, "Harsh");
        // s1.print();

        // Student s2 = new Student(2,"Tejasvi");
        // s2.print();

        // System.out.println(Student.noOfStudents); //calling the static variable using class name;
        // System.out.println(name);
        // System.out.println(Student.name);
        // System.out.println(id);
        // System.out.println(Student.id);
        // System.out.println(noOfStudents);
        //System.out.println(Student.noOfStudents);  //0
    }    
}