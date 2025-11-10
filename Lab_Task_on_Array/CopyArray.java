package Lab_Task_on_Array;

import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {

        int[] originalArray = { 10, 20, 30, 40, 50 };

        int[] copiedArray2 = Arrays.copyOf(originalArray, originalArray.length);

        System.out.println("Original Array => " + Arrays.toString(originalArray));
        System.out.println("Copied Array =>    " + Arrays.toString(copiedArray2));

    }
}