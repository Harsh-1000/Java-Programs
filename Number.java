/*  Create class Number with only one private instance variable as a int primitive type. Initialize it with parameterised constructor and include the following methods  isZero( ), isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), isAmstrong() 
the above methods return boolean primitive type value. 
getFactorial(), getSqrt(), getSqr(), sumDigits()  these methods return int primitive type value.  
dispBinary(), dispOctal(), displayhexa() these method return string value */


class Num
{
    private final int num;

    Num(int num)
    {
        this.num=num;
    }

    public Boolean isPositive()
    {
        return num > 0;
    }

    public Boolean isNegative()
    {
        return num < 0;
    }

    public Boolean isZero()
    {
        return num==0;
    }

    public Boolean isOdd()
    {
        return num % 2 != 0;
    }

    public Boolean isEven()
    {
        return num % 2 == 0;
    }

    public Boolean isPrime()
    {
        int f=0;
        for(int i=1;i<num/2;i++)
            if(num%i==0)
            {
                f=1;
                break;
            }
        return f != 1;
    }

    public Boolean isArmstrong()
    {
        int n=num,r,sum=0;
        while (n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+(r*r*r);
        }

        return sum==num;

    }

    public int getFactorial()
    {
        int f=1;
        for(int i=1;i<=num;i++)
            f=f*i;
        return f;
    }

    public int getSqrt()
    {
        return (int) Math.sqrt(num);
    }

    public int getSqr()
    {
        return num*num;
    }

    public int sumDigits()
    {
        int sum=0,r,n;
        n=num;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum+=r;
        }
        return sum;
    }

    public String displayBinary()
    {
        return Integer.toBinaryString(num);
    }

    public String displayOctal()
    {
        return Integer.toOctalString(num);
    }

    public String displayHexadecimal()
    {
        return Integer.toHexString(num);
    }
}


public class Number {
    public static void main(String[] args) {
        Num n = new Num(3);

        System.out.println("Positive: " +  n.isPositive());
        System.out.println("Negative: "+ n.isNegative());
        System.out.println("Even: " + n.isEven());
        System.out.println("Odd: "+ n.isOdd());
        System.out.println("Prime: " + n.isPrime());
        System.out.println("Armstrong: " + n.isArmstrong());
        System.out.println("Zero: " + n.isZero());
        System.out.println("Factorial: " + n.getFactorial());
        System.out.println("Square root: " + n.getSqrt());
        System.out.println("Square: " + n.getSqr());
        System.out.println("Digits Sum: " + n.sumDigits());
        System.out.println("Binary: " + n.displayBinary());
        System.out.println("Octal: " + n.displayOctal());
        System.out.println("Hexadecimal: " + n.displayHexadecimal());


    }
}
