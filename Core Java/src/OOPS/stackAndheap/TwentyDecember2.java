package OOPS.stackAndheap;

class ArithmeticCalc
{
    int num1;
    int num2;

    public ArithmeticCalc(int NUM1, int NUM2)
    {
        this.num1 = NUM1;
        this.num2 = NUM2;
    }

    public int add(int num1, int num2)
    {
        num1 = this.num1;
        num2 = this.num2;
        int result = num1 + num2;
        return result;
    }
}

public class TwentyDecember2 
{
    public static void main(String[] args) 
    {
        int num1 = 12;
        int num2 = 3;

        ArithmeticCalc obj1 = new ArithmeticCalc(1, 2);

        int result = obj1.add(num1, num2);
        System.out.println(result);
    }
}


