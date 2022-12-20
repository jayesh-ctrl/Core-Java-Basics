
public class Operators{
    public static void main(String[] args)
    {
        //operators
        int a=1;
        int b=2;
        int sum = a+b;
        int diff = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;

        int num = 1;
        num++;
        ++num;
        num--;
        --num;
        System.out.println(num);


        //Maths
        //5 ,6
        System.out.println(Math.max(5,6));
        System.out.println(Math.min(5,6));

        //random
        System.out.println((int)(Math.random()*100));
    }
}