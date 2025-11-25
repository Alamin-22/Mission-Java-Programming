package Practice;

public class SortInAss {

    public static void main(String[] args) {

        int[] originalArray = { 10, 20, 12, 35, 8, 5, 25 };

        for (int i = 0; i < originalArray.length - 1; i++) {

            for (int j = 0; j < originalArray.length - i - 1; j++) {

                if (originalArray[j] > originalArray[j + 1]) {
                    int temp = originalArray[j];

                    originalArray[j] = originalArray[j + 1];
                    originalArray[j + 1] = temp;

                }

            }

        }

        System.out.println();

        for (int num : originalArray) {
            System.out.print(num + " ");
        }

    }
}