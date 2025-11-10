package Lab_Task_on_Array;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = input.nextInt();

        System.out.print("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();

        int[] new_arr = new int[n + 1];

        System.out.print("Enter the element you want to insert: ");
        int to_be_inserted = input.nextInt();

        System.out.print("Enter the position to insert (1 <-> n + 1): ");
        int index = input.nextInt();

        if (index < 1 || index > n + 1) {
            System.out.println("Invalid index.");
            return;
        }

        for (int i = 0; i < index - 1; i++) {
            new_arr[i] = arr[i];
        }

        new_arr[index - 1] = to_be_inserted;

        for (int i = index; i <= n; i++) {
            new_arr[i] = arr[i - 1];
        }

        System.out.println("Old array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("New array: ");
        for (int i = 0; i < n + 1; i++)
            System.out.print(new_arr[i] + " ");
    }
}