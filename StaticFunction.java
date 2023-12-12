//2. What happens if I make a funtion as Static
//We can call that function using classname even before creating the object of that class.

//Non-static-Funtion can call Static-funtion and non-static-funtion both.
//But Static-Funtion can call only Static-Funtions.
class Student{
    static String schoolName = "BSN";
    String name;
    int id;

    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    Student(){

    }

    static void staticFunction1(){
        System.out.println("this is a static function -1 ");
    }

    static void staticFunction2(){
        System.out.println("this is static function -2");
        Student.staticFunction1();
       // this.nonStaticFunction1();  //We can't do.
    }

    void nonStaticFunction1(){
        System.out.println("this is non static funtion -1 ");
    }

    void nonStaticFunction2(){
        System.out.println("this is non static function -2");
        this.nonStaticFunction1();
        Student.staticFunction1();
    }
}
public class StaticFunction {
    public static void main(String[] args) {
        // Student s1 = new Student("Harsh",1);
        // s1.staticFunction1();
        // s1.staticFunction2();
        // s1.nonStaticFunction1();
        // s1.nonStaticFunction2();
        
        // Student.staticFunction1();
        // Student.staticFunction2();
        ///Student.nonStaticFunction1();
    }
}