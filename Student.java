//7.Write a program to show stream according to the percent
import java .util.*;
public class Student
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name=sc.nextLine();
        System.out.println("Please enter your roll number:");
        int roll=sc.nextInt();
        System.out.println("Please enter the mark of five subjects one by one out of 100");
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        int sub4=sc.nextInt();
        int sub5=sc.nextInt();
        double per=((sub1+sub2+sub3+sub4+sub5)/500)*100;
        if(per>=90)
        {
            System.out.println("The stream assigned for you is Science with Computers");
        }
        else if(per>=80 && per<89)
        {
            System.out.println("The stream assigned for you is Science without Computers");
        }
        else if(per>=70 && per<79)
        {
            System.out.println("The stream assigned for you is Commerce with Maths");
        }
        else 
        {
            System.out.println("The stream assigned for you is Commerce without Maths");
        }
    }
}