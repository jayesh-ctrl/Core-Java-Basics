import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    int marks;
    String name;

    public Student(int marks,String name)
    {
        this.marks = marks;
        this.name = name;
    }

    public String toString(){
        return "Student [marks=" + marks + ", name= " +name+"]";
    }

    public int getMarks(){
        return marks;
    }

    public void setMarks(int marks)
    {
        this.marks = marks;
    }
    public String getName(){
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    // @Override
    // public int compareTo(Student obj) {
    //     // TODO Auto-generated method stub
    //     if(this.marks > obj.marks) return -1;
    //     else if(this.marks < obj.marks) return 1;
    //     return 0;
    // }
}

class SortByNameThenMarks implements Comparator<Student>{

    // @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        if(o1.name.equals(o2.name))
        {
            return o1.marks - o2.marks;
        }
        else{
            return o1.name.compareTo(o2.name);
        }
    }
    
}

public class Anuj_comparable {
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();
        students.add(new Student(23,"Ram"));
        students.add(new Student(35, "Rohit"));
        students.add(new Student(83, "Aman"));
        students.add(new Student(13, "Rohit"));
        students.add(new Student(65, "Anuj"));

        java.util.Collections.sort(students,new SortByNameThenMarks());
        students.forEach(System.out::println);

    }
}
