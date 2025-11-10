package Lab_Task_on_Array;


import java.util.Scanner;

public class search {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the target: ");
        int target = input.nextInt();

        for(int i = 0; i < n; i++){
            if(target == arr[i]){
                System.out.print("Target found at: " + i);
                return;
            }
        }
        System.out.print("Target not found!");

        input.close();
    }
}
