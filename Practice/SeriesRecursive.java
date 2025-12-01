package Practice;

import java.util.Scanner;

/* 
This calculates the sum of a number sequence up to N. You only pass one number (N) to the method.
*/

public class SeriesRecursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;

        System.out.print("\n Enter N => ");

        N = scanner.nextInt(); 

        int TotalSum = sumOfSeries(N);

        System.out.print("\n Sum of Series is => " + TotalSum);

    }

    public static int sumOfSeries(int num) {

        if (num == 1) {
            return 1;
        }

        return num + sumOfSeries(num - 1);
    };

}
