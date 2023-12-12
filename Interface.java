        // kisi bhi method ko hum agar "final" bana dete hai to hum usse override nhii kr sakte.......................
        /* abstract fuction ko hum final nhii bana sakte..........because kuki static keyword se bho
           compile time pr bind ho jaega toh is case me hum usko override nhii kr sakte because override is dynamic binding........... */

        // kisi bhi private abstract function ko hum nhii bana sakte...................
        
        /*  100% Abstraction will be their thats why no need of writing abstract before function !!!!!!!!!!!!!!!!!!!!!!!!!!!??????

        --> what is interface --> blueprint of a class is called interface , where class is the blueprint of object.
        --> object --> class --> interface (blueprint of each other).
        --> in interface there is no constructor.
        --> Inteface will not have any instance variable or we can properties.
        --> we cannot create object of interface.
        
         */

         // what is the default state of the methods in an interface?
         // public , abstract


interface ICamera{
    public void clickPic();
    public void open();
}

interface Icall{
    public void call();
    public void open();
}

class MobilePhone implements ICamera , Icall {
    @Override
    public void call(){
        System.out.println("Harsh");
    }
    public void clickPic(){
        System.out.println("tejasvi");
    }
    public void open(){
        System.out.println("ravi");
    }
}

public class Interface {
    public static void main(String[] args) {

        // ICamera p = new ICamera();
        ICamera p1 = new MobilePhone();
        p1.clickPic();
        p1.open();
        // p1.call();

        Icall p2 = new MobilePhone();
        p2.call();
        p2.open();

        MobilePhone p3 = new MobilePhone();
        p3.clickPic();
        p3.open();
        p3.call();
    }
}