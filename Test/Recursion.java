package Test;
import java.util.Scanner;

public class Recursion 
{
    static int fact(int num)
    {
        if(num == 0)
            return 1;
        else
            return(num * fact(num-1));
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scanner.nextInt();
        int facti = fact(num);
        System.out.println("Factorial= "+facti);
    }
}