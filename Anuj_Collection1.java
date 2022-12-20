import java.util.*;
import java.io.*;
// class Student{
//     String name;
//     int rollNo;

//     public Student(String name,int rollNo)
//     {
//         this.name = name;
//         this.rollNo = rollNo;
//     }

//     public String toString(){
//         return "Student{"+
//             "name= "+name + "," + "rollNo = " +rollNo+"}";
//     }

//     public boolean equals(Object o)
//     {
//         if(this == o) return true;
//         if(o == null || getClass()!=o.getClass()) return false;
//         Student student = (Student) o;
//         return rollNo==student.rollNo;
//     }

//     public int hashCode()
//     {
//         return Objects.hash(rollNo);
//     }

// }

public class Anuj_Collection1
{
    public static void main(String []args)
    {
        // ArrayList<String> studentsName = new ArrayList<>();
        // studentsName.add("Rakesh");

        // System.out.println(studentsName);

        // List<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // System.out.println(list);

        // list.add(4);
        // System.out.println(list);

        // list.add(1,50);
        // System.out.println(list);

        // List<Integer> newList = new ArrayList<>();
        // newList.add(100);
        // newList.add(150);

        // list.addAll(newList);
        // System.out.println(list);

        // // System.out.println(list.get(1));

        // // list.remove(1);
        // // System.out.println(list);

        // // list.remove(Integer.valueOf(100));
        // // System.out.println(list);

        // // list.clear();
        // // System.out.println(list);
        // list.set(2,1000);
        // System.out.println(list);

        // // System.out.println(list.contains(1000));

        // // for(Integer element:list)
        // // {
        // //     System.out.println(element);
        // // }

        // Iterator<Integer> it = list.iterator();

        // while(it.hasNext())
        // {
        //     System.out.println("Iterator: "+it.next());
        // }
        // Stack<String> animals = new Stack<>();
        // animals.push("Dog");
        // animals.push("Elephant");
        // animals.push("Cat");
        // animals.push("Birds");

        // System.out.println(animals);
        // System.out.println(animals.peek());

        // animals.pop();
        //         System.out.println(animals);

        // Queue<Integer> pq=new PriorityQueue<>();
        // pq.offer(12);
        // pq.offer(6);
        // pq.offer(20);
        // pq.offer(10);

        // System.out.println(pq);
        // System.out.println(pq.poll());
        //         System.out.println(pq);
        // System.out.println(pq.peek());

        // Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        // pq.offer(12);
        // pq.offer(6);
        // pq.offer(20);
        // pq.offer(10);

        // System.out.println(pq);
        // System.out.println(pq.poll());
        //         System.out.println(pq);
        // System.out.println(pq.peek());

        // ArrayDeque<Integer> adq = new ArrayDeque<>();
        // adq.offer(23);
        // adq.offerFirst(12);
        // adq.offerLast(45);

        // System.out.println(adq);
        
        // System.out.println(adq.peek());
        // System.out.println(adq.peekFirst());
        // System.out.println(adq.peekLast());

        // System.out.println(adq.poll());
        // System.out.println("poll(): "+adq);

        // System.out.println(adq.pollFirst());
        // System.out.println("pollFirst(): "+adq);

        // System.out.println(adq.pollLast());
        // System.out.println("pollLast(): "+adq);


        // Set<Integer> set = new HashSet<>();
        // set.add(10);
        // set.add(20);
        // set.add(1);
        // set.add(5);
        // set.add(7);
        // set.add(10);
        // System.out.println(set);
        // set.remove(10);
        // System.out.println(set);
        // System.out.println(set.contains(20));

        // System.out.println(set.isEmpty());
        //         System.out.println(set.size());

        // set.clear();

        // System.out.println(set);

        // Set<Integer> set = new TreeSet<>();
        // set.add(10);
        // set.add(20);
        // set.add(1);
        // set.add(5);
        // set.add(7);
        // set.add(10);
        // System.out.println(set);
        // set.remove(10);
        // System.out.println(set);
        // System.out.println(set.contains(20));

        // System.out.println(set.isEmpty());
        //         System.out.println(set.size());

        // Set<Student> studentSet = new HashSet<>();
        // studentSet.add(new Student("Anuj",2));
        // studentSet.add(new Student("Jayesh",4));
        // studentSet.add(new Student("Mahesh",9));

        // studentSet.add(new Student("Satish",2));

        // System.out.println(studentSet);

        // Map<String, Integer> numbers = new HashMap<>();
        // numbers.put("One",1);
        // numbers.put("Two",2);
        // numbers.put("Three",3);

        // if(!numbers.containsKey("Two"))
        // {
        //     numbers.put("Two",23);
        // }

        // numbers.putIfAbsent("Two",23);

        // // numbers.put("Two",23);
        // System.out.println(numbers);

        // // for(Map.Entry<String,Integer> e: numbers.entrySet())
        // // {
        // //     System.out.println(e);
        // //     System.out.println(e.getKey() + " " + e.getValue());
        // // }

        // for(String key : numbers.keySet())
        // {
        //     System.out.println(key);
        // }

        // for(Integer value : numbers.values())
        // {
        //     System.out.println(value);
        // }
        

        // System.out.println(numbers.containsValue(3));

        // Map<String, Integer> numbers = new TreeMap<>();
        // numbers.put("One",1);
        // numbers.put("Two",2);
        // numbers.put("Three",3);

        // System.out.println(numbers);

        // numbers.remove("Three");
        // System.out.println(numbers);

        // int a[] = {1,2,3,4,5,6,7,8};
        // int index = Arrays.binarySearch(a,4);
        // System.out.println(index);


        // int arr[] = {12,21,11,22,31,45,2,5};
        // Arrays.sort(arr);

        // System.out.println(Arrays.toString(arr));

        // Arrays.fill(arr,12);

        // System.out.println(Arrays.toString(arr));

        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(11);
        list.add(34);
        list.add(12);
        list.add(90);
        list.add(90);
        list.add(90);


        System.out.println("Min Element:- "+ java.util.Collections.min(list));
        System.out.println("Max Element:- "+ java.util.Collections.max(list));

        System.out.println("90 Element:- "+ java.util.Collections.frequency(list,90));

        java.util.Collections.sort(list);
        java.util.Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);
    }
}