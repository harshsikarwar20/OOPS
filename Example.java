class User {
    String name = "Harsh" , rollNo;

    User(String rollNo){
        this.rollNo = rollNo;
    }

    public void bookShow(){
        System.out.println("Parent function...");
    }
}

class RegiUser extends User{
    String name = "Tejasvi";
    String phoneNo , address;
    RegiUser(String rollNo ,String phoneNo ,String address){
        super(rollNo);
        this.phoneNo = phoneNo;
        this.address = address;
    }
    public void bookShow(){
        System.out.println("Child function...");
    }
}
public class Example {
    public static void main(String[] args) {
        User u1 = new User("14");
        System.out.println();
        System.out.println(u1.name);
        System.out.println(u1.rollNo);

        RegiUser u2 = new RegiUser("14", "7999018195", "Aditya puram");
        System.out.println();
        System.out.println(u2.name);
        System.out.println(u2.rollNo);
        System.out.println(u2.phoneNo);
        System.out.println(u2.address);

        User u3 = new RegiUser("21", "84260254564", "gaanne ke joos ke pass");
        System.out.println();
        System.out.println(u3.name);
        System.out.println(u3.rollNo);
        // System.out.println(u3.phoneNo);
        // System.out.println(u3.address)
        System.out.println(((RegiUser)u3).phoneNo);
        System.out.println(((RegiUser)u3).address);
    }
}
// javac Example.java
// java Example