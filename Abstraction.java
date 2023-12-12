abstract class weatherApi{
    public abstract String getTemp(String city);

    public abstract String getHumidity(String city);

    public abstract int sum(int a , int b);
}

class weather extends weatherApi{
    @Override
    public String getTemp(String city){
        return "30 Degree";
    }
    @Override  // it is written to confirm that it is overriding or not...........
    public String getHumidity(String city){
        return "40 Degree";
    }
    public int sum(int a, int b){
        return a+b+b+a+b;
    }
}

public class Abstraction {
    public static void main(String[] args) {

        // ----> Important points to remember--------------------------------------

        /* Abstraction -: Data Abstraction is process of hiding certain details and showing essential information to the user.
        --> It can be obtained with either abstract class or interface. 
        --> Intantiation (object creation) of abstarct class is not possible.
        --> Abstarct class can have zero abstract function to 100% abstract function.
        --> Abstarct class is more genric class where as concrete class is more specific class.
        --> concrete class depends upon abstract class.
        */

        weatherApi ob = new weather();
        System.out.println(ob.getHumidity("Gwalior"));

        System.out.println(ob.sum(1, 2));
    }
}