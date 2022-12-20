import java.util.Scanner;
public class Statements{
    public static void main(String []args)
    {
        //Conditional Statements - if-else
        // Scanner sc=new Scanner(System.in);
        // int cash = sc.nextInt();
        // if(cash < 10)
        // {
        //     System.out.println("cannot buy anything");
        //     System.out.println("Get More Cash");
        // }
        // else if(cash >= 10 && cash < 50)
        // {
        //     System.out.println("Can get 1 thing");
        // }
        // else{
        //     System.out.println("can get both");
        // }

        //conditional statements - SWITCH
        int day = 3; // 1 - monday, 2- tuesday;
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            
            case 2:
                System.out.println("Tuesday");
                break;
            
            default:
                System.out.println("Wed - Sun");
        }
    }
}