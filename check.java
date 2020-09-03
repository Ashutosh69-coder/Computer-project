class check
{
    public static void main(char a)
    {
        if(((a>='A')&&(a<='Z'))&&((a>='a')&&(a<='z')))
        {
            System.out.println("The entered character is alphabet");
        }
        else if((a>='0')&&(a<=9))
        {
            System.out.println("The entered character is digit");
        }
        else
        {
            System.out.println("It is a special character");
        }
    }
}