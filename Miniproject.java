import java.util.*;
public class Miniproject{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber=0;
        do
        {
            System.out.println("Guess my number : ");
            userNumber=sc.nextInt();

            if(userNumber == myNumber)
            {
                System.out.println("WOOHOO .. Correct Number!!!");
                break;
            } 
            else if(userNumber > myNumber)
            {
                System.out.println("Your number is too large");
            }
            else{
                System.out.println("Your Number is too small");
            }
        }while(userNumber>=0);
        System.out.print("My Number was : ");
        System.out.println(myNumber);

    }
}