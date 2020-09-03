import java.util.*;
public class sorting
{
    public static void main()
    {
    int a[]=new int[15];
    Scanner sc=new Scanner(System.in);
    int i,j,temp;
    int n=a.length;
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n-i-1;j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    for(i=0;i<n;i++)
    {
        System.out.println(a[i]);
    }
}
}