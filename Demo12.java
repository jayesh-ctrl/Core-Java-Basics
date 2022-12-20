import java.util.*;

class Dog{
    protected final String name;

    public Dog(String name)
    {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public final boolean equals(Object obj)
    {
        if(this == obj) return true;

        if(obj instanceof Dog)
        {
            String objName = ((Dog) obj).getName();
            return this.name.equals(objName);

        }
        return false;
    }
}

class Labrador extends Dog{
    public Labrador(String name)
    {
        super(name);
    }

    // public boolean equals(Object obj)
    // {
    //     if(this == obj) return true;

    //     if(obj instanceof Labrador)
    //     {
    //         String objName = ((Labrador) obj).getName();
    //         return this.name.equals(objName);

    //     }
    //     return false;
    // }
}

public class Demo12{
    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));
    }
}