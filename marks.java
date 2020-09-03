class marks
{
    int s1,s2,s3;
    double avg;
    void input(int sub1,int sub2,int sub3)
    {
        s1=sub1;
        s2=sub2;
        s3=sub3;
    }
    void calc()
    {
        avg=(s1+s2+s3)/100;
    }
    void display()
    {
        System.out.println("The average marks are"+avg);
    }
    public static void main()
    {
        marks obj=new marks();
        obj.input(97,98,99);
        obj.calc();
        obj.display();
    }
}
        