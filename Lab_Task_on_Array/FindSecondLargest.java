package Lab_Task_on_Array;

import java.util.Arrays;

public class FindSecondLargest {

    public static void main(String[] args) {

        int[] numbers = { 45, 12, 89, 2, 3, 22 };

        if (numbers.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            int currentNumber = numbers[i];

            if (currentNumber > largest) {
                secondLargest = largest;
                largest = currentNumber;

            }

            else if (currentNumber > secondLargest && currentNumber != largest) {
                secondLargest = currentNumber;
            }
        }

        System.out.println("Array: " + Arrays.toString(numbers));

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element (e.g., all elements are the same).");
        } else {
            System.out.println("Largest element: " + largest);
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}