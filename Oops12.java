
class Employee{
        int id;
        int salary;
        String name;
        public void printDetails()
        {
            System.out.println("My id is " + id);
            System.out.println("My Name is "+ name);
        }
        public int getSalary()
        {
            return salary;
        }
}
public class Oops12{
    public static void main(String []args)
    {
        System.out.println("This is custom class");
        Employee obj = new Employee(); // instantiating a new Employee Object
        Employee obj1 = new Employee();
        // setting attributes
        obj.id = 12;
        obj.name = "Jayesh";
        obj.salary = 400;

        obj1.id = 13;
        obj1.name = "John";
        obj1.salary = 500;
        //printing the attributes
        // System.out.println(obj.id);
        // System.out.println(obj.name);
         
        obj.printDetails();
        obj1.printDetails();

        int salary = obj1.getSalary();
        System.out.println(salary);
    }
}