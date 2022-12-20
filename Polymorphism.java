
interface Camera1{
    void takeSnap();
    void recordVideo();
    private void greet()
    {
        System.out.println("Good Morning!!...");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Record 4K Video");
    }
}
interface Wifi1{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone1{
    void callNumber(int phoneNumber){
        System.out.println("Calling Number " + phoneNumber);
    }

    void pickCall()
    {
        System.out.println("Connecting...");
    }
    // void takeSnap(){
    //     System.out.println("Taking Snap");
    // }
}

class  MySmartPhone1 extends MyCellPhone1 implements Wifi1,Camera1{
    public void takeSnap()
    {
        System.out.println("Taking Snap");
    }
    public void recordVideo()
    {
        System.out.println("Record Video");
    }

    public String[] getNetworks()
    {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry","Jayesh","Abd"};
        return networkList;
    }
    public void connectToNetwork(String network)
    {
        System.out.println("Connecting to "+network);
    }
}
public class Polymorphism{
    public static void main(String []args)
    {
        Camera1 cam1=new MySmartPhone1();  // this is a smartphone but use it as camera

        // cam1.getNetworks()  // not allowed
        cam1.record4KVideo();

        // cam1.connectToNetwork("broadband"); // not allowed

        MySmartPhone1 sm1 = new MySmartPhone1();
        sm1.pickCall();
        sm1.recordVideo();
        sm1.callNumber(70730);
    }
}