class Overloading2
{
    void num_calc(int num,char ch)
    {
        if(ch=='s')
        {
            int ans =num*num;
            System.out.println("the square is"+ans);
        }
        else
        {
            int ans=num*num*num;
            System.out.println("the cube is"+ans);
        }
    }
    void num_calc(int a,int b,char c)
    {
        if(c=='p')
        {
            int ans=a*b;
            System.out.println("The multiplication is"+ans);
        }
        else
        {
            int ans=a+b;
            System.out.println("the addition is"+ans);
        }
    }
    public static void main()
    {
        Overloading2 obj=new Overloading2();
        obj.num_calc(5,'s');
        obj.num_calc(10,20,'z');
    }
}
