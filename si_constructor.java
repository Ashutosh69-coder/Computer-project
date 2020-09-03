class si_constructor
{
    int p,t;
    double r;
    double si;
    si_constructor()
    {
        p=50000;
        t=2;
        r=10;
    }
    void calc()
    {
        si= (p*r*t)/100;
    }
    void display()
    {
        System.out.println("the si is"+si);
    }
    public static void main()
    {
        si_constructor obj=new si_constructor();
        obj.calc();
        obj.display();
    }
}

