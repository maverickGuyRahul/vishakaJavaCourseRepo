package loops;

public class whileLoop 
{
    public static void main(String[] args) 
    {
        int num = 1;
        
        while(num < 11)
        {
            System.out.println("IT'S A SUNNY DAY");
            num = num + 1;
            // num += 1;
            // num++;
        }

        System.out.println("OUTSIDE THE WHILE LOOP");
    }
}
