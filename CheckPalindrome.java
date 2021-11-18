/* write a Java program to 
find if the given number is palindrome or not */


import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        new CheckPalindrome().check(s.nextInt());

    }

    public  void check(int num)
    {
        int a =num,r,sum=0;
        while (a>0)
        {
            r=a%10;
            a=a/10;

            sum=sum*10 + r;

        }
        if(sum==num) System.out.println(num + " is palindrome.");
        else
            System.out.println(num + " is not a palindrome.");
    }
}
