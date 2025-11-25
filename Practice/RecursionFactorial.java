package Practice;

import java.util.Scanner;

public class RecursionFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;

        System.out.print("\n Enter N to find out Factorial Using Recursion => ");

        N = scanner.nextInt();

        int factResult = factorial(N);

        System.out.print("\n Factorial is =>  " + factResult);

    }

    public static int factorial(int num) {

        if (num == 1) {
            return 1;
        }

        return num * factorial(num - 1);
    };

}
