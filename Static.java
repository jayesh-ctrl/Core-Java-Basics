class Dog{
    private static String name;
    public Dog(String name)
    {
        Dog.name = name;
    }
    public void printName()
    {
        System.out.println("Name = "+name);
    }
}


public class Static{
    public static void main(String []args)
    {
        Dog rex=new Dog("rex");
        Dog tommy = new Dog("Tommy");
        rex.printName();
        tommy.printName();
    }
}