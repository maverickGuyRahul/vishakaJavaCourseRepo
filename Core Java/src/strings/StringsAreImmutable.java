package strings;

public class StringsAreImmutable 
{
    public static void main(String[] args) 
    {
        String name = "Rahul";

        System.out.println("name (before modification): " + name.hashCode());
        
        name = name +  " Trivedi";
        System.out.println("name (after modification): " + name.hashCode());
        // System.out.println(name);

        String fName = "Vishaka";
        String str = "Vishaka";

        System.out.println("fName : " + fName.hashCode() + ", " + "str : " + str.hashCode());
    }
}
