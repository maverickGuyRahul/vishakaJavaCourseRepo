package strings;
import java.lang.String; // All the classes inside the 'java.lang' package get imported by default in  the background.

public class charAtMethod 
{
    public static void main(String[] args) 
    {
        String str = new String("VISHAKA IS AN AUTOMATION TESTER");
        //  String str = "RAHUL";
        String revStr = "";
        // System.out.println(revStr);

        for (int index = (str.length() - 1); index >= 0; index--) 
        {
            revStr = revStr + str.charAt(index);    
        }

        System.out.println(revStr);
    }
}
