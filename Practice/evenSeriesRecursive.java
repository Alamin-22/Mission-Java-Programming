package Practice;

import java.util.Scanner;

public class evenSeriesRecursive {

    public static void main() {

        Scanner scanner = new Scanner(System.in);

        int N;

        System.out.print("\n Enter N => ");

        N = scanner.nextInt();

        if (N % 2 != 0) {
            N = N - 1;
        }

        int SumOfEven = sumOfEvenSeries(N);

        System.out.print("Sum of the Even Series => " + SumOfEven);

    }

    public static int sumOfEvenSeries(int n) {

        if (n <= 2) {
            return 2;
        }
        return n + sumOfEvenSeries(n - 2);
    }

}
