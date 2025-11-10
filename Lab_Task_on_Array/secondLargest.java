package Lab_Task_on_Array;

import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array => ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element of idx  " + i + " => ");
            arr[i] = input.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int secondLargest = -1000000000;
        for (int i = 1; i < n; i++) {
            if (arr[i] != max && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second secondLargest element =>  " + secondLargest);

        input.close();
    }
}