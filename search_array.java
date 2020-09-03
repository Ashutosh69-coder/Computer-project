import java.util.*;
class search_array
{
    public static void main()
    {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int i,f=0,search;
        System.out.println("enter elements");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the no to be searched");
        search=sc.nextInt();
        for(i=0;i<5;i++)
        {
            if(search==a[i])
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("the position of no is "+(i+1));
        }
        else
        {
            System.out.println("wrong choice");
        }
    }
}
            
              