import java.util.*;

// class Student{
//     String name;
//     int id;
//     static ArrayList<String> subjects;
//     static{
//         subjects = new ArrayList<>();
//         subjects.add("Hindi");
//     }

//     static HashMap<String,Integer> map;
//     static {
//        map = new HashMap<>();
//        map.put("Harsh",87886); 
//     }
// }

class ipl {
    static HashMap<String,Integer> map;

    static {
        map = new HashMap<>();
        map.put("RCB",0);
        map.put("DC",0);
        map.put("MI",0);
        map.put("GT",0);
        map.put("CSK",0);
    }

    ipl(String team) {
        int count = map.get(team)+1;
        map.put(team,count);
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        //System.out.println( Student.subjects);
        //System.out.println(ipl.map);
 
        ipl t1 = new ipl("RCB");
        
        ipl t2 = new ipl("MI");
        ipl t3 = new ipl("GT");
        ipl t4 = new ipl("RCB");
        ipl t5 = new ipl("MI");
 
        System.out.println(ipl.map);
 
     }
}
