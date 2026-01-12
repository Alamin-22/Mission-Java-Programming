package Final;

public class exceptionHandling {

    public static void main(String[] args) {

        try {
            int data = 50 / 0;

            System.out.println(data);
            System.out.println("This won't run");
        } catch (ArithmeticException e) {
            // Handling the error
            System.out.println("Error: You cannot divide by Zero!");
        } finally {
            // This runs no matter what
            System.out.println("Process Finished.");
        }

    }
}
