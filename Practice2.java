class VipPerson{
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipPerson()
    {
        this("Default Name",50000.00,"default@email.com");
    }
    public VipPerson(String name,double creditLimit)
    {
        this(name,creditLimit,"unknown@email.com");
        // this.name = name;
        // this.creditLimit = creditLimit;
    }
    public VipPerson(String name,double creditLimit,String emailAddress)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public String getName(){
        return name;
    }
    public double getCreditLimit(){
        return creditLimit;
    }
    public String getEmailAddress()
    {
        return emailAddress;
    }
}

public class Practice2{
    public static void main(String []args)
    {
        VipPerson person1=new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2=new VipPerson("Bob",25000.00);
        System.out.println(person2.getName());

        VipPerson person3=new VipPerson("Tim",100.00,"tim@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}