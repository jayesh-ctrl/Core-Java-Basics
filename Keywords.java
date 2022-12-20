public class Keywords{
    public static void main(String []args)
    {
        // Break && Continue;
        int i=0;
        while(true)
        {
            //break;
            if(i==3){
                i++;
                continue;
            }
            System.out.println(i);
            i=i+1;
            if(i>5)
            {
                break;
            }
        }
    }
}