//10.	Write two separate programs to generate the following patterns using iteration(loop) statements:
public class Pattern1
{
      public static void main(String args[])
      {
          int k=1;
          for(int i=1;i<=5;i++)
          {
              System.out.print(k++);
             for(int j=1;j<=i;j++)
          {
            if(j%2!=0)
            System.out.print("* ");
            else
            System.out.print("# ");
          }
           System.out.println(" " );
         }
       }
}