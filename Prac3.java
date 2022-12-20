import java.util.*;
import java.io.*;

public class Prac3{
    public static void main(String []args)
    {
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray= "+Arrays.toString(myIntArray));
        System.out.println("anotherArray= "+Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("After Change myIntArray= "+Arrays.toString(myIntArray));
        System.out.println("After change anotherArray= "+Arrays.toString(anotherArray));


        anotherArray = new int[]{4,5,6,7,8};
        
        modifyArray(myIntArray);

        System.out.println("After modify myIntArray= "+Arrays.toString(myIntArray));
        System.out.println("After Modify anotherArray= "+Arrays.toString(anotherArray));

    }
    public static void modifyArray(int[] array)
    {
        array[1]=2;

        array = new int[] {1,2,3,4,5};
        System.out.println("New Array= "+Arrays.toString(array));
        // System.out.println("anotherArray= "+Arrays.toString(anotherArray));

    }
}