package OOPS.ObjectsAndClasses;

class Cars
{
    String model;
    String color;
    int maxSpeed;

    public void showDetails()
    {
        System.out.print("[ ");
        System.out.print(this.model + " : " + this.color + " : " + this.maxSpeed + " kmph ");
        System.out.print("]");
        System.out.print("\n");
    }

    public Cars(String MODEL, String COLOR, int MAXSPEED)
    {
        this.model = MODEL;
        this.color = COLOR;
        this.maxSpeed = MAXSPEED;
    }
}

public class CreatingObjectsAndConstructor 
{
    public static void main(String[] args) 
    {
        Cars VishakaCar = new Cars("Tiago" , "Orange" , 220);
        VishakaCar.showDetails();

        Cars RahulCar = new Cars("Honda City" , "Black", 240);
        RahulCar.showDetails();
        
    }
}


