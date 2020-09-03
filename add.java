class add
{
    int n1,n2,ans;
    void init(int num1,int num2)
    {
        n1=num1;
        n2=num2;
    }
    int calc()
    {
        ans=n1+n2;
        return ans;
    }
    public static void main()
    {
        add obj=new add();
        obj.init(5,10);
        int x=obj.calc();
        System.out.println("The addition is"+x);
    }
}