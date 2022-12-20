
public class Sort{
    public static void main(String []args)
    {
        int []sortedArray ={16,10,17,20,5};
        boolean flag=true;
        int temp;
        while(flag)
        {
            flag = false;
            for(int i=0;i<sortedArray.length-1;i++)
            {
                if(sortedArray[i]<sortedArray[i+1])
                {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        for(int i=0;i<sortedArray.length;i++)
        {
            System.out.print(sortedArray[i]+" ");
        }
    }
}