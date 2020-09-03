class Library
{
    int acc_num;
    String author,title;
    void input(int ac,String a,String t)
    {
        acc_num=ac;
        author=a;
        title=t;
    }
    void compute(int days)
    {
        int total=days*2;
        System.out.println("The fine is"+total);
    }
    void display()
    {
        System.out.println("Accession number \t Title \t Author");
        System.out.println(acc_num+"\t"+ title+"\t"+author);
    }
    public static void main()
    {
        Library obj=new Library();
        obj.input(3654,"Roald Dahl","TELIVISION");
        obj.compute(20);
        obj.display();
    }
}
        
        
        