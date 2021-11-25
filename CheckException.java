/* Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60.
Display proper error messages.

The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
 (Hint : Create a user defined exception class for handling errors.) */



import java.util.InputMismatchException;


class MyException extends RuntimeException
{
    MyException(String exp)
    {
        super(exp);
    }

}

public class CheckException {
    public static void main(String[] args) {

        try {
            String name = args[0];

            int age = Integer.parseInt(args[1]);
            if(age<18 || age>=60)
                throw new MyException("Age should lie between 18 and 60");

            System.out.println("Name = " + name);
            System.out.println("Age = " + age);

        }

        catch (NumberFormatException | InputMismatchException | ArrayIndexOutOfBoundsException | MyException e)
        {
            System.out.println(e);
        }

    }
}