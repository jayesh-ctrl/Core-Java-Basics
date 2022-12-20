class A{
    private static final int key=748576362;
    private final int encryptedPaasword;

    public A(int password)
    {
        this.encryptedPaasword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password)
    {
        return password ^ key;
    }

    public void storePassword()
    {
        System.out.println("Saving password as "+this.encryptedPaasword);
    }
    public boolean letMeIn(int password)
    {
        if(encryptDecrypt(password)==this.encryptedPaasword)
        {
            System.out.println("Welcome");
            return true;
        }
        else{
            System.out.println("Nope, you can not come in");
            return false;
        }
    }
}
class ExtendedPassword extends A{
    private int decryptedPassword;
    public ExtendedPassword(int password)
    {
        super(password);
        this.decryptedPassword = password;
    }

    public void storePassword()
    {
        System.out.println("Saving Password as "+this.decryptedPassword);
    }
}

class SIBTest{

    public static final String owner;

    static{
        owner = "tim";
        System.out.println("SIB Static initialization Block");
    }

    public SIBTest(){
        System.out.println("SIB constructor called");
    }

    static{
        System.out.println("2nd initialization Block called");
    }


    public void someMethod(){
        System.out.println("someMethod called");
    }

}   


public class Password {
    public static void main(String[] args) {
        // int pw = 674312;

        // A password = new ExtendedPassword(pw);
        // password.storePassword();
        // password.letMeIn(1);
        // password.letMeIn(52322323);
        // password.letMeIn(0);
        // password.letMeIn(674312);

        System.out.println("Main Method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is "+SIBTest.owner);
    }
}
