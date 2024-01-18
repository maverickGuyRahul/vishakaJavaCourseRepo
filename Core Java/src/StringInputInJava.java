import java.util.Scanner;

public class StringInputInJava 
{
    public static void main(String[] args) 
    {
        Scanner inputMessenger = new Scanner(System.in);

        String name;

        System.out.print("Bro, chal naam bataa apna : ");
        name = inputMessenger.nextLine();

        System.out.println("Ye hai aapka naam : " + name);
    }
}
