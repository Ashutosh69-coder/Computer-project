class Overloading
{
    void prnsqr(int i)
    {
        System.out.println("Integer"+i+"square is"+i*i);
    }
    void prnsqr(char c)
    {
        System.out.println(c+"is a character thus no square");
    }
    void prnsqr(float f)
    {
        System.out.println("Float"+f+"square is"+f*f);
    }
    void prnsqr(double d)
    {
        System.out.println("Double"+d+"square is"+d*d);
    }
    public static void main()
    {
        Overloading obj=new Overloading();
        obj.prnsqr(5);
        obj.prnsqr('x');
        obj.prnsqr(3.5f);
        obj.prnsqr(27.0);
    }
}