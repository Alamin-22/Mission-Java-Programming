package Lab_Task_on_Array;

import java.util.Scanner;

public class ascendingOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array => ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element of idx  " + i + " => ");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int min_index = find_min(arr, i, n);

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        System.out.println("Sorted form =>  ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        input.close();
    }

    static int find_min(int[] arr, int i, int n) {
        int index = i;
        int min = arr[i];

        for (int j = i; j < n; j++) {
            if (arr[j] < min) {
                min = arr[j];
                index = j;
            }
        }

        return index;
    }
}