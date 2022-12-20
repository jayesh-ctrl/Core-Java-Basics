class ScopeCheck{
    private int varOne=1;
    public int publicVar=0;

    public ScopeCheck()
    {
        System.out.println("Scope checked created, publicVar = "+publicVar+" : privateVar = "+varOne);
    }
    public int getPrivateVar()
    {
        return varOne;
    }

    public void timesTwo(){
        int privateVar=2;
        for(int i=0;i<10;i++)
        {
            System.out.println(i+" times two is "+i*this.varOne);
        }

    }

    public class InnerClass{
        // public int privateVar = 3;

        public InnerClass(){
            System.out.println("Inner Class created, privateVar is "+varOne);
        }

        public void timesTwo()
        {
            ScopeCheck.this.timesTwo();
            // int privateVar=2;
            for(int i=0;i<10;i++)
            {
                System.out.println(i+" times two is "+i*ScopeCheck.this.varOne);
            }
        }
    }
}

public class Scope1 {
    public static void main(String[] args) {
        String privateVar = "this is private to main()";

        ScopeCheck scopInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is "+scopInstance.getPrivateVar());
        System.out.println(privateVar);

        // scopInstance.timesTwo();

        ScopeCheck.InnerClass obj = scopInstance.new InnerClass();
        obj.timesTwo();
    }
}
