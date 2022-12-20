class MyEmployee{
    private int id;
    private String name;

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        this.name = n;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int i)
    {
        id = i;
    }
}

public class Oops13
{
    public static void main(String []args)
    {
        MyEmployee obj = new MyEmployee();
        obj.setName("Jayesh");
        System.out.println(obj.getName());
    }
}