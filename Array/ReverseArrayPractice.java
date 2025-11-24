package Array;

import java.util.Arrays;

public class ReverseArrayPractice {
    public static void main(String[] args) {

        int[] originalArray = { 10, 20, 30, 40, 50, 60, 70 };

        System.out.println("This is the original Array" + Arrays.toString(originalArray));
        int length = originalArray.length;
        int temp;
        int[] reversedArrUsingMethod2 = reverseArray(originalArray);
        // Method 1
        for (int i = 0; i < length / 2; i++) {
            int lastIdx = ((length - i) - 1);
            temp = originalArray[i]; // setting the current idx value into the temp variable
            originalArray[i] = originalArray[lastIdx];
            originalArray[lastIdx] = temp;
        }

        System.out
                .println("This is the reversed array created manually Method 1  => " + Arrays.toString(originalArray));
        System.out.println(
                "This is the reversed array created manually method 2  => " + Arrays.toString(reversedArrUsingMethod2));
        ;

    }

    public static int[] reverseArray(int[] numbers) {

        int length = numbers.length;

        int[] newReversedArr = new int[length]; // basically creating a new empty array.
        /*
         * Here the logic is simple we set the first idx value into the last idx of new
         * array though this is not memory efficient
         */

        for (int i = 0; i < length; i++) {
            int lastIdx = ((length - i) - 1);
            newReversedArr[lastIdx] = numbers[i];
        }

        return newReversedArr;

    }

}
