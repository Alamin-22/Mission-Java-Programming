package Practice;

import java.util.Scanner;

public class factorial {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int N;

        System.out.print(" \n Enter the number of N => ");
        N = scanner.nextInt();

        int factResult = 1;

        for (int i = 1; i <= N; i++) {
            factResult *= i;
        }

        System.out.println("The Factorial of " + N + " is => " + factResult);

    };
}