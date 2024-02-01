package ArrayListOfObjects;

import java.util.ArrayList;

class Company {
    int srNo;
    String name;
    String designation;

    public Company(int srNo, String name, String designation) {
        this.srNo = srNo;
        this.name = name;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "[srNo = " + srNo + ", name = " + name + ", designation = " + designation + "]";
    }

}

public class Example {

    public static void main(String[] args) {
        Company emp1 = new Company(1, "Rahul", "Jr. Intern");
        Company emp2 = new Company(2, "Vishaka", "CEO");
        Company emp3 = new Company(3, "Sneha", "CTO");

        ArrayList<Company> employees = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        for (Company emp : employees) {
            System.out.println(emp);
        }

    }
}
