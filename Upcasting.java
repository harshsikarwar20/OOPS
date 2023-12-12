public class Upcasting {

    public static class Harsh{
        int a , b;
        Harsh(int a , int b){
            this.a = a;
            this.b = b;
        }
    }
    public static void main(String[] args) {
        // this is upcasting because character can be converted to integer because character is smaller than integer......
        // by default java can perform upcasting 
        // 
        Harsh h = new Harsh('a','b');
        System.out.println(h.a);

        long c = 10;
        long d = 20;
        Harsh h1 = new Harsh((int)c,(int)d); // because long can't be coverted to int 
        System.out.println(h1.a);
    }
}
