class Ekclass{
    int a;
    Ekclass(int a)
    {
        this.a=a;
    }
    public int returnone()
    {
        return 1;
    }
    public int getA()
    {
        return a;
    }
}
class DoClass extends Ekclass
{
    DoClass(int c)
    {
        super(c);
        System.out.println("Mai ek constructor hoon");
    }
}
public class This_key{
    public static void main(String []args)
    {
        // Ekclass e=new Ekclass(5);
        DoClass d=new DoClass(65);
        System.out.println(d.getA());
    }
}