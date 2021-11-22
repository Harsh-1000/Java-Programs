/* Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements and display the result.

Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled */

public class ArraySumException {

    public static void main(String[] args) {

        int sum = 0;

        try
        {
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + sum / args.length);


        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}