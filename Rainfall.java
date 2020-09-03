class Rainfall
{
    double ap,may,ju,avg;
    Rainfall()
    {
        ap=15;
        may=10;
        ju=23;
    }
    void calc()
    {
        avg=(ap+may+ju)/3.0;
    }
    void display()
    {
        System.out.println("Rainfall in April"+"\t"+ap);
        System.out.println("Rainfall in May"+"\t"+may);
        System.out.println("Rainfall in June"+"\t"+ju);
        System.out.println("Average Rainfall"+"\t"+avg);
    }
    public static void main()
    {
        Rainfall obj=new Rainfall();
        obj.calc();
        obj.display();
    }
}