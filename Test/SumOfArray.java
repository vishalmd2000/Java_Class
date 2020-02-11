package Test;

public class SumOfArray 
{
    public static void main(String[] args) 
    {
        int ar[] = {10,11,12,13};
        int sum = 0;
        
        for(int i=0;i<ar.length;i++)
        {
            sum = sum+ar[i];
        }
        System.out.println(sum);
    }
}