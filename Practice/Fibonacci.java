package Practice;

import java.util.Scanner;

/* 
Fibonacci is a Series where each number is the sum of the past 2 number

example : 0 1 1 2 3 5 8 13 21 34
*/

public class Fibonacci {

    public static void main(String[] args) {

        int N;
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n Please enter N => ");
        N = scanner.nextInt();

        int[] FibonacciArray = new int[N]; 

        FibonacciArray[0] = 0;
        FibonacciArray[1] = 1;
        // FibonacciArray[2] = 2;

        for (int i = 2; i < N; i++) {

            int firstPreviousValue = FibonacciArray[i - 2];
            int secondPreviousValue = FibonacciArray[i - 1];

            FibonacciArray[i] = firstPreviousValue + secondPreviousValue;

        }

        System.out.println("Here is the Fibonacci Array");

        for (int item : FibonacciArray) {
            System.out.print(item + " ");
        }

    }
}