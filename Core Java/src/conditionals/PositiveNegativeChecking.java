package conditionals;

public class PositiveNegativeChecking 
{
    public static void main(String[] args) 
    {
        int num = -13;

        if (num > 0)
        {
            System.out.println("Positive number hai");
        }
        else if (num == 0)
        {
            System.out.println("Neutral Number hai");
        }
        else
        {
            System.out.println("Negative Number hai");
        }
    }    
}
