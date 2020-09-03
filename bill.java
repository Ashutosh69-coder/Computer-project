import java.util.*;
class bill
{
    double bill;
    int usage;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        int mins=0;
        System.out.println("Enter internet usage(in mins)");
        mins=sc.nextInt();
        usage=bill;
    }
    void calc()
    {
        if(usage>0 && usage<=60)
        {
            