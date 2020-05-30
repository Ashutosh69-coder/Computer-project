//5.5.	Write a program to generate the patterns till n terms based upon the user’s choice of triangle to be displayed.                                             
public class pattern
{
    public static void main(int n)
    {
        int i,j,a,b;
        char k='a';
       for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        for(a=1;a<=n;a++)
        {
            for(b=1;b>=i;b--)
            {
                System.out.print(k++);
            }
            System.out.println(" ");
        }
    }
}
                
    
