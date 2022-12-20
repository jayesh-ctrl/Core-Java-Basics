class Base{
    int x;
    
    public int getX()
    {
        return x;
    }
    
    public void setX(int x)
    {
        System.out.println("I am in base and  setting x now");
        this.x = x;
    }
    public void printMe()
    {
        System.out.println("I am Constructor");
    }
}
class Derived extends Base{

    int y;
    
    public int getY()
    {
        return y;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }

}
public class Inheritance{
    public static void main(String []args)
    {
        //creating an object of base class
        Base b=new Base();
        b.setX(4);
        System.out.println(b.getX());

        //creating an object of derived class
        Derived d=new Derived();
        d.setY(42);
        System.out.println(d.getY());
    }
}