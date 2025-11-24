package Array;

import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {

    /*
     * have to remember these things
     * nextBoolean() Reads a boolean value from the user
     * nextByte() Reads a byte value from the user
     * nextDouble() Reads a double value from the user
     * nextFloat() Reads a float value from the user
     * nextInt() Reads a int value from the user
     * nextLine() Reads a String value from the user
     * nextLong() Reads a long value from the user
     * nextShort() Reads a short value from the user
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sizeOfArr;

        System.out.print("Enter the size of array => ");
        sizeOfArr = scanner.nextInt();

        int[] unsortedArray = new int[sizeOfArr];

        for (int i = 0; i < sizeOfArr; i++) {

            System.out.print("Enter the value for the idx " + i + "  => ");
            unsortedArray[i] = scanner.nextInt();

        }

        System.out.println("THis is the Unsorted Array => " + Arrays.toString(unsortedArray));

        bubbleSort(unsortedArray);

        System.out.println("THis is the Sorted Array => " + Arrays.toString(unsortedArray));

    };

    public static void bubbleSort(int[] unsortedArray) {
        int lengthOfArr = unsortedArray.length;
        int temp;

        for (int i = 0; i < lengthOfArr - 1; i++) {
            for (int j = 0; j < (lengthOfArr - 1) - i; j++) {

                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    temp = unsortedArray[j + 1];
                    unsortedArray[j + 1] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
        }
    }

}
