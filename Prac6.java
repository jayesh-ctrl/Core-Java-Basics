import java.util.*;
public class Prac6
{
    private static Scanner s=new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String []args)
    {
        System.out.println("Enter 10 Integers: ");
        getInput();
        printArray(baseData);
        resizeArray();
        // System.out.println("Enter 12 integers: ");
        // getInput();
        baseData[10]=67;
        baseData[11]=34;
        printArray(baseData);
    }
    private static void getInput()
    {
        for(int i=0;i<baseData.length;i++)
        {
            baseData[i] = s.nextInt();
        }
    }

    private static void resizeArray()
    {
        int[] original = baseData;

        baseData = new int[12];

        for(int i=0;i<original.length;i++)
        {
            baseData[i] = original[i];
        }
    }

    private static void printArray(int[] baseData)
    {
        System.out.println("Array:- "+Arrays.toString(baseData));

    }
}