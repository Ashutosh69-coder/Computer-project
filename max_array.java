import java.util.*;
class max_array
{
    public static void main()
    {
    int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    int i;
    int max=0;
    System.out.println("Enter the elements");
    for(i=0;i<5;i++)
    {
        a[i]=sc.nextInt();
    }
    for(i=0;i<5;i++)
    {
        if(max<a[i])
        {
            max=a[i];
        }
    }
    System.out.println("the maximum no is "+max);
}
}

   