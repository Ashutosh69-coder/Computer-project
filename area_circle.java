class area_circle
{
    double r,pi,ans;
    area_circle()
    {
        r=10;
        pi=22/7;
    }
    void calc()
    {
        ans=pi*r*r;
    }
    void display()
    {
        System.out.println("the area of the circle is"+ans);
    }
    public static void main()
    {
        area_circle obj=new area_circle();
        obj.calc();
        obj.display();
    }
}
