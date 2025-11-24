package Practice;

import java.util.Scanner;

/* 
Sum of Series
*/

public class sumOfSeries {

    public static void main(String[] args) {

        int N;
        Scanner scanner = new Scanner(System.in);

        System.out.print(" \n Enter N => ");
        N = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= N; i++) {
            sum += i;
        }

        System.out.println("Sum of the given series is => " + sum);

    };

}