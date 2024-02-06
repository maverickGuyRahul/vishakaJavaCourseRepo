package EnumsTutorial;

enum Drinks {
    SODA(30),
    WATER(20),
    JUICE(90),
    VODKA(300),
    WINE(1400),
    WHITERUM(600),
    WHISKEY(1700),
    GIN(400),
    BOURBON(2400),
    CHILLEDBEAR();

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    private Drinks(int PRICE) {
        this.price = PRICE;
    }

    private Drinks() {
        this.price = 0;
    }
}

public class example {
    public static void main(String[] args) {
        Drinks myFavDrink = Drinks.VODKA;
        System.out.println("My favourite drink costs : " + myFavDrink.getPrice() + " INR");

        // System.out.println(Drinks.values());
        for (Drinks drink : Drinks.values()) {
            System.out.println(drink + " : " + drink.getPrice());
        }
    }
}
