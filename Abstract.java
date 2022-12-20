abstract class Parent2{
    public Parent2()
    {
        System.out.println("Mai Base2 ka constructor hooon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning!!");
    }

    @Override
    public void greet2(){
        System.out.println("Good Afternoon!!");
    }
}

abstract class Child3 extends Parent2{
    public void th()
    {
        System.out.println("th() Method");
    }
}
public class Abstract{
    public static void main(String []args)
    {
        Child2 c=new Child2();

        // Parent2 p=new Parent2(); // error bcz we can not create object of abstract class
        // Child3 c3 = new Child3(); // error
        
    }
}