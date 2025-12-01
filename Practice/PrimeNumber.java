package Practice;

import java.util.Scanner;

/* 
Find Prime number from 1 to N
A prime number is a number which is not divisible by any other number except 1 and that number itself.
*/

public class PrimeNumber {

    public static void main(String[] args) {

        int N;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n Enter the N => ");

        N = scanner.nextInt();

        int[] primeNumbers = new int[N];
        int count = 0;

        for (int i = 1; i < N; i++) {

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;    
                    break;
                }

            }

            if (isPrime) {
                primeNumbers[count] = i;
                count++;
            }

        }

        System.out.println("these are the list of all prime number form 1 to " + N);
        for (int k = 0; k < count; k++) {
            System.out.print(primeNumbers[k] + " ");
        }

    }

}
