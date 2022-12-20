public class Casting{
    public static void main(String[] args)
    {
        //casting
        //implicit casting
        double price = 100.00;
        double finalPrice = price+18;
        System.out.println(finalPrice);

        // int p=100;
        // int fp = p+18.0;
        // System.out.println(fp); // error Casting.java:10: error: incompatible types: possible lossy conversion from double to int int fp = p+18.0;

        int p=100;
        int fp = p+(int)18.99;
        System.out.println(fp);

        //constants
        final float PI=3.14F;
        PI = 1.1F;  // error
        


    }
}