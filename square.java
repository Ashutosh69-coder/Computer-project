class square 
{
    int s,ans;
    void input(int n)
    {
        s=n;
    }
    void calc()
    {
        ans=s*s;
    }
    void display()
    {
        System.out.println("The square of the no is"+ans);
    }
    public static void main()
    {
        square obj=new square();
        obj.input(8);
        obj.calc();
        obj.display();
    }
}