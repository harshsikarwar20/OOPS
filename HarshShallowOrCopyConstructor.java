public class HarshShallowOrCopyConstructor {
    public static void main(String[] args) {
        Tejasvi t = new Tejasvi("Harsh", "Male");
        
        Tejasvi t1 = new Tejasvi(t);
        System.out.println(t1.name);
        System.out.println(t1.gender);
        
    }
}
class Tejasvi{
    String name;
    String gender;
    
    Tejasvi(String name , String gender){
        this.name = name;
        this.gender = gender;
    }
    Tejasvi(Tejasvi t){
        this.name = t.name;
        this.gender = t.gender;
    }
    Tejasvi(){

    }
}