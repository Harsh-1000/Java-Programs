/* Write a program by creating an 'Employee' class having the following methods and print the final salary.

1 - 'getInfo()' which takes the salary, number of hours of work per day of the employee as parameter
2 - 'AddSal()' which adds $10 to the salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to the salary of the employee if the number of hours of work per day is more than 6 hours. */


class EmployeeInfo
{
    private final String name;
    private  float salary;
    private final float hrs;

    EmployeeInfo()
    {
        name="Null";
        salary=0.0f;
        hrs=0.0f;
    }

    EmployeeInfo(String name, float salary, float hrs)
    {
        this.name = name;
        this.salary=salary;
        this.hrs=hrs;
        AddSal( salary);
        AddWork(hrs);
    }

    private void AddSal(float salary)
    {
        if(salary<500)
            this.salary+=10;
    }

    private void AddWork(float hrs)
    {
        if(hrs>6)
            this.salary+=5;
    }

    public void getInfo()
    {
        System.out.println(name);
        System.out.println(salary);
        System.out.println(hrs);
    }
}


public class Employee {
    public static void main(String[] args) {
        EmployeeInfo e = new EmployeeInfo("Ram",400.0f,9.3f);
        e.getInfo();
    }
}
