
import java.util.Arrays;
public class Types{
    public static void main(String[] args)
    {
        //Primitive Types
        //byte - 1 [-128 to 127]
        //short - 2
        // int - 4
        // long - 8
        //float - 4
        //double - 8
        //char - 2
        // boolean - 1 true/false
        byte age =30;
        int phone = 1234567890;
        long phone2 = 12345678900L;
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = true;

        // Non-Primitive types
        String name = "Jayesh";
        String name2 = new String("Jayesh");
        String friend = new String("Mahesh");
        System.out.println(name.length());

        //concatenate
        String name3 = "Jai";
        String name4 = "Mahesh";
        String new_Name = name3 + name4;
        System.out.println(new_Name);

        //charAt
        String name5 = "Meghraj";
        System.out.println(name5.charAt(0));

        //Replace
        String dum = name.replace('a','b');
        System.out.println(dum);
        System.out.println(name);


        // substring
        String sample_string  = "Jayesh and Mahesh";
        System.out.println(sample_string.substring(0,6)); // output:- Jayesh
        

        // Arrays:
        // int[] marks = new int[3];

        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 99;
        // System.out.println(marks);
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // boolean[] marks = new boolean[3];
        // // marks[0] = 97;
        // // marks[1] = 98;
        // // marks[2] = 99;
        // System.out.println(marks);
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // int[] marks = new int[3];

        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 99;
        // System.out.println(marks.length);

        // //sort
        // Arrays.sort(marks);
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        
        //direct assign the elements in array
        int[] marks={97,98,95};


        // 2-D Arrays
        int[][] finalMarks = {{97,98,95},{95,95,98}};
        System.out.println(finalMarks[0][0]);
        

    }
}