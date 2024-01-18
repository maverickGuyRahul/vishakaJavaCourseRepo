package staticVariable;

class Company {
    int ID;
    String name;
    int age;

    static String company = "RainerTech";

    public Company(int iD, String name, int age) {
        this.ID = iD;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "ID : " + ID + ", name : " + name + ", age : " + age + ", company : "
                + company;
    }

    public static void show(Company obj) {
        System.out.println("id = " + obj.ID);
    }

}

public class Example {
    public static void main(String[] args) {

        Company rahul = new Company(1, "Rahul", 46);
        Company Vishaka = new Company(2, "Vishaka", 26);

        Company.company = "Google";
        rahul.name = "Not Rahul";
        // System.out.println(rahul);
        // System.out.println(Vishaka);
        Company.show(rahul);
    }

}
