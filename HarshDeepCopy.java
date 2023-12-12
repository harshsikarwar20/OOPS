import java.util.*;

public class HarshDeepCopy {

    public static class Student{
        String name;
        int age;

        ArrayList<String> subjects;

        Student(String name , int age){
            this.name = name;
            this.age = age;
            this.subjects = new ArrayList<>();
        }

        Student(Student s1){
            this.name = s1.name;
            this.age = s1.age;
            this.subjects = s1.subjects;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Harsh" , 23);
        
        s1.subjects.add("English");
        s1.subjects.add("Hindi");
        s1.subjects.add("Maths");
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.subjects);
        
        s2.subjects.add("java");
        System.out.println(s2.subjects);
        System.out.println(s1.subjects);

        s1.subjects.add("c++");
        System.out.println(s2.subjects);
        System.out.println(s1.subjects);
    }
}
// javac HarshDeepCopy.java
// java HarshDeepCopy