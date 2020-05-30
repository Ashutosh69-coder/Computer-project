// program to calculate the maturity value of a bank deposit based on the option the user enters

import java.util.Scanner;

public class BankDeposit
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your choice");
        System.out.println("enter 1 for term deposit");
        System.out.println("enter 2 for Reccuring deposit");
        int x=sc.nextInt();
        switch(x)
        {
            case 1:
            System.out.println("enter principle");
            int p=sc.nextInt();
            System.out.println("enter rate of interest");
            int r= sc.nextInt();
            System.out.println("enter the number of years");
            int n=sc.nextInt();
            double amount=(p*(Math.pow((1+(r/100)),n)));
            System.out.println("The maturity value is "+amount);
            break;
            case 2:
            System.out.println("enter the amount monthly installments");
            int m=sc.nextInt();
            System.out.println("enter the rate of Interest");
            int R=sc.nextInt();
            System.out.println("enter the time period in months");
            int N=sc.nextInt();
            double Amount=((m*N)+(m*(N*(N+1)/(2*12))*(R/100)));
            System.out.println("the maturity value is " + Amount);
            break;
            default:
            System.out.println("Error!!!!You can only enter 1 or 2");
        }
    }
}