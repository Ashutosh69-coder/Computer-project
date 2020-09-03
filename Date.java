class Date
{
    int dd,mm,yy;
    Date()
    {
        dd=0;
        mm=0;
        yy=0;
    }
    Date(int d,int m,int y)
    {
        dd=d;
        mm=m;
        yy=y;
    }
    public static void main()
    {
        Date date=new Date();
        System.out.println(date.dd+"/"+date.mm+"/"+date.yy);
        Date date1= new Date(23,5,20);
        System.out.println(date1.dd+"/"+date1.mm+"/"+date1.yy);
    }
}