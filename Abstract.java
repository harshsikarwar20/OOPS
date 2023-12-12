//  kya hum abstract class me properties de sakte hai??????????????????

abstract class GoogleMapApi{
    int latitude;
    int longitude;

    GoogleMapApi(){
        this.latitude = 0;
        this.longitude = 1;
    }
    GoogleMapApi(int latitude , int longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public String getLocation(){
        return "delhi";
    }
    public String getDistance(String city1 , String city2){
        return "90kms";
    }
}
class GoogleMap extends GoogleMapApi{
    GoogleMap(int latitude , int longitude){
        super(latitude, longitude);
    }
}

public class Abstract {
    public static void main(String[] args) {
        // GoogleMapApi gm = new GoogleMapApi(); 
        // It will show error because it is abstract class because directly we are creating object which is not pos
         

        GoogleMapApi gm = new GoogleMap(1 , 2);
        System.out.println(gm.latitude);
    }
}

// Q --> can we achieve multiple inheritance using abstract class??
// Ans --> No.....

// --> Topics left--------------------------------------------------------------------

// final
// Inheritance all types implement
// static
// Deep copy constructor
