class Employee
{
   float ts, basesalary;
   void init(float base_salary)
   {
       base_salary=basesalary;
    }
   float salary()
    {
        ts=basesalary+((50/100)*(basesalary));
        return ts;
    }
    void display(String employee)
    {
        System.out.println("the name of employee"+employee);
        System.out.println("the  salary is"+basesalary);
    }
        public void main(String args[])
    {
       Employee obj=new Employee();
       obj.display("Ashutosh");
       obj.init(10000000);
       float x= salary();
       System.out.println("THE TOTAL SALARY IS"+x);
    }
}
       
    
       
    
    