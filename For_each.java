public class For_each{
    public static void main(String []args)
    {
        float []marks = {98.1f,45.6f,79.4f,99.8f,80.9f};
        System.out.println(marks.length);

        for(float ele:marks)
        {
            System.out.println(ele);
        }
    }
}