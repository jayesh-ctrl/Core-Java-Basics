interface Bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBiCycle{
    int a=45;
    void blowHornK3G();
    void blowHornmhn();
}

class AvonCycle implements Bicycle,HornBiCycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo POO");
    }
    public void applyBrake(int decrement)
    {
        System.out.println("Apply Brake");
    }
    public void speedUp(int increment)
    {
        System.out.println("Apply Speed Up");
    }

    public void blowHornK3G()
    {
        System.out.println("blowHornK3G");
    }
    public void blowHornmhn()
    {
        System.out.println("blowHornmhn");
    }
}
public class Interface1{
    public static void main(String []args)
    {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(2);
        //you can create properties in Interfaces
        // System.out.println(cycleHarry.a);
        
        // you can not modify the value of properties because they are final
        // cycleHarry.a = 67; // error 
        // System.out.println(cycleHarry.a);


        cycleHarry.blowHornK3G();
        cycleHarry.blowHornmhn();
    }
}