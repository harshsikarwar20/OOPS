import java.util.*;
class Rani {
    static {
        System.out.println("Static function");
    }
    static HashMap<String,Integer> ipl = new HashMap<>();
    static{
        ipl.put("csk" , 0);
        ipl.put("DC"  , 0);
    }
}

// i need to revise this ...........................................!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!???????????????
public class ConstructorOverriding {

    public static class Tejsavi{
        final int[] arr;
        Tejsavi(){
            arr = new int[2];
        }
        // arr[0] = 1;
        // arr[1] = 2;
    }
    public static void main(String[] args) {
        // Harsh h = new Harsh();
        // Tejsavi T = new Tejsavi();
        // T.arr[0] = 5;
        // T.arr[1] = 6;
        // Rani r = new Rani();
        System.out.println(Rani.ipl);
        System.out.println("main function");
        // r.function();
        // T.arr = new int[2];
    }
}