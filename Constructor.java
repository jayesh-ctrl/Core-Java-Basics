class Student
{
    int id;
    String name;
    // public Student()
    // {
    //     id = 12;
    //     name = "Jayesh";
    // }

    public Student(String myname)
    {
        id = 12;
        name = myname;
    }
}
public class Constructor
{
    public static void main(String []args)
    {
        Student std = new Student("Mahesh");
        System.out.println(std.id);
        System.out.println(std.name);
    }
}