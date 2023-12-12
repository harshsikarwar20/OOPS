public class copyConstructor {

    public static class student{
        String name;
        int age;
        student(String name ,int age){
            this.name = name;
            this.age = age;
        }
        // copy 
        student(student s1){
            this.name = s1.name;
            this.age = s1.age;
        }
        student(){
            
        }
    }
    public static void main(String[] args) {
        student obj1 = new student("Harsh", 22);
        student obj2 = new student(obj1);
        System.out.println(obj2.name);
        System.out.println(obj2.age);

        // Its types 
        // shallow copy and deep copy

        // it is used to copy the values of previous object to current object is know as copy constructor...........
    }
}