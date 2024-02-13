package ExceptionHandling;

class RahulException extends Exception {
    public RahulException(String string) {
        super(string);
    }
}

public class ThrowKeyword {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                throw new RahulException("Creating an exception object....");
            }
        } catch (RahulException e) {
            j = 18;
            System.out.println("exception message : " + e.getMessage());
        } catch (ArithmeticException e) {
            j = 18 / 1;
            System.out.println("exception message : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        }

        System.out.println("j : " + j);
        System.out.println("Bye");
    }
}
