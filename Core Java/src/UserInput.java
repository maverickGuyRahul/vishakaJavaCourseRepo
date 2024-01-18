import java.util.Scanner;

public class UserInput 
{
    public static void main(String[] args) 
    {
        Scanner inputMessenger = new Scanner(System.in);

        int num;

        System.out.print("Bro, give me an input of a number : ");
        num = inputMessenger.nextInt();

        System.out.println("The number you have entered is : " + num);
    }
}
