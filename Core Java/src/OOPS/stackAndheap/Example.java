package OOPS.stackAndheap;

class Cars
{
    String model;
    float price;
}

public class Example 
{
    public static void main(String[] args) 
    {
        int a = 10;
        
        Cars VishakaCar = new Cars();
        VishakaCar.model = "Tiago XZ";
        VishakaCar.price = 8_00_000f;
        System.out.println(VishakaCar.price);

        System.out.println(VishakaCar.hashCode());
    }    
}
