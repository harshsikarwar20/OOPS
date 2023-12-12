public class StaticPrinting {
    static{
        System.out.println("Static Block");
    }
    public static void main(String[] args) {
       
        System.out.println("Main Function is getting run");
        Student s1 = new Student();
    }
}
class Student{
    int id;
    String name;

    static {
        System.out.println("Static block is getting Run");
    }
}