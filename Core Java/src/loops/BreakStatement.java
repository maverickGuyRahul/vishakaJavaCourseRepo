package loops;
import java.util.Scanner;

public class BreakStatement 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String idealStatement = "sorry, I will never repeat it again";
        int counter = 3;
        String BF_Ka_Statement;

        while(counter > 0)
        {
            System.out.print("Bolo, kya bolna chaahte ho? : ");
            BF_Ka_Statement = sc.nextLine();

            if (BF_Ka_Statement.equals(idealStatement))
            {
                System.out.println("It's okay, don't repeat it ever again, Baabu...");
                break;
            }

            if(counter == 1)
            {
                System.out.println("BREAKUP ZAALA TYAANCHA....");
            }

            counter--;
        }
    }    
}
