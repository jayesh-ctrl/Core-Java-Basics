// class StaticTest{
//     private static int numInstances = 0;
//     private String name;
//     public StaticTest(String name)
//     {
//         this.name = name;
//         numInstances++;
//     }

//     public static int getNumInstances(){
//         return numInstances;
//     }

//     public String getName()
//     {
//         return name;
//     }
// }
// final class A{
//     public final void display()
//     {
//         System.out.println("Base class");
//     }
// }
// class B extends A{
//     public void display1(){
//         System.out.println("Derived class");
//     }
// }
class SomeClass{
    public final int instanceNumber;
    private static int classCounter = 0;
    private final String name;
    public SomeClass(String name){
        this.name  = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name+" created, instance is "+instanceNumber);
        
    }
    public int getInstanceNumber()
    {
        return instanceNumber;
    }
}
public class Static1 {

    // public static int multiplier = 7;
    public static void main(String[] args) {
        
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());
        // StaticTest first = new StaticTest("1st Instnace");
        // System.out.println(first.getName()+" is instance number "+StaticTest.getNumInstances());

        // StaticTest second = new StaticTest("2nd Instance");
        // System.out.println(second.getName()+" is instance number "+StaticTest.getNumInstances());

        // StaticTest third = new StaticTest("3rd Instance");
        // System.out.println(third.getName()+" is instance number "+StaticTest.getNumInstances());

        // int answer = multiply(6);
        // System.out.println("The answer is "+answer);

        //  int a=5;
        // final int b=10;
        // a=30;
        // b=10;
        // System.out.println("a = "+a+" b = "+b);

        // B aa=new B();
        // aa.display();
    }

    // public static int multiply(int number)
    // {
    //     return number*multiplier;
    // }
}
