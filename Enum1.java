import java.util.*;

// interface MobileCompany{
//     static String APPLE = "Apple";
//     static String SAMSUNG = "Samsung";
// }


enum Mobile{
    APPLE(100),SAMSUNG,HTC(90);

    int price;

    Mobile(){
        price = 80;
    }

    Mobile(int x)
    {
        price = x;

    }

    public int getPrice(){
        return price;
    }
}
// class Mobile{
//     static final Mobile APPLE = new Mobile();
//     static final Mobile SAMSUNG = new Mobile();
//     static final Mobile HTC = new Mobile();
// }
public class Enum1 {
    public static void main(String[] args) {
        // System.out.println(Mobile.APPLE);
        // Mobile m = Mobile.APPLE;

        // switch(m){
        //     case APPLE:
        //         System.out.println("Apple is best");
        //         break;

        //     case SAMSUNG:
        //         System.out.println("1st copy of Apple");
        //         break;
            
        //     case JAYESH:
        //         System.out.println("");
        // }
            System.out.println(Mobile.APPLE.getPrice());
            System.out.println(Mobile.SAMSUNG.getPrice());
            System.out.println(Mobile.HTC.getPrice());

            System.out.println(Mobile.HTC.ordinal());


            Mobile m[]=Mobile.values();
            for(Mobile mobile : m){
                System.out.println(mobile);
            }


    }
}
