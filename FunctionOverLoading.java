public class FunctionOverLoading {

    public static int add(int a , int b){
        return a+b;
    }
    public static int add(int a , int b , int c){
        return a+b+c;
    }
    // for overloading no. of parameter should be different or data type of parameter should be different or order of parameter should be different
    // any one condition must be true------------------------------------------------------------------------
    
    // public static long add(long a , long b){
    //     return a+b;
    // }

    // in overloading return type does not matter it may be same or may not be -----------------------

    // public static long add(int a , int b){ // show an error------------
    //     return a+b;
    // }

    // public static void add(int a , String str){
    //     System.out.println(a+str); // 5harsh
    // }

    // public static void add(String str , int a){
    //     System.out.println(a+str); // Tejsavi6
    // }

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2 , 3));

    //     add(5,"harsh");
    //     add("Tejsavi",6);
    }
}