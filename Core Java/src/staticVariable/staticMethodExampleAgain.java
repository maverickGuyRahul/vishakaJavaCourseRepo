package staticVariable;

class Interns {
    int ID;
    String name;
    int age;

    static String company = "RainerTech";

    public Interns(int iD, String name, int age) {
        this.ID = iD;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "ID : " + ID + ", name : " + name + ", age : " + age + ", company : "
                + company;
    }

}

public class staticMethodExampleAgain {

}
