class Base1{
    int x;
    Base1()
    {
        System.out.println("Me Ek constructor hoon");
    }

    Base1(int a)
    {
        System.out.println("I am constructor with value a as " + a);
    }
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
class Derived1 extends Base1{
    public int y;

    Derived1()
    {
        super(0);
        System.out.println("I am constructor of derived class");
    }
    Derived1(int a,int b)
    {
        super(a);
        System.out.println("I am constructor with value b as "+b);
    }
    public int getY()
    {
        return y;
    }
    
    public void setX(int y)
    {
        // System.out.println("I am in base and  setting x now");
        this.y = y;
    }
}

class ChildOfDerived extends Derived1
{
    ChildOfDerived(){
        System.out.println("This is child of derived");
    }
    ChildOfDerived(int x,int y,int z)
    {
        super(x,y);
        System.out.println("I am constructor with value z as " + z);
    }
}
public class Inheritance1{
    public static void main(String []args)
    {
        // Base1 b=new Base1();

        // Derived1 d=new Derived1();
        // Derived1 d=new Derived1(4,6);

        ChildOfDerived cd = new ChildOfDerived(4,6,8);
    }
}