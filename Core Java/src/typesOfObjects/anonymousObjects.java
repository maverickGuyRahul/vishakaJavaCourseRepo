package typesOfObjects;

class Company {
    int ID;
    String name;
    int age;

    static String company;

    static {
        company = "RainerTech";
        System.out.println("code inside the static block");
    }

    public Company(int iD, String name, int age) {
        this.ID = iD;
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("ID : " + ID + ", name : " + name + ", age : " + age + ", company : "
                + company);
    }

}

public class anonymousObjects {
    public static void main(String[] args) {

        new Company(1, "Rahul", 46).show();

    }

}
