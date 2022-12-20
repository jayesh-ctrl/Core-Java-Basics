class Phone{
    public void greet()
    {
        System.out.println("Good Morning");
    }
    public void name()
    {
        System.out.println("Phone");
    }
}
class SmartPhone extends Phone{
    public void swagat()
    {
        System.out.println("Aapka swagat hai");
    }
    public void name()
    {
        System.out.println("Smart Phone");
    }
}
public class Dynamic_method
{
    public static void main(String []args)
    {
        // Phone obj = new Phone();
        // SmartPhone smobj = new SmartPhone();
        // obj.name();

          Phone obj = new SmartPhone(); // it is allowed;
        //   SmartPhone obj1 = new Phone(); // Error // not allowed
            obj.greet();
            obj.name();
            // obj.swagat(); // Not allowed
    }
}