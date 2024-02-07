package ExceptionHandling;

public class TypesOfExceptions {
    public static void main(String[] args) {
        System.out.println("Hello"); // Normal Statement

        int num = 5;
        int num2 = 3;
        // int result = num / num2; // critical Statements
        int result;

        int arr[] = new int[5];

        try {

            result = num / num2;
            // System.out.println("Something");
            arr[5] = 25;
        } catch (ArithmeticException AEObject) {
            System.out.println("An arithmetic exception has occurred");
        } catch (ArrayIndexOutOfBoundsException obj) {
            System.out.println("Wrong index number has been passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Bye");
    }

}
