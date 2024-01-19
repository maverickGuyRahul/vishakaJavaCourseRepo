package Encapsulation;

import java.util.Scanner;

class Users {
    String username;
    String password;
    private int age;

    public Users(String password, String username) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String providedUsername) {
        this.username = providedUsername;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int providedAge) {
        this.age = providedAge;
    }

}

public class PasswordVerification {
    public static void main(String[] args) {
        Users rahul = new Users("rahul.t03", "rahul@123");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your username : ");
        String usernameFromUser = sc.nextLine();

        System.out.print("Please enter your password : ");
        String passwordFromUser = sc.nextLine();

        if (usernameFromUser.equals(rahul.username) && passwordFromUser.equals(rahul.password)) {
            System.out.print("Please enter new age : ");
            int age = sc.nextInt();
            rahul.setAge(age);
            System.out.println("The age has been updated successfully!!");
        }

    }
}
