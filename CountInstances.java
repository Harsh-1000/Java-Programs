/* Design a java program to display the number of 
instances created so far of a specific class. */

class Test
{
    static  private int count=0;
    private int num;
    Test()
    {
        num=0;
        count++;
    }

    void setNum(int num)
    {
        this.num = num;

    }

    void getNum()
    {
        System.out.println("NUM : "+ num);
    }

    static void getCount()
    {
        System.out.println("No. of instance created: "+ count);
    }

}

public class CountInstances {
    public static void main(String[] args) {
        Test t = new Test();
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        Test t4 = new Test();
        Test.getCount();
    }

}
