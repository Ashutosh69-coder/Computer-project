import java.util.*;
public class sum_array
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        int a[]= new int[5];
        int i;
        int sum=0;
        System.out.println("Enter 5 number whose sum is to be printed");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("the sum is "+sum);
    }
}