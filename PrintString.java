/* Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed. If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
For example, while creating object if we pass "Java", then "I love Java" should be printed. */

class Programming
{
    Programming()
    {
        System.out.println("I love programming languages");
    }

    Programming(String str)
    {
        System.out.println("I Love " + str);
    }


}

public class PrintString {
    public static void main(String[] args) {
        Programming p1 = new Programming();
        Programming p2 = new Programming("Java");
    }
}
