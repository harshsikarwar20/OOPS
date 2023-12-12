public class polymorphism {

    public static class Harsh{
        int age;
        String gender;
        void sum(){
            System.out.println("overloading0");
        }
        void sum(int a){
            System.out.println("overloading1");
        }
    }
    public static class tejsavi extends Harsh{
        int phoneNumber;
        String address;
        @Override
        void sum(){
            System.out.println("overriding");
        }
        // overriding mein return type fuction name and no.of parameters must be same......
        // in overloading return type does not matter...........
        // Constructor never override.................
    }
    public static void main(String[] args) {
        Harsh h = new Harsh();
        h.sum(2);

        tejsavi T = new tejsavi(); // compile time binding.......................
        T.sum();

        //  overriding

        Harsh h1 = new tejsavi(); // runtime binding........................
        h1.sum();

        // compiler is looking towards harsh but the object is created of tejasvi...............
        System.out.println(h1.age);
        // System.out.println(h1.phoneNumber);

    }   
}
