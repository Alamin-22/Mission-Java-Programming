package Lab_Task_on_Array;

import java.util.Scanner;

public class smallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array => ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element of idx  " + i + " => ");
            arr[i] = input.nextInt();
        }

        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int secondSmallest = 1000000000;
        for (int i = 1; i < n; i++) {
            if (arr[i] != min && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Second smallest element: " + secondSmallest);

        input.close();
    }
}