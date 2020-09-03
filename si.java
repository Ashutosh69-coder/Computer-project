class si
{
    int p,t;
    double r,ans;
    void init()
    {
        p=2000;
        t=2;
        r=2.5;
    }
    void calc()
    {
        ans=(p*t*r)/100;
    }
    void display()
    {
        System.out.println("The simple interest is"+ans);
    }
    public static void main()
    {
        si obj=new si();
        obj.init();
        obj.calc();
        obj.display();
    }
}
