package switchcase;
import java.util.Scanner;

public class FirstProgram
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Please give me a number input : ");
        num = sc.nextInt();

        switch (num)
        {
            case 1: 
                    System.out.println("The day is Monday");
                    break;
            case 2: 
                    System.out.println("The day is Tuesday");
                    break;
            case 3:
                    System.out.println("The day is Wednesday");
                    break;

            case 4:
                    System.out.println("The day is Thursday");
                    break;

            case 5:
                    System.out.println("The day is Friday");
                    break;

            case 6:
                    System.out.println("The day is Saturday");
                    break;

            case 7:
                    System.out.println("The day is Sunday");
                    break;
            default:
                   System.out.println("INVALID INPUT");
                   break;
        }

        System.out.println("CODE OUTSIDE SWITCH CASE");
    }
}

