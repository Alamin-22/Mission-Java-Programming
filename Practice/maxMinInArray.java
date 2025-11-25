package Practice;

public class maxMinInArray {

    public static void main(String[] args) {

        int[] originalArray = { 10, 20, 30, 40, 50 };

        int max = originalArray[0];
        int min = originalArray[0];

        for (int i = 0; i < originalArray.length; i++) {

            if (originalArray[i] > max) {
                max = originalArray[i];
            }
            if (originalArray[i] < min) {
                min = originalArray[i];
            }

        }

        System.out.println("\n The max value is => " + max);
        System.out.println("The min value is => " + min);

    }

}
