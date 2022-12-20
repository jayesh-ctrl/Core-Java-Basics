
interface Camera{
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
interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
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

class  MySmartPhone extends MyCellPhone implements Wifi,Camera{
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
public class Interface2{
    public static void main(String []args)
    {
        MySmartPhone ms=new MySmartPhone();
        String []array = ms.getNetworks();
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }

        ms.record4KVideo();
    }
}