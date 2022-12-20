class Circle{
    public int radius;
    Circle()
    {
        System.out.println("Circle non param constructor");
    }
    Circle(int radius)
    {
        System.out.println("I am circle parameterized constructor");
        this.radius = radius;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }

}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r,int h)
    {
        super(r);
        height = h;
        System.out.println("Cylinder parameterized constructor");
    }
    public double volume()
    {
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class Practice_set1{
    public static void main(String []args)
    {
        //Problem 1;
        // Circle c=new Circle(12);
        Cylinder obj = new Cylinder(12,4);
    }
}