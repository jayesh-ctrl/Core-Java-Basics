// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Iterator;
import java.util.*;
import java.io.*;

// import javax.sound.sampled.SourceDataLine;
// import javax.xml.validation.Validator;

// class Container<T extends Number>
// {
//     T value;

//     public T getValue()
//     {
//         return value;
//     }

//     public void setValue(T value)
//     {
//         this.value = value;
//     }
//     public void show()
//     {
//         System.out.println(value.getClass().getName());
//     }
//     public void demo(ArrayList<? extends T> obj)
//     {
//         ;
//     }
//     // public void demo(ArrayList<? super T> obj)
//     // {
//     //     ;
//     // }
// }

// class ComImp implements Comparator<Integer>{
//     public int compare(Integer o1,Integer o2)
//     {
//         if(o1 > o2) return 1;
//         return -1;
//     }
// }

public class Generics2 {
    public static void main(String[] args) {
        // Container<Number> obj = new Container<>();
        
        // obj.show();

        // obj.demo(new ArrayList<Integer>());

        // obj.demo(new ArrayList<>());

        // List<Integer> values = new ArrayList<Integer>();
        // values.add(10);
        // values.add(11);
        // values.add(12);
        // values.add(20);
        // values.add(23);

        // Collections.sort(values);
        // values.add("Jayesh");
        // values.add(12.23);

        // Iterator i=values.iterator();
        // System.out.println(i.next());
        // System.out.println(i.next());

        // values.forEach(System.out::println); // stream API ... Lambda Expressions;

        // for(int i : values)
        // {
        //     System.out.println(i);
        // }

        // Vector<Integer> v = new Vector<Integer>();   // it will increase the capacity 100% // threadSafe  // slow
        // v.add(12);
        // v.add(23);
        // v.add(34);

        // System.out.println(v.capacity());

        // for(int i : v);
        // {
        //     System.out.println(i);
        // }

        ArrayList<Integer> v=new ArrayList<>();  // it will increase the capacity 50% // not threadSafe // fast
        v.add(12);
        v.add(15);
        v.add(1);
        v.add(2);
        v.add(4);

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer o1,Integer o2)
            {
                if(o1 > o2) return 1;
                return -1;
            }
        };
        java.util.Collections.sort(v,com);
        // java.util.Collections.reverse(v);

        for(int i:v)
        {
            System.out.println(i);
        }



    }
}
