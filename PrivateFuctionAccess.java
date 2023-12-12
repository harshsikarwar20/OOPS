class Harsh{
    private void function(){
        System.out.println("Harsh");
    }
    public void function2(){
        function();
    }
}
public class PrivateFuctionAccess {
    public static void main(String[] args) {
        Harsh h = new Harsh();
        h.function2();

        //  Tejsavi mam is brand--------------------------------------
    }
}