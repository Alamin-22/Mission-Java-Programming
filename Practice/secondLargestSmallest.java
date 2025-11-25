package Practice;

public class secondLargestSmallest {

    public static void main(String[] args) {

        int[] originalArray = { 10, 20, 30, 40, 50, 5, 45 };

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < originalArray.length; i++) {
            int current = originalArray[i];

            if (current > max) {
                secondMax = max;
                max = current;
            } else if (current > secondMax && current != max) {
                secondMax = current;
            }

            if (current < min) {

                secondMin = min;
                min = current;
            } else if (current < secondMin && current != min) {

                secondMin = current;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Second Max: " + secondMax);
        System.out.println("Min: " + min);
        System.out.println("Second Min: " + secondMin);
    }
}