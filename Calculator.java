/* Create a new class called Calculator with the following methods: 
1. A static method called powerInt(int num1,int num2)
This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power. */

class Power
{
    static int power(int num1, int num2)
    {
        return (int) Math.pow(num1,num2);
    }

    static  double power(double num1,int num2)
    {
        return Math.pow(num1,num2);
    }
}


public class Calculator {
    public static void main(String[] args) {
        int value;
        double value1;

        value = Power.power(2,2);
        value1 = Power.power(2.3,5);

        System.out.println("Value: " + value);
        System.out.println("Value1: " + value1);

    }
}
